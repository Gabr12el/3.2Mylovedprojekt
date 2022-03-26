public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BmiService = service.calculate(65.5, 1.7);
        System.out.println("Твой индекс массы тела: " + BmiService);
    }
}