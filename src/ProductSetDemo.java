import java.util.HashSet;
import java.util.Set;

public class ProductSetDemo {
    public static void main(String[] args){
        Set<String> productName = new HashSet<>();
        productName.add("product 1");
        productName.add("product 2");
        productName.add("product 3");
        productName.add("product 4");
        productName.add("product 5");
        productName.add("product 6");
        System.out.println(productName);
        productName.add("product 6");
        System.out.println("check if product 6 avilable: " + productName.contains("product 6"));
        productName.remove("product 6");
        System.out.println(productName);
        System.out.println("total size is: " + productName.size());
        productName.clear();
        System.out.println(productName);
        System.out.println("total size is: " + productName.size());
    }
}
