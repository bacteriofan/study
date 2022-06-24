package patterns.visitor.exercise;

public interface Visitor {

    void visit(Manager manager);
    void visit(SalesPerson salesPerson);
}
