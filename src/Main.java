public class Main {
    public static void main(String[] args) {

        int ruble = 100;// остаток у клиента
        int sum = 1300;// сумма пополнения

        System.out.println((ruble + sum) + " руб. итоговая сумма");

        int account = 0;
        if (sum > 1000) {
            account = sum / 100;
        }

        int totally = ruble + sum + account;

        System.out.println(totally + " руб. итоговая сумма с бонусами");
        System.out.println(account + " бонусов");

    }
}