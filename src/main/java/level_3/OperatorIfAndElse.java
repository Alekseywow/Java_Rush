package level_3;

import java.util.Scanner;

public class OperatorIfAndElse {
    public static void main(String[] args) {
        // Условные операторы if / else которые позволяют выполнять раазные блоки команд в зависимости от правдивости устройства

        /*  1
        if (условие) {
            команда 1;
        } else {
            команда 2;
        }
        */

        /*  2
        Если условие истино, то
        выполнить команду 1;
        иначе
        выполнить команду 2;
         */

        //  тесты
        int age = 17;
        if (age < 18) {
            System.out.println("Вы еще ребенок");
        } else {
            System.out.println("Вы уже взрослый");
        }

        int ageAuto = 18;
        if (ageAuto == 18) {
            System.out.println("Можно сдавать на права");
        } else {
            System.out.println("Можно копить на машину");
        }

        // Блок команда
        int temperatureNew = 5;
        if (temperatureNew < 0) {
            System.out.println("На улице мороз");
            System.out.println("Шапку надень");
        } else {
            System.out.println("Тепло");
        }

        // Компинированые условия else if
        int hour = 13;
        if (hour < 12) {
            System.out.println("Доброе утро");
        } else if (hour < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }

        // Какие есть условия для проверка
        /*
        Оператор == (равно)
        Оператор != (не равно)
        Оператор > (Больше)
        Оператор < (Меньше)
        Оператор >= (Больше или равно)
        Оператор <= (Меньше или равно)
         */

        // Работа со строками в условиях
        /*
        Оператор == работает в сравнении только для чисел
        А для строк нужно использовать метод сравнения equals()
         */
//        Scanner console = new Scanner(System.in);
//        String password = console.nextLine();
//        if(password.equals("qwerty")) {
//            System.out.println("Вы вошли!");
//        }

        // Пример 1: Покупка билета в кино
        int visitorAge = 17;
        if (visitorAge < 18) {
            System.out.println("Доступ запрещен");
        } else {
            System.out.println("Добро пожаловать!");
        }

        // Пример 2: Проверка погоды на улице
        int currentTemperature = - 5;
        if (currentTemperature < 0) {
            System.out.println("Одентесь потеплее, на улице мороз!");
        } else {
            System.out.println("Можно идти в легкой одежде!");
        }

        // Пример 3: Разблокировка аккаунта
        String userPassword = "qwerty";
        if (userPassword.equals("qwerty")) {
            System.out.println("Вход успешно выполнен");
        }

        // Пример 4: Приветствие по времени суток
        int currentHour = 20;
        if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour >= 12 && currentHour <= 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }
}
