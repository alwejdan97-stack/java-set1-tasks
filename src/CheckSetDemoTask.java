import java.util.HashSet;
import java.util.Set;

public class CheckSetDemoTask {
    public static void main(String[] args){
        Set<Integer> customerID = new HashSet<>();
        customerID.add(1);
        customerID.add(2);
        customerID.add(3);
        customerID.add(4);
        customerID.add(5);
        System.out.println(customerID);
        System.out.println(customerID.contains(4));
        System.out.println(customerID.contains(6));
    }
}
