
// IMPLEMENTING THE CONCEPTS OF JAVA ARRAY LISTS
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<employee> employeelist = new ArrayList<>();

        employeelist.add(new employee("Jane", "Jones", 123));
        employeelist.add(new employee("Mary", "Kom", 121));
        employeelist.add(new employee("Lisa", "Clark", 232));
        employeelist.forEach(employee -> System.out.println(employee));
        // printing the data

        System.out.println(employeelist.get(1));
        // check is list is empty
        System.out.println(employeelist.isEmpty());
        // replacing the items
        employeelist.set(1, new employee("John", "Adams", 1231));

        employeelist.forEach(employee -> System.out.println(employee));

        // size of the array
        System.out.println(employeelist.size());

        // objext array
        Object[] employeeArray = employeelist.toArray(new employee[employeelist.size()]);
        for (Object employee : employeeArray) {
            System.out.println(employee);
        }
        System.out.println(employeelist.contains(new employee("Marry", "Kom", 121)));
        // look for the index of some element in the array list
        System.out.println(employeelist.indexOf(new employee("Jane", "Jones", 123)));

        // remove items from the list using the index
        employeelist.remove(2);
        employeelist.forEach(employee -> System.out.println(employee));

    }
}