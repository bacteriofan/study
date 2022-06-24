package patterns.visitor.exercise;

public class SalaryAdjustment implements Visitor {

    @Override
    public void visit(Manager manager) {
        manager.setSalary(65000);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(57000);
    }
}
