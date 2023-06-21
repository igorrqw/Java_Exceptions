package Homework3;

public class Human {
    String surname;
    String name;
    String lastname;
    String dateOfBirthday;
    String tel;
    String sex;

    public Human() {
    }

    public Human(String surname, String name, String lastname, String dateOfBirthday, String tel, String sex) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirthday = dateOfBirthday;
        this.tel = tel;
        this.sex = sex;
    }

    public boolean isCorrectInputByCount(String str) {
        String[] arr = str.split(" ");
        if (arr.length != 6) {
            throw new RuntimeException("Данные введены неверно! Строка должна содержать: Фамилию, Имя, Отчество, дату рождения dd.mm.yyyy, номер телефона, пол - f/m " +
                    " Вы ввели следующие данные: \n" + str);
        }
        return true;
    }

    public String getSurname(String[] arr) {
        String surname = arr[0];
        return surname;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + lastname + " " + dateOfBirthday + " " + tel + " " + sex;
    }
}
