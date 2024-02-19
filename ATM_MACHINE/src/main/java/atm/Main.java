package atm;

public class Main {
    public static void main(String[] args) {
        User user = new User(1234, "Mohanraj S", 10000);
        ATM atm = new ATM(user);
        atm.start();
    }
}
