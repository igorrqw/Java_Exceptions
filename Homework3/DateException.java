package Homework3;

public class DateException extends RuntimeException {
    public DateException() {
        super("Введите корректную дату! Образец: дд.мм.гггг");
    }
}
