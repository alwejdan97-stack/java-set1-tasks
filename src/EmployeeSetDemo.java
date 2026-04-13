import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {
    public static void main(String[] args){
        Set<Integer> employeeID = new HashSet<>();
        employeeID.add(1);
        employeeID.add(2);
        employeeID.add(3);
        employeeID.add(4);
        employeeID.add(5);
        System.out.println(employeeID);
        employeeID.add(3);
        System.out.println(employeeID);
        System.out.println("check id number 1: " + employeeID.contains(1));
        employeeID.remove(2);
        System.out.println(employeeID);
        System.out.println("total size is: " + employeeID.size());
        employeeID.clear();
        System.out.println(employeeID);
        System.out.println("total size is: " + employeeID.size());
    }
}
