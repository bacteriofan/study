package patterns.strategy.exercise;

public class Customer {

  public void pay(Payment payment, int amount) {
    payment.pay(amount);
  }
}
