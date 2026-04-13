import java.util.HashSet;
import java.util.Set;

public class SizeSetDemo {
    public static void main(String[] args){
        Set<String> departmentName = new HashSet<>();
        departmentName.add("Math");
        departmentName.add("IT");
        departmentName.add("Paint");
        departmentName.add("Scince");
        departmentName.add("Geology");
        System.out.println(departmentName);
        System.out.println("number of items is: " + departmentName.size());
        departmentName.add("Arabic");
        System.out.println("number of items is: " + departmentName.size());
    }
}
