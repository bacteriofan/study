package patterns.strategy.exercise;

public interface Payment {

    void pay(int amount);

    Payment payPalPayment = (amount) -> System.out.println("Payment of $" + amount + " made from PayPal.");
    Payment bankPayment = (amount) -> System.out.println("Payment of $" + amount + " made from bank account.");
}
