import java.util.HashSet;
import java.util.Set;

public class CustomerSetDemoTask {
    public static void main(String[] args){
        Set<Integer> customerID = new HashSet<>();
        customerID.add(1);
        customerID.add(2);
        customerID.add(3);
        customerID.add(4);
        customerID.add(5);
        for(Integer id : customerID){
            System.out.println(id);
        }
        customerID.add(4);
        for(Integer ID : customerID){
            System.out.println(ID);
        }
    }
}
