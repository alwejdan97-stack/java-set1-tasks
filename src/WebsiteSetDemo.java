import java.util.HashSet;
import java.util.Set;

public class WebsiteSetDemo {
    public static void main(String[] args){
        Set<String> websiteName = new HashSet<>();
        websiteName.add("website 1");
        websiteName.add("website 2");
        websiteName.add("website 3");
        websiteName.add("website 4");
        websiteName.add("website 5");
        System.out.println(websiteName);
        websiteName.add("website 5");
        System.out.println(websiteName);
        System.out.println("check if website 7 avilable: " + websiteName.contains("website 7"));
        websiteName.remove("website 3");
        System.out.println(websiteName);
        System.out.println("total size is: " + websiteName.size());
        websiteName.clear();
        System.out.println(websiteName);
        System.out.println("total size is: " + websiteName.size());
    }
}
