package patterns.iterator.exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Employee zak = new Employee("Zak");
    Employee sarah = new Employee("Sarah");
    Employee anna = new Employee("Anna");
    Employee ashish = new Employee("Anna");
    Employee kseniia = new Employee("Anna");

    final StaffListIterator iterator = new StaffList(zak, sarah, anna, ashish, kseniia).iterator();


    List<String> list = new ArrayList<>();
    list.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next().getName());
    }
  }
}
