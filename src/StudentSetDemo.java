import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {
    public static void main(String[] args){
        Set<String> studentName = new HashSet<>();
        studentName.add("Ahmed");
        studentName.add("Ali");
        studentName.add("wejdan");
        studentName.add("Omar");
        studentName.add("Hoor");
        System.out.println(studentName);
        studentName.add("wejdan");
        System.out.println(studentName);
        System.out.println("check if Wejdan is avilable: " + studentName.contains("wejdan"));
        System.out.println(studentName);
        System.out.println("total size is: " + studentName.size());
        studentName.clear();
        System.out.println(studentName);
        System.out.println("total size is: " + studentName.size());
    }
}
