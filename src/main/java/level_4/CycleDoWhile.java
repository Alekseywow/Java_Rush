package level_4;

import java.util.Scanner;

public class CycleDoWhile {
    public static void main(String[] args) {
        // Синтаксис do while
        /*
        do
        {
            Тело цикла: этот код выполнится хотя бы один раз
        }
        while (условие);

        Описание шагов цикла do-while
        1. Вход в тело цикла (всегда хотя бы раз)
        2. Проверка условия
        3. Если условие истино - повторить тело
        4. Если условие ложно - выйти из цикла
         */

//        Scanner scanner = new Scanner(System.in);
//        String password;
//        do{
//            System.out.print("Введите новый пароль(не менее 6 символов: )");
//            password = scanner.nextLine();
//        } while (password.length() < 6);
//        System.out.print("Пароль приният!");


//        Scanner scan = new Scanner(System.in);
//        String command;
//        do {
//            System.out.println("Меню: ");
//            System.out.println("1. Показать приветствие");
//            System.out.println("2. Выйти");
//            System.out.println("Выберите действие: ");
//            command = scan.nextLine();
//
//            if (command.equals("1")) {
//                System.out.println("Привет мир!");
//            } else if (!command.equals("2")) {
//                System.out.println("Неизвестная команда");
//            }
//        } while (!command.equals("2"));
//        System.out.println("Пока!");


        // Пример 1. Первая загрузка игры
        int gameVersion = 10;
        do {
            System.out.println("Загрузка версии");
            System.out.println(gameVersion);
        } while (gameVersion < 10);

        // Пример 2. Ввод Pin кода
        Scanner console = new Scanner(System.in);
        int pin;
        do {
            System.out.println("Введите Пин-код");
            pin = console.nextInt();
        } while (pin < 1000 || pin > 9999);
        System.out.println("Пароль верный!");

        // Пример 3. Интерактивный терминал
        Scanner scan = new Scanner(System.in);
        String menu;
        do {
            System.out.println("Меню: ");
            System.out.println("1. Вывести приветствие");
            System.out.println("2. Выйти");

            menu = scan.nextLine();

            if (menu.equals("1")) {
                System.out.println("Привет!");
            }
        } while (!menu.equals("2"));

        // Пример 4. Регистрация нового аккаунта

        Scanner scanner = new Scanner(System.in);
        String pinc;
        do {
            System.out.println("Просьба ввести пароль!");
            pinc = scanner.nextLine();
        } while (pinc.length() < 6);
        System.out.println("Пароль надежен!");


    }
}
