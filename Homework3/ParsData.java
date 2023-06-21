package Homework3;

import java.util.Scanner;

public class ParsData {
    
    public String getInfoAboutHuman() {
        boolean flag = true;
        String str = "";
        while (flag) {
            System.out.println("Введите данные пользователя в виде строки, отделяйте слова пробелом" +
                    "\n Обрацец: Фамилия Имя Отчество dd.mm.yyyy 89536545178 пол(m-муж, f-жен)");
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();

            try {
                isCorrectInputByCount(str);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }

            if (getLength(parse(str)) != 6) {
                flag = true;
            } else flag = false;
        }
        return str;
    }

    public String[] parse(String str) {
        String[] arr = str.split(" ");
        return arr;
    }

    private int getLength(String[] arr) {
        return arr.length;
    }

    private void isCorrectInputByCount(String str) {
        if (getLength(parse(str)) != 6) throw new RuntimeException("Невернное количество слов. Требуемый " +
                "формат ввода: Фамилия Имя Отчество dd.mm.yyyy 89536545178 пол(m-муж, f-жен).\nПроверьте свои данные: " + str);

    }
}
