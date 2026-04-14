import java.util.HashSet;
import java.util.Set;

public class citySetDemo2 {
    public static void main(String[] args){
        Set<String> cityName = new HashSet<>();
        cityName.add("Muscat");
        cityName.add("Al-Hamra");
        cityName.add("Nizwa");
        cityName.add("Rustaq");
        cityName.add("Sur");
        System.out.println(cityName);
        cityName.add("Sohar"); // add new unique item
        System.out.println(cityName);
        cityName.add("Rustaq"); // this item will not be added, because it's duplicated
        System.out.println(cityName);
        System.out.println("check if Sohar avilable: " + cityName.contains("Sohar")); // return ture after, item in the set
        System.out.println("check if Salalah avilable: " + cityName.contains("Salalah")); // return false, item is not in the set
        cityName.remove("Rustaq"); // remove only one item
        System.out.println(cityName);
        System.out.println("total size is: " + cityName.size()); // check the size of the set
        cityName.add("Buhla");
        System.out.println(cityName);
        System.out.println("total size is: " + cityName.size());
        cityName.clear(); // remove all items of the set
        System.out.println(cityName);
        System.out.println("the size now is: " + cityName.size());
    }
}
