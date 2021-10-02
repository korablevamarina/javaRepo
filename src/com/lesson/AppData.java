package com.lesson;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public AppData(String str, String delimeter) {
        String[] s = str.split("\n");
        header = s[0].split(delimeter);
        data = new int[s.length - 1][];
        for (int i = 1; i < s.length; i++) {
            String[] s2 = s[i].split(delimeter);
            data[i - 1] = new int[s2.length];
            for (int j = 0; j < s2.length; j++) {
                data[i - 1][j] = Integer.parseInt(s2[j]);
            }
        }
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }
}
