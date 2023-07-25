public class main {
    public static void main(String[] args) {

        int balance = 1000;
        int replenishment = 1020;

        int bonus;
        if (replenishment < 1000) {
            bonus = 0;
        } else {
            bonus = replenishment / 100;
        }
        balance = balance + replenishment + bonus;
        System.out.println(" Количество бонусов:" + bonus);
        System.out.println("Итоговый баланс: " + balance);


    }
}
