public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int depositAmmount = 1100;
        int currentBalance;

        if (depositAmmount < 1000) {
            currentBalance = initialBalance + depositAmmount;

        } else {
            currentBalance = initialBalance + (depositAmmount / 100) + depositAmmount;

        }
        System.out.println(currentBalance);
    }
}

