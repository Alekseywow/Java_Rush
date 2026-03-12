package level_5;

import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        // Пример 1. Лестница для цифрового замка
//        Scanner console = new Scanner(System.in);
//
//        System.out.println("Введите высоту лестницы");
//        int lader = console.nextInt();
//
//        for (int step = 1; step <= lader; step++) {
//            for (int i = 0; i < step; i++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }

        // Пример 2. Тайный код древних стражей
//        Scanner console = new Scanner(System.in);
//        System.out.println("Ввдите код");
//        int secretPassword = console.nextInt();
//
//
//        if (secretPassword <= 1) {
//            System.out.print("NO");
//            return;
//        }
//
//        boolean isPrime = true;
//
//        for (int i = 2; i <= secretPassword / i; i++) {
//            if (secretPassword % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        System.out.println(isPrime ? "YES" : "NO");

        // Пример 3. Зеркальное послание волшебника
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите послание: ");
//        String stepString = scanner.nextLine();
//
//        String reserved = " ";
//        for (int i = stepString.length() - 1; i >= 0; i--) {
//            reserved += stepString.charAt(i);
//        }
//        System.out.println(reserved);


        // Пример 4. Магический гримуар роста силы
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int magicInt = scan.nextInt();

        for (int i = 1; i <= magicInt; i++) {
            System.out.println(i * i);
        }


    }
}
