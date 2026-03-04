package level_3;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        // Тернарный оператор

        /*

        int a = 2;
        int b = 3;

        int min = a < b ? a : b;

        условие ? выражение1 : выражение2;

        Если условие истино, выполняется выражение1 иначе выполняется выражение2,
        после условия следует знак вопросы, а два выражения разделены двоеточием

        int age = 25;

        int yourAge = age > 30 ? 100 : 50;

         */

//        int a = 10;
//        int b = 20;
//
//        String max = (a > b) ? "Больше" : "Меньше";
//        System.out.println(max);

        // Встраивание тернарного оператора в приложение
//        Scanner console = new Scanner(System.in);
//
//        System.out.print("Введите ваше имя: ");
//        String name = console.nextLine();
//
//        System.out.print("Введите ваш возраст: ");
//        int age = console.nextInt();
//        console.nextLine();
//
//        int nextYear = age + 1;
//        String status = (nextYear >= 18) ? "совершеннолетний" : "несовершеннолетний";
//
//        System.out.println("Привет! " + name + "! В следующем году вам будет " + nextYear + ". Вы будете " + status + ".");


        // Вложенный тернарный оператор
        /*

        String category = (age < 7) ? "дошкольник" :
                          (age < 18) ? "школьник" :
                          (age < 65) ? "взрослый" : "пенсионер";
         */

        // Пример 1: Выбор победителя в соревнованиях
        int alexTime = 12;
        int maxTime = 20;

        int result = (alexTime < maxTime) ? alexTime : maxTime;

        System.out.println(result);

        // Пример 2: Проверка номера заказа на четность
        int orderNumber = 22;
        String orderStatus = (orderNumber % 2 == 0) ? "Четное" : "Нечетное";

        System.out.println(orderStatus);


        // Пример 3: Приветствие пользователя в приложении
        int currentHour = 8;

        String greetingMessage = (currentHour < 12) ? "Доброе утро!" : "Добрый день!";

        System.out.println(greetingMessage);

        // Пример 4: Категория билетов по возрасту
        int visitorAge = 20;

        String ticketCategory = (visitorAge < 7) ? "Детский" :
                                (visitorAge <= 17) ? "Подростковый" :
                                (visitorAge <= 64) ? "Взрослый" : "Пенсионный";

        System.out.println(ticketCategory);

    }
}
