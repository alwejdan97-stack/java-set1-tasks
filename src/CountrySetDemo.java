import java.util.HashSet;
import java.util.Set;

public class CountrySetDemo {
    public static void main(String[] args){
        Set<String> countryName = new HashSet<>();
        countryName.add("Oman"); // adding items to the set
        countryName.add("UAE");
        countryName.add("KSA");
        countryName.add("Qatar");
        countryName.add("Kuwait");
        System.out.println(countryName);
        countryName.add("Eygept"); // add new unique item
        System.out.println(countryName);
        countryName.add("Qatar"); // this item will not be added, because it's duplicated
        System.out.println(countryName);
        System.out.println("check if Eygept avilable: " + countryName.contains("Eygept")); // return ture after, item in the set
        System.out.println("check if Yeman avilable: " + countryName.contains("Yeman")); // return false, item is not in the set
        countryName.remove("Qatar"); // remove only one item
        System.out.println(countryName);
        System.out.println("total size is: " + countryName.size()); // check the size of the set
        countryName.add("Yeman");
        System.out.println(countryName);
        System.out.println("total size is: " + countryName.size()); // checking the size after adding new item
        countryName.clear(); // remove all items of the set
        System.out.println(countryName);
        System.out.println("the size now is: " + countryName.size());
    }
}
