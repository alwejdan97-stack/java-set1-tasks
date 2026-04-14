import java.util.HashSet;
import java.util.Set;

public class courseSetDemo2 {
    public static void main(String[] args){
        Set<String> courseName = new HashSet<>();
        courseName.add("Java");
        courseName.add("Python");
        courseName.add("Database");
        courseName.add("Networking");
        courseName.add("Web Development");
        System.out.println(courseName);
        courseName.add("Web Design"); // add new unique item
        System.out.println(courseName);
        courseName.add("Web Development"); // this item will not be added, because it's duplicated
        System.out.println(courseName);
        System.out.println("check if Java avilable: " + courseName.contains("Java")); // return ture after, item in the set
        System.out.println("check if Sicence avilable: " + courseName.contains("Sicence")); // return false, item is not in the set
        courseName.remove("Web Design"); // remove only one item
        System.out.println(courseName);
        System.out.println("total size is: " + courseName.size()); // check the size of the set
        courseName.add("Java Script");
        System.out.println(courseName);
        System.out.println("total size is: " + courseName.size());
        courseName.clear(); // remove all items of the set
        System.out.println(courseName);
        System.out.println("the size now is: " + courseName.size());


    }
}
