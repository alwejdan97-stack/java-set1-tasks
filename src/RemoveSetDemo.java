import java.util.HashSet;
import java.util.Set;

public class RemoveSetDemo {
    public static void main(String[] args){
        Set<String> productName = new HashSet<>();
        productName.add("pen");
        productName.add("notebook");
        productName.add("pag");
        productName.add("paper");
        productName.add("board");
        System.out.println(productName);
        productName.remove("board");
        System.out.println(productName);
    }
}
