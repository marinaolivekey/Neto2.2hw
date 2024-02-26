public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int balance = 200;
        int replenishmentOfBalance = 900;
        int bonus;
        int totalBalance;

        if (replenishmentOfBalance >= 1000) {
            bonus = replenishmentOfBalance / 100;
            totalBalance = balance + replenishmentOfBalance + bonus;
        } else {
            totalBalance = balance + replenishmentOfBalance;
            bonus=0;
        }

        System.out.println("Ваш баланс: "+totalBalance);
        System.out.println("Бонус сотавил: "+bonus);

    }
}