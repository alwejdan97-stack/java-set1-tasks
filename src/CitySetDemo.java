import java.util.HashSet;
import java.util.Set;

public class CitySetDemo {
    public static void main(String[] args){
        Set<String> cityName = new HashSet<>();
        cityName.add("Muscat");
        cityName.add("Nizwa");
        cityName.add("Al-Hamra");
        cityName.add("Buhla");
        cityName.add("Rustaq");
        System.out.println(cityName);
        cityName.add("Al-Hamra");
        System.out.println(cityName);
        System.out.println("is Al-Hamra avilable? " + cityName.contains("Al-Hamra"));
        cityName.remove("Al-Hamra");
        System.out.println(cityName);
        System.out.println("total size is: " + cityName.size());
        cityName.clear();
        System.out.println(cityName);
        System.out.println("total size is: " + cityName.size());
    }
}
