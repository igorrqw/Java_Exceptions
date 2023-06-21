package Homework3;

public class GenderException extends RuntimeException {
    public GenderException() {
        super("Введите корректное значение пола! Образец: m-муж, f-жен");
    }
}
