
// IMPLEMENTING THE CONCEPTS OF JAVA ARRAY LISTS
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        List<EmployeeVec> employeelist = new Vector<>();

        employeelist.add(new EmployeeVec("Jane", "Jones", 123));
        employeelist.add(new EmployeeVec("Mary", "Kom", 121));
        employeelist.add(new EmployeeVec("Lisa", "Clark", 232));
        employeelist.forEach(EmployeeVec -> System.out.println(EmployeeVec));

    }
}
