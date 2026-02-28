package level_1;

public class Variable {

    public static void main(String[] args) {
    // Объявление переменной
    //    int i;
    //    String s;
    //    double c;

    // Способ присвоения
    //    int i;      // - создается переменная i
    //    int a,b;    // - создается переменная a и b
    //    int x;      // - создается переменная i
    //
    //    i = 3;      // - в переменную i заномится значение 3
    //    a = 1;      // - в переменную a заносится значение 1
    //    b = a + 1;  // - в переменную b заносится переменная 2
    //    x = 3;      // - в переменную x заносится значение 3
    //    x = x + 1;  // - в переменную x заносится значение 4

    // Присвоение и вывод числа
    int currentYear = 2025;
        System.out.println(currentYear);
    // Присвоение и вывод строки
    String myMessage = "I LOVE YOU";
        System.out.println(myMessage);

    // присвоение и вычисление числа
     int currentYearProject = 2025;
     int projectAge;
     projectAge = currentYearProject - 2019;
        System.out.println(projectAge);

     // Суммирование результатов в игре
        int player1Score = 1999;
        int player2Score = 25;
        int totalAmount = player1Score + player2Score;

        System.out.println(totalAmount);

     // Создание профиля пользователя
        String userName = "Alice";
        int userAge = 20;
        String profileInfo = "Имя: " + userName + ", Возраст: " + userAge;
        System.out.println(profileInfo);

        // Вычисление стоимости заказа
        int totalPrice = 4;
        int totalCount = 3;
        int discount = 2;

        int totalCost = totalPrice * totalCount - discount;
        String finalMessage = "Итоговая стоимость: " + totalCost;

        System.out.println(finalMessage);

        /*
        Вы узнали:

        Что такое переменные;
        Как выводить сообщения на экран;
        Познакомились с типами int и String;
        Узнали, чем компиляция в Java отличается от других языков;
        Как делать комментарии в Java и зачем они нужны.

         */


    }
}
