package level_2;

public class ConversionBetweenDataTypes {
    public static void main(String[] args) {
        // Преобразование int в String
        int number = 43;
        String str = String.valueOf(number);
        System.out.println(str);

        // Преобразование строки в число
        String st = "123";
        int numbers = Integer.parseInt(st);
        System.out.println(numbers);

        // Пример 1: Код доступа
        int coins = 1234;
        String stCoins = String.valueOf(coins);
        System.out.println(stCoins);

        // Пример 2: Номер рейса
        int numberReis = 2211;
        String nameCitys = "Ekaterinburg";

        String allValue = "Рейс: " + numberReis + " до " + nameCitys;

        System.out.println(allValue);

        // Пример 3: Год выпуска фильма
        String yearString = "1999";
        int yearInt = Integer.parseInt(yearString);
        System.out.println(yearInt);

        // Пример 4: Суммирование результатов в игре
        String one = "-25";
        String two = "-10";

        int oneInt = Integer.parseInt(one);
        int twoInt = Integer.parseInt(two);

        int valueSum = oneInt + twoInt;

        System.out.println(valueSum);



    }
}
