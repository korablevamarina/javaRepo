package com.lesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static final String FILENAME = "data.csv";
    public static final String DELIMITER = ";";

    public static void main(String[] args) {
        AppData data = createData();
        writeToFile(data);
        AppData data2 = readFromFile();
        System.out.println(getString(data2));
    }

    public static AppData createData() {
        AppData data = new AppData();
        data.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        data.setData(new int[][]{
                {100, 200, 123},
                {300, 400, 500}
        });
        return data;
    }

    public static void writeToFile(AppData data) {
        try (FileOutputStream fos = new FileOutputStream(FILENAME)) {
            byte[] buffer = getString(data).getBytes(StandardCharsets.UTF_8);
            fos.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData readFromFile() {
        try (FileInputStream fin = new FileInputStream(FILENAME)) {
            byte[] buf = fin.readAllBytes();
            String str = new String(buf, StandardCharsets.UTF_8);
            return new AppData(str, DELIMITER);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getString(AppData data) {
        StringBuilder builder = new StringBuilder();
        for (String str : data.getHeader()) {
            builder.append(str).append(DELIMITER);
        }
        builder.append('\n');
        for (int[] d : data.getData()) {
            for (int num : d) {
                builder.append(num).append(DELIMITER);
            }
            builder.append('\n');
        }
        return builder.toString();
    }
}
