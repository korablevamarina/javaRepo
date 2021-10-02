package com.lesson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static final String FILENAME = "data.csv";
    public static final char DELIMITER = ';';

    public static void main(String[] args) {
        AppData data = creatData();
        writeToFile(data);
    }

    public static AppData creatData() {
        AppData data = new AppData();
        data.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        data.setData(new int[][]{{100, 200, 123}, {300, 400, 500}});
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
