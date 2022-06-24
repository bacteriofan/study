
package patterns.prototype;

/**
 *
 * @author bethan
 */
public class Person {

    private String name;

    public Person(String name) {

        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public Person clone() {
//        try {
//            return (Person) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }

}
