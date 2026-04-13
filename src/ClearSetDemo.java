import java.util.HashSet;
import java.util.Set;

public class ClearSetDemo {
    public static void main(String[] args){
        Set<String> temporaryUser = new HashSet<>();
        temporaryUser.add("Ali");
        temporaryUser.add("Sara");
        temporaryUser.add("Omar");
        temporaryUser.add("Wejdan");
        temporaryUser.add("Hoor");
        System.out.println(temporaryUser);
        System.out.println("the total size of set is: " + temporaryUser.size());
        temporaryUser.clear();
        System.out.println("the total size of set is: " + temporaryUser.size());
    }
}
