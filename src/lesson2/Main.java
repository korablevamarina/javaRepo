package lesson2;

public class Main {

    public void method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) throw new MyArraySizeException();
        for (String[] str : arr) {
            if (str.length != 4) throw new MyArraySizeException();
        }

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException nfe) {
                    throw new MyArrayDataException(i, j, arr[i][j]);
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String[][] str1 = {
                {"1","2","3","4"},
                {"1","1","2","2"},
                {"1","2","3","4"},
                {"1","1","2","2"}
        };

        String[][] str2 = {
                {"1","2","3","4"},
                {"1","1","2"},
                {"1","2","3","4"},
                {"1","1","2","2"}
        };

        String[][] str3 = {
                {"1","2","3","4"},
                {"1","1","asd","2"},
                {"1","2","3","4"},
                {"1","1","2","2"}
        };

        Main m = new Main();
        try {
            m.method(str1);
            m.method(str2);
        } catch (MyArraySizeException e) {
            System.err.println("Wrong size");
        } catch (MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            m.method(str3);
        } catch (MyArraySizeException e) {
            System.err.println("Wrong size");
        } catch (MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

    }
}

class MyArraySizeException extends Exception {
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j, String s) {
        super("Wrong data in [" + i + ", " + j + "] = '" + s + "'");
    }
}
