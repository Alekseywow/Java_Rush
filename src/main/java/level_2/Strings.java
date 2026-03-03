package level_2;

public class Strings {
    public static void main(String[] args) {
        // Создание переменных типа String
        String name;

        // Краткая запись типа String
        String develop, montag, create;

        // Присвоение переменной типа String
        String city = "Ekaterinburg";
        String message = "Hello";

        // Конкатинация: склеивание строк
        String nameCity1 = "Saint";
        String nameCity2 = "Pi";
        String allNameCity = "City " + nameCity1+ " " + nameCity2;
        System.out.println(allNameCity);

        // Экранирование спецсимволов в строках
        String quote = "Он сказал: \"Здравствуйте!\"";
        System.out.println(quote);

        // Специальные управляющие символы
        // - \n - Перенос строки
        // - \t - Табуляция (отсуп)
        // - \\ - Буквально (\)
        // - \" - Кавычки внутри строки
        String multiline = "Строка 1\nСтрока 2";
        System.out.println(multiline);

        // Собственные фунции строк
//        str.length - Длина строки
//        str.toUpperCase - В верхний регистр
//        str.toLowerCase - В нижний регистр
//        str.trim - Удалить пробелы по краям

        // Примеры работ с функциями строк
        String aName = "Андрей";
        int length = aName.length();
        System.out.println(length);

        String original = "Привет";
        System.out.println(original.toUpperCase());
        System.out.println(original.toLowerCase());

        String messy = "    hello   ";
        System.out.println(messy.trim());


        // Пример 1: Сообщение из будущего
        String futureMessage = "Hello my friend!";
        System.out.println(futureMessage);

        // Пример 2: Создание полного имени
        String firstName = "Alex";
        String lastName = "Coco";

        String allSurname = firstName + " " + lastName;
        System.out.println(allSurname);

        // Пример 3: Цитата героя
        String heroQuoit = "\"Поехали!\"";
        System.out.println(heroQuoit);

        // Пример 4: Обработка данных из форм
        String newCity = "  Minsk  ";

        System.out.println(newCity.length());
        newCity = newCity.trim();
        System.out.println(newCity.length());
        System.out.println(newCity.toUpperCase());
        System.out.println(newCity.toLowerCase());
















    }
}
