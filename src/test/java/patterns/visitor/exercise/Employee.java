package patterns.visitor.exercise;

public interface Employee {

  int getSalary();
  void accept(Visitor visitor);

}
