package level_4;

public class NextedCycle {
    public static void main(String[] args) {
//        // Внешний цикл for
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) // Внутренний цикл for
//            {
//                System.out.println(i + "," + j + " ");
//            }
//            System.out.println(); // Переход на новую строку после внутреннего цикла
//        }
//
//        // Внешний цикл while
//        int i = 0;
//        while (i < 3) {
//            int j = 0;
//            while (j < 4) {
//                System.out.println(i + ", " + j + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//
//        // Пример работы вложенных циклов
//        for (int row = 0; row < 8; row++) {
//            for (int col = 0; col < 8; col++) {
//                // Если сумма номеров строки и столбца четная - клетка белая, иначе черная
//                if ((row + col) % 2 == 0)
//                    System.out.print(".");
//                else
//                    System.out.print("#");
//            }
//            System.out.println(); // После каждого ряда перенос строки
//        }
//
//        // Таблмца умножения
//        for (int e = 1; e <= 9; e++){
//            for (int a = 1; a <= 9; a++){
//                System.out.print(e * a + "\t");
//            }
//            System.out.println();
//        }

//        // Досрочный выход только из внутреннего цикла
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (j == 3) {
//                    break; // выходим только из внутреннего цикла
//
//                }
//                System.out.print(i + "," + j + " ");
//            }
//            System.out.println();
//        }

        // Пример 1. Координатная сетка на радаре
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(i + "," + j);
                if (j < 3) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Прямоугольник из стероидов
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 7; col++) {
                System.out.print(" smail ");
            }
            System.out.println();
        }

        // Создание игрового поля
        for (int rowing = 0; rowing < 8; rowing++) {
            for (int column = 0; column < 8; column++) {
                System.out.print((rowing + column) % 2 == 0 ? "_" : "#");
            }
            System.out.println();
        }

        // Идеальная подборка пароля
        for (int in = 1; in <= 10; in++) {
            for (int fo = 1; fo <= 10; fo++) {
                if (in + fo == 13) {
                    System.out.println("Пароль найден: in=" + in + ", fo=" + fo);
                    return;
                }
            }
        }



    }
}
