public class Main {
    public static void main(String[] args) {

        int rub = 100;// остаток у клиента
        int sum = 1300;// сумма пополнения

        System.out.println((rub + sum) + " руб. итоговая сумма");

        int ball1 = 0;
        if (sum > 1000) {
            ball1 = sum / 100;
        }

        int fin1 =rub + sum + ball1;

        System.out.println( fin1 +" руб. итоговая сумма с бонусами");
        System.out.println(ball1 + " бонусов");

    }
}