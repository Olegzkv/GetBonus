public class Main {
    public static void main(String[] args) {
        int currentBalance = 550;
        int adding = 2000;
        int minimal = 100;

        if (adding >= 1000) {
            System.out.println("Баланс=" + (currentBalance + adding + (adding / minimal)));
        } else {
            System.out.println("Баланс=" + (adding + currentBalance));
        }
    }
}