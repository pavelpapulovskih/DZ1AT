import java.util.Random;
import java.util.Scanner;

public class MontyHallParadox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int wins = 0;
        int losses = 0;

        System.out.println("Добро пожаловать в игру с парадоксом Монти Холла!");
        System.out.println("Есть три двери. За одной из них находится приз, за двумя другими - козы.");
        System.out.println("Выберите одну из дверей (1, 2 или 3):");

        int selectedDoor = scanner.nextInt();

        int prizeDoor = random.nextInt(3) + 1;

        System.out.println("Вы выбрали дверь номер " + selectedDoor);

        int openedDoor;
        do {
            openedDoor = random.nextInt(3) + 1;
        } while (openedDoor == selectedDoor || openedDoor == prizeDoor);

        System.out.println("Хозяин открыл дверь номер " + openedDoor);

        System.out.println("Хотите ли вы изменить свой выбор? (да/нет)");
        String changeChoice = scanner.next();

        if (changeChoice.equalsIgnoreCase("да")) {
            for (int i = 1; i <= 3; i++) {
                if (i != selectedDoor && i != openedDoor) {
                    selectedDoor = i;
                    break;
                }
            }
        }

        if (selectedDoor == prizeDoor) {
            System.out.println("Поздравляем! Вы выиграли приз!");
            wins++;
        } else {
            System.out.println("К сожалению, за этой дверью была коза.");
            losses++;
        }

        System.out.println("Игра окончена.");
        System.out.println("Побед: " + wins);
        System.out.println("Поражений: " + losses);
    }
}

