package level_2;

public class MemoryAdressesAndVariables {
    public static void main(String[] args) {
        // Пример присваения
        String s1 = "Hello";
        String s2 = s1;
        s2 = s2 + " World!";
        System.out.println(s1);
        System.out.println(s2);

        // Пример 1: Профиль игрового персонажа
        byte level = 1;
        int goldAmount = 21;
        double rating = 11.121;
        String characterName = "Alice";

        System.out.println(level);
        System.out.println(goldAmount);
        System.out.println(rating);
        System.out.println(characterName);

        // Пример 2: Копирование и изменение данных проекта
        String projectName = "Java";
        String newProjectName = projectName;
        newProjectName = "Java Programming";

        System.out.println(projectName);
        System.out.println(newProjectName);

        // Пример 3: Размер данных
        byte b = 42;
        int i = 1231;
        double d = 12.1221;
        System.out.println("byte — 1 байт");
        System.out.println("int — 4 байта");
        System.out.println("double — 8 байтов");

        // Пример 4: Разные счета в банке

        int account1 = 100;
        int account2 = 200;

        account2 += account1;
        account1 = 0;

        account1 += 50;
        System.out.println(account1);
        System.out.println(account2);






    }
}
