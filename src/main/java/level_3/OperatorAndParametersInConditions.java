package level_3;

public class OperatorAndParametersInConditions {
    public static void main(String[] args) {
        // Примеоритеты операторов
        /*

        () - скобки - самый высокий
        !  - логическое не - высокий
        ==, != - равно / не равно - средний
        <, >, <=, >= - сравнение - средний
        && - логическое и - ниже
        || - логическое или - ниже

         */

        // Главное правил, Оператор И(&&) имеет больший приоритет, чем ИЛИ(||)

        // Ассоциативность направление операторов

        /*
        Операторы && , || - слева направо
        Оператор ! - справа налево
         */

        // Пример 1: Приоритет логических операторов
        boolean toTheSea = true;
        boolean hasPlaneTicket = false;
        boolean hasHotelRoom = true;

        boolean vacationHappened = toTheSea || hasPlaneTicket && hasHotelRoom;

        System.out.println(vacationHappened);


        // Пример 2: Использование скобок в логических выражениях
        boolean ticketsOnSale = false;
        boolean haveMoneyForTicket = true;
        boolean concertNotCanceled = false;

        boolean canBuy = ticketsOnSale || haveMoneyForTicket && concertNotCanceled;
        boolean canBuyWithNewMeaning = (ticketsOnSale || haveMoneyForTicket) && concertNotCanceled;

        System.out.println(canBuy);
        System.out.println(canBuyWithNewMeaning);


        // Пример 3: Проход на секретную вечеринку
        boolean hasInvitation = true;
        boolean dressCodeMet = false;
        boolean passwordIdCorrection = true;

        boolean admitted1 = hasInvitation && dressCodeMet && passwordIdCorrection;
        boolean admitted2 = (hasInvitation && dressCodeMet) && passwordIdCorrection;
        boolean admitted3 = hasInvitation && (dressCodeMet && passwordIdCorrection);

        System.out.println(admitted1);
        System.out.println(admitted2);
        System.out.println(admitted3);

        // Пример 4: Условие получения кредита в банке

        int yourAge = 25;
        boolean hasJob = true;
        boolean hasCreditHistory = false;
        boolean hasGuarantor = true;

        boolean loanAppruv = (yourAge > 21 && hasJob) || (hasCreditHistory && hasGuarantor);
        boolean loanAppruv1 = (yourAge > 21) && (hasJob || hasCreditHistory) && hasGuarantor;

        System.out.println(loanAppruv);
        System.out.println(loanAppruv1);

    }
}
