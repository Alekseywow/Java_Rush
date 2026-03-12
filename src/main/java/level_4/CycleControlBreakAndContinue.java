package level_4;

import java.util.Scanner;

public class CycleControlBreakAndContinue {
    public static void main(String[] args) {

        // Оператор break используется для немедленного выхода из цикла
        // Как только исполнение программы доходит до break, цикл завершает работу

        /*
        while(условие)
        {
            if (какое - то услвоие)
            {
            break;
            }
            остальной код
        }
         */

//        // Проверка числа на простоту
//        int number = 111;
//        boolean found = false;
//        for (int i = 2; i < number; i++) {
//            if (number % 2 == 0) {
//                found = true;
//                System.out.println("Нашли двигатель " + i);
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("Делитель не найден - число простое");
//        }
//
//        // Валидация пользовательского ввода
//
//        Scanner console = new Scanner(System.in);
//        while (true) {
//            System.out.println("Введите свой возраст: ");
//            if (console.hasNextInt())
//            {
//                int age = console.nextInt();
//                if (age > 0)
//                {
//                    System.out.println("Отлично! Ваш возраст: " + age);
//                    break;
//                }
//                else {
//                    System.out.println("Ошибка! Введите положительный возраст");
//                }
//            }
//            else {
//                System.out.println("Ошибка! Введите число");
//                console.nextLine();
//            }
//        }

        // Оператор continue не завершает весь цикл, а прерывает текущую итерацию,
        // Все что написано после continue в теле цикла, Не выполняется и переходит к следующей итерации

//        for (int i = 0; i < 10; i++) {
//            if (условие) {
//                continue;
//            }
//            // эта часть отпрабатывает если continue не сработал
//        }


        // Пропуск четных чисел
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println("Нечетное число: " + i   );
//        }

        // Пример 1. Поиск секретного кода
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Замок открыт");
                break;
            }
        }

        // Пример 2. Отбор качественных товаров
        int[] productRating = {3, -2, 7, -5, 8, 0};

        for (int rating : productRating) {
            if (rating < 0) {
                continue;
            }
            System.out.println(rating);
        }


        // Пример 3, Проверка на простое число
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число, больше одного");
        int n = console.nextInt();
        boolean isPlan = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                isPlan = false;
                break;
            }
        }
        if (isPlan){
            System.out.println("Число простое");
        }

        // Пример 4. Суммирование ежедневных задач
        Scanner scan = new Scanner(System.in);
        int allSalle = 0;
        while (true) {
            System.out.println("Введите сумму продаж");
            int sumSalle = scan.nextInt();
            if (sumSalle < 0) {
                break;
            }
            allSalle += sumSalle;
        }
        System.out.println(allSalle);

    }
}
