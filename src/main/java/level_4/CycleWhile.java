package level_4;

import java.util.Scanner;

public class CycleWhile {
    public static void main(String[] args) {

        // Циклы - позволяют описать повторение действий лаконично и понятно.
        // Синтаксис
    /*
    while(условие)
    {
        тело цикла
    }
     */

//        // Классический счетчик (цикл while в действии)
//
//        int i = 1;
//        while (i <= 5) {
//            System.out.println("Шаг № " + i);
//            i++;
//        }
//
//        Scanner console = new Scanner(System.in);
//        String password = " ";
//        while (!password.equals("qwerty")) {
//            System.out.println("Введите пароль: ");
//            password = console.nextLine();
//        }
//        System.out.println("Добро пожаловать!");
//
//        // Условие не выполнится ни разу
//        int b = 10;
//        while (b < 5) {
//            System.out.println(b);
//        }

//        // Вложенные циклы
//        int i = 1;
//        while (i <= 3) {
//            int j = 1;
//            while (j <= 2){
//                System.out.println("i = " + i + ", j = " + j);
//                j++;
//            }
//            i++;
//        }

        // Пример 1. Обратный отсчет перед стартом
        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Старт!");

        // Пример 2. Разблокировка айфона
        Scanner scanner = new Scanner(System.in);
        String input = " ";
        System.out.print("Введите пароль: ");
        while (!input.equals("java")) {
            input = scanner.nextLine();
        }
        System.out.println("Смартфон разблокирован!");

        // Пример 3. Вывод мест в кинотеатре
        int number = 2;
        while (number <= 10) {
            System.out.println(number);
            number +=2;
        }

        // Пример 4. Учет трат на кофе
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        System.out.println("Введите стоимость чашки кофе(Отрицательное число для завершения");
        double cost = scan.nextDouble();
        while (cost >= 0) {
            sum += cost;
            System.out.println("Введите стоимость чашки кофе(Отрицательное число для завершения");
            cost = scan.nextDouble();
        }
        System.out.println(sum);

        // Пример 5. Вывести 10 раз "Привет!"
        String name = "Привет!";
        int count = 0;
        while (count <= 10) {
            System.out.println(name);
            count++;
        }
    }
}
