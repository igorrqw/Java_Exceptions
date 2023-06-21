package Homework3;

public class PhoneException extends RuntimeException{
    public PhoneException() {
        super("Некорректно ввели номер телефона! Образец: 89284448300");
    }
}
