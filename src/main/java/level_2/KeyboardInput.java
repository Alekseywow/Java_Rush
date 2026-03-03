package level_2;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        //Считываение с помощью клавиатуры с помощью объекта Scanner
        Scanner console = new Scanner(System.in);
                    // Переменная.метод(параметры)
        String name = console.nextLine();
        int age = console.nextInt();
        double number = console.nextDouble();

        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Number " + number);


        // Пример 1: Получение пароля
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        System.out.println(password);

        // Пример 2: Регистрация нового игрока
        Scanner st = new Scanner(System.in);

        System.out.println("Введите имя игрока: ");
        String name1 = st.nextLine();
        System.out.println("Введите возраст игрока: ");
        int age1 = st.nextInt();

        System.out.println(age1);
        System.out.println(name1);

        // Пример 2: Подсчет общей стоимости покупки
        Scanner all = new Scanner(System.in);

        int firstPrice = all.nextInt();
        int secondPrice = all.nextInt();

        int total = firstPrice + secondPrice;

        System.out.println(total);

        // Пример 3: Создание визитной карточки
        Scanner scan = new Scanner(System.in);

        String namePeople = scan.nextLine();
        int agePeople = scan.nextInt();

        System.out.println("Меня зовут " + namePeople + ", мне " + agePeople + " лет.");




    }
}
