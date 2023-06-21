package Homework3;

public class Main {
    public static void main(String[] args) {

            ParsData data = new ParsData();
            Human human = new Human();
            String[] info = null;
            CorrectData cd = new CorrectData();
            try {
                info = data.parse(data.getInfoAboutHuman());
                cd.correctDate(info);
                cd.correctTel(info);
                cd.correctSex(info);
                human = new Human(info[0], info[1], info[2], info[3], info[4], info[5]);
                WriterFile writerToFile = new WriterFile();
                writerToFile.writeToFile(human.toString(), info[0]);
            } catch (DateException | GenderException | PhoneException e) {
                e.printStackTrace();
            } catch (RuntimeException e) {
                System.err.println("Ошибка записи!!!");
            }
        }
    }
