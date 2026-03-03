package level_2;

public class Integers {
    public static void main(String[] args) {

        // Создание целочисленной переменной
        int x;
        int count;
        int currentYear;

        // Краткая запись создания переменной
        int day, month, year;

        // Присвоение значений
        int a;
        a = 2000;

        // Сокращенная запись создания и инициализация переменной
        int d = 100000;

        // Вычисление целочисленных переменных
        int s = (2 + 2) * 3;

        // Выражения которые учавствуют в переменной
        int one = 1;
        int two = 2;
        int result = one + two;

        // Оператор инкремент
        // a++
        // Что из себя представляет пример а = а + 1, увеличивает переменную на единицу

        // Оператор декремент
        // а--
        // Что из себя представляет пример а = а - 1, уменьшает переменную на единицу

        // Пример 1: задаем возраст главного героя
        int heroAge = 25;
        System.out.println(heroAge);

        // Пример 2: Результат бросков игральных костей
        int firstRoll = 7, secondRoll = 3, totalRoll = firstRoll + secondRoll;
        System.out.println(totalRoll);

        // Пример 3: Делим призы между командами
        int prizes = 15;
        int teams = 4;

        int totalPrizes = prizes / teams;
        int totalAllPrizes = prizes % teams;

        System.out.println(totalPrizes);
        System.out.println(totalAllPrizes);

        // Пример 4: Изменения уровня жизни в игре
        int heroHealth = 10;
        heroHealth++;
        System.out.println(heroHealth);

        heroHealth--;
        System.out.println(heroHealth);
















    }
}
