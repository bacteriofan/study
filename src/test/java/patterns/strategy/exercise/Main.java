package patterns.strategy.exercise;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.pay(Payment.bankPayment,100);
  }
}
