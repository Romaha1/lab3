import java.util.Scanner;
//task 3
public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentFloor = 1; // Починаємо з першого поверху

        while (true) {
            System.out.print("Введіть номер поверху (1-9): ");
            int floor = scanner.nextInt();

            if (floor == currentFloor) {
                System.out.println("Ви вже на цьому поверсі!");
            } else if (floor < 1 || floor > 9) {
                System.out.println("Такого поверху не існує!");
            } else {
                if (floor == 2 && currentFloor < floor) { // Якщо натиснуто кнопку 2-го поверху під час підйому
                    floor = 3; // Змінюємо цільовий поверх на 3
                } else if (floor == 2) { // Якщо натиснуто кнопку 2-го поверху під час спуску
                    floor = 1; // Змінюємо цільовий поверх на 1
                }

                System.out.print("Ліфт рухається ");
                if (floor > currentFloor) {
                    System.out.println("вгору...");
                    while (currentFloor < floor) {
                        currentFloor++;
                        System.out.println("Ви піднялись на " + currentFloor + " поверх");
                    }
                } else {
                    System.out.println("вниз...");
                    while (currentFloor > floor) {
                        currentFloor--;
                        System.out.println("Ви спустились на " + currentFloor + " поверх");
                    }
                }
            }
        }
    }
}
