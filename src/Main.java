public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int account = 1000;
        int incoming = 1200;
        int summAccount = account + incoming;


        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int bonus;

        if (incoming >= 1000) {
            bonus = incoming / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет:" + (summAccount + bonus));
        System.out.println("Бонусы:" + bonus);

    }
}