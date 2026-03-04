package level_3;

import java.util.Scanner;

public class MultiLevelLogicIf {
    public static void main(String[] args) {

//        // Базовый синтаксис вложенного if
//        Scanner console = new Scanner(System.in);
//        System.out.print("Введите ваше имя: ");
//        String name = console.nextLine();
//
//        System.out.print("Введите ваш возраст: ");
//        int age = console.nextInt();
//        console.nextLine();
//
//        if (age >= 21)
//        {
//            System.out.print("Введите пригласительный код: ");
//            String code = console.nextLine();
//
//            if (code.equals("VIP2024"))
//            {
//                System.out.println("Добро пожаловать, " + name + ", в VIP-клуб!");
//            }
//            else
//            {
//                System.out.println("Извините, неверный код. Доступ запрещён.");
//            }
//        }
//        else
//        {
//            System.out.println("Извините, вход только с 21 года!");
//        }
//
//        // Альтернативы else if во вложенных условиях
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите ваш возраст: ");
//        int agePeople = scan.nextInt();
//        scan.nextLine();
//
//        if (agePeople >= 21) {
//            System.out.println("Введите ваш пригласительный код: ");
//            String oneCode = scan.nextLine();
//
//            if (oneCode.equals("Vip2025"))
//            {
//                System.out.println("Добро пожаловать в клуб!");
//            } else if (oneCode.equals("Guest"))
//            {
//                System.out.println("Гостевой режим доступен до 23:00!");
//            }
//            else {
//                System.out.println("Доступ невозможен");
//            }
//        }
//        else {
//            System.out.println("Вход только с 21 года");
//        }
//
//        // Практика: калькулятор скидки с многоуровневой логикой
//        Scanner s = new Scanner(System.in);
//        System.out.print("Введите ваш возраст: ");
//        int ageStars = s.nextInt();
//        s.nextLine();
//
//        double discount = 0.0;
//        if(ageStars >= 60) {
//            discount = 0.15;
//        } else {
//            System.out.println("Есть ли у вас клубная карта (да/нет)? ");
//            String hasCard = s.nextLine();
//
//            if (hasCard.equals("да")) {
//                discount = 0.07;
//            }
//        }
//        System.out.println("Ваша скидка: " + (discount * 100) + "%");


//
//        // Пример 1: Проверка входа на вечеринку
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите ваш возраст ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Введите секретный код ");
//        String secretCode = scanner.nextLine();
//
//        if (age >=18) {
//            // Если возраст >= 18, проверяем секретный код
//            if (secretCode.equals("OPEN")) {
//                // Если код равен "OPEN", разрешаем вход
//                System.out.print("Вход разрешен!");
//            } else {
//                // Если код не равен "OPEN", запрещаем вход
//                System.out.print("Вам сегодня не повезло, вход запрещен.");
//            }
//        } else {
//            System.out.print("Вам нет 18 лет.");
//            // Если возраст < 18, запрещаем вход
//        }

//        // Пример 2: Вход в клуб
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите ваш возраст: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Введите ваш город: ");
//        String city = scanner.nextLine();
//
//        if (age >= 21) {
//            if (city.equals("Минск")) {
//                System.out.print("Добро пожаловать в клуб");
//            } else {
//                System.out.print("Простите вы неверно указали ваш город");
//            }
//        } else {
//            System.out.println("Вам нет 21 года");
//        }

//        // Пример 3: Пригласительная на конфиренцию
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите ваш возраст для подтверждения входа на конференцию: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Введите код доступа для посещения мероприятия: ");
//        String resultCode = scanner.nextLine();
//
//        if(age >= 21) {
//            if (resultCode.equals("VIP")) {
//                System.out.print("Доступ к вип залу разрешен");
//            } else if (resultCode.equals("GUEST")) {
//                System.out.print("Гостевой доступ разрешен");
//            } else {
//                System.out.print("Вам отказано в мероприятии");
//            }
//        } else {
//            System.out.print("Вам нет 21 года");
//        }

//        // Пример 4: Программа лояльности в магазине
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите ваш возраст: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Есть ли у вас клубная карта (да/нет)? ");
//        String clubCard = scanner.nextLine();
//
//        if (age >= 65) {
//            // Специальная скидка для пенсионеров
//            System.out.println("Ваша скидка 20%");
//        } else {
//            // Для всех остальных (age < 65) проверяем клубную карту
//            if (clubCard.equals("да")) {
//                System.out.println("Ваша скидка 10%");
//            } else {
//                System.out.println("Скидки нет");
//            }
//        }

        // Пример 5: Свой пример
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (age >= 18) {
            System.out.println("Есть ли у вас  канал Netflix? (да/нет): ");
            String podpiska = scanner.nextLine();
            if (podpiska.equals("да")) {
                System.out.println("Вы оплатили подписку? (да/нет)");
                String done = scanner.nextLine();
                if (done.equals("да")){
                    System.out.println("Отлично, приятного просмотра");
                } else {
                    System.out.println("Оплатите подписку!");
                }
            } else {
                System.out.println("Подключайте скорее, там интересные сериалы!");
            }
        } else {
            System.out.println("Просмотр несовершеннолетним запрещен");
        }


    }
}
