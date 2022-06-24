package patterns.iterator.exercise;

import java.util.Iterator;

public class StaffListIterator implements Iterator {

    private StaffList staffList;
    int index = 0;

    public StaffListIterator(StaffList staffList) {
        this.staffList = staffList;
    }

    @Override
    public boolean hasNext() {
        int length = staffList.getSize();
        if (index < length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Employee next() {
        index++;
        return staffList.getEmployees(index);
    }
}
