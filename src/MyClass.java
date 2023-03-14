import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ви погоджуєтесь чи відмовляєтеся?");
        String option = scanner.nextLine();

        switch (option.toLowerCase()) {
            case "так":
            case "ок":
            case "yes":
            case "y":
            case "+":
                System.out.println("Я погоджуюсь!");
                break;
            case "ні":
            case "no":
            case "n":
            case "-":
                System.out.println("Я відмовляють!");
                break;
            default:
                System.out.println("Невідома опція!");
                break;
        }
    }
}

