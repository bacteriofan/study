package patterns.visitor.exercise;

public class Client {

  public static void main(String[] args) {
    StaffList staffList = new StaffList();
    System.out.println("Total amount paid to staff: " + staffList.getSalary());
    staffList.accept(new SalaryAdjustment());
    System.out.println("Total amount paid to staff: " + staffList.getSalary());
  }

}
