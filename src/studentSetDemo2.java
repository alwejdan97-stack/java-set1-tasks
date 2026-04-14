import java.util.HashSet;
import java.util.Set;

public class studentSetDemo2 {
    public static void main(String[] args){
        Set<String> studentName = new HashSet<>();
        studentName.add("Ali"); //add() use to add items to set
        studentName.add("Omar");
        studentName.add("Noor");
        studentName.add("Hoor");
        studentName.add("Sara");
        System.out.println(studentName); // use to print or display set
        studentName.add("Hoor");
        System.out.println(studentName);
        System.out.println("check if Ahmed avilable: " + studentName.contains("Ahmed")); // contains() use to check the item in set
        System.out.println(studentName);
        studentName.remove("Sara"); // remove() use to remove one item only
        System.out.println("total size is: " + studentName.size());
        studentName.clear();
        System.out.println(studentName);
        System.out.println("total size is: " + studentName.size());
    }
}
