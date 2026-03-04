package level_3;

public class LogicTipeBoolean {
    public static void main(String[] args) {
        // Логический тип boolean
//        int age = 20;
//        boolean isAudit = age >= 18;
//        boolean isTeenager = age >= 13 && age < 18;
//        boolean isEven = age % 2 == 0;


        // Логические операции
//        && - and - и
//        (0 < a) && (a < 100)
//        || - or - или
//        !(!a || !b)
//        ! - not - не
//        (!a) && (!b)

//        // Примеры логических операторов
//        int age = 16;
//        boolean hasTicket = true;
//        boolean canAttend = age >= 14 && hasTicket; (16 больше 14 и есть билет )
//
//        boolean isAdmin = false;
//        boolean isModerator = true;
//        boolean canEdit = isAdmin || isModerator; // true (можно редактировать, если хоть что то из этого true)

//        boolean isWeekend = false;
//        boolean shouldGoToWork = !isWeekend; // true (если не выходные, работаем)

//        // Комбинирование
//        int age = 17;
//        boolean hasTicket = false;
//        boolean isVip = true;
//
//        boolean canGo = (age >= 18 && hasTicket) || isVip; // true, потому что isVip true;

        // Пример 1: поиск правды
        boolean isJavaFun = true;
        System.out.println(isJavaFun);

        // Пример 2: Результат матча
        int ourScore = 3;
        int opponentScore = 1;

        boolean weWon = ourScore > opponentScore;
        System.out.println(weWon);

        // Пример 3: Планирование пикника
        boolean isSunny = true;
        boolean isWeekend = true;

        boolean canGoToPark = isSunny && isWeekend;
        boolean canStayHome = !isSunny || !isWeekend;

        System.out.println(canGoToPark);
        System.out.println(canStayHome);

        // Комфортная температура в помещении
        int temperatureRoom = 22;
        boolean isComfortable = false;

        isComfortable = temperatureRoom >= 20 && temperatureRoom <= 25;

        System.out.println(isComfortable);


    }
}
