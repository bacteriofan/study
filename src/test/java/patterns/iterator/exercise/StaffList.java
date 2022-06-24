package patterns.iterator.exercise;

public class StaffList implements Iterable {

    private Employee[] employees;

    public StaffList(Employee ... employees) {
       this.employees = employees;
    }

    @Override
    public StaffListIterator iterator() {
        return new StaffListIterator(this);
    }

    public int getSize() {
        return employees.length;
    }

    public Employee getEmployees(int index) {
        return employees[index-1];
    }
}
