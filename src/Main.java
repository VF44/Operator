public class Main {
    public static void main(String[] args) {

        int summa1 = 100;
        int summaPlus = 1100;
        int bonus = 1;
        if (summaPlus > 1000) {

            bonus = summaPlus / 100;

            summa1 = summa1 + summaPlus + bonus;

        } else {
            summa1 = summa1 + summaPlus;
        }
        System.out.println("Итоговая сумма: " + summa1 + "\nБонус равен: " + bonus);

    }
}

