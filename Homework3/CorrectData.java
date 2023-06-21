package Homework3;

public class CorrectData {

    public boolean correctDate(String[] str) {
        String[] array = null;
        String date = str[3];

        if (date.contains(".")) {
            array = date.split("\\.");
        } else throw new DateException();

        if (array.length != 3) {
            throw new DateException();
        }
        for (String el : array) {
            if (!digit(el)) throw new DateException();
        }
        return true;
    }

    private static boolean digit(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public boolean correctTel(String[] str) {
        String tel = str[4];
        if (!isLong(tel)) throw new PhoneException();
        return true;
    }

    private static boolean isLong(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean correctSex(String[] str) {
        String sex = str[5];
        if (sex.equals("f") | sex.equals("m")) return true;
        else throw new GenderException();
    }
}
