public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 187F; // Рост в сентиметрах
        int weight = 98; // Вес в килограммах
        int bmi = service.calculate(height, weight);
        System.out.println("Your BMI: " + bmi);
    }
}
