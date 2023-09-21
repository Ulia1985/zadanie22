public class Main {
    public static void main(String[] args) {

        int rub = 100;// остаток у клиента
        int sum1 = 300;// сумма пополнения 20.09.2023г.
        int sum2 = 1100;// сумма пополнения 21.09.2023г.

        System.out.println((rub + sum1) + " руб. итоговая сумма 20.09.2023г.");
        System.out.println((rub + sum2) + " руб. итоговая сумма 21.09.2023г.");

        int ball1 = 0;
        if (sum1 > 1000) {
            ball1 = sum1 / 100;
        }

        int ball2 = 0;
        if (sum2 > 1000) {
            ball2= sum2 / 100;
        }

        int fin1 =rub + sum1 + ball1;
        int fin2 =rub + sum2 + ball2;
        System.out.println( fin1 +" руб. итоговая сумма с бонусами 20.09.2023г.");
        System.out.println( fin2 +" руб. итоговая сумма с бонусами 21.09.2023г.");
        System.out.println(ball1 + " бонусов 20.09.2023г.");
        System.out.println(ball2 + " бонусов 21.09.2023г.");

    }
}