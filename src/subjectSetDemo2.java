import java.util.HashSet;
import java.util.Set;

public class subjectSetDemo2 {
    public static void main(String[] args){
        Set<String> subjectName = new HashSet<>();
        subjectName.add("Math"); // adding items to the set
        subjectName.add("Science");
        subjectName.add("English");
        subjectName.add("History");
        subjectName.add("Computer");
        System.out.println(subjectName);
        subjectName.add("Art"); // add new unique item
        System.out.println(subjectName);
        subjectName.add("History"); // this item will not be added, because it's duplicated
        System.out.println(subjectName);
        System.out.println("check if Art avilable: " + subjectName.contains("Art")); // return ture after, item in the set
        System.out.println("check if Arabic avilable: " + subjectName.contains("Arabic")); // return false, item is not in the set
        subjectName.remove("History"); // remove only one item
        System.out.println(subjectName);
        System.out.println("total size is: " + subjectName.size()); // check the size of the set
        subjectName.add("Arabic");
        System.out.println(subjectName);
        System.out.println("total size is: " + subjectName.size()); // checking the size after adding new item
        subjectName.clear(); // remove all items of the set
        System.out.println(subjectName);
        System.out.println("the size now is: " + subjectName.size());
    }
}
