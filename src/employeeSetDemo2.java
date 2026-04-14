import java.util.HashSet;
import java.util.Set;

public class employeeSetDemo2 {
    public static void main(String[] args){
        Set<String> employeeName = new HashSet<>();
        employeeName.add("Ahmed"); // adding items to the set
        employeeName.add("Hamed");
        employeeName.add("Hoor");
        employeeName.add("Noor");
        employeeName.add("Omar");
        System.out.println(employeeName);
        employeeName.add("Wejdan"); // add new unique item
        System.out.println(employeeName);
        employeeName.add("Omar"); // this item will not be added, because it's duplicated
        System.out.println(employeeName);
        System.out.println("check if Wejdan avilable: " + employeeName.contains("Wejdan")); // return ture after, item in the set
        System.out.println("check if Khaled avilable: " + employeeName.contains("Khaled")); // return false, item is not in the set
        employeeName.remove("Omar"); // remove only one item
        System.out.println(employeeName);
        System.out.println("total size is: " + employeeName.size()); // check the size of the set
        employeeName.add("Muna");
        System.out.println(employeeName);
        System.out.println("total size is: " + employeeName.size()); // checking the size after adding new item
        employeeName.clear(); // remove all items of the set
        System.out.println(employeeName);
        System.out.println("the size now is: " + employeeName.size());
    }
}
