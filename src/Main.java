public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        bmi.weight = 60;
        bmi.growth = 1.70f;
        float index = bmi.index();
        System.out.println("Ваш индекс массы тела (ИМТ) равен: " + index);
    }
}
