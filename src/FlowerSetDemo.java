import java.util.HashSet;
import java.util.Set;

public class FlowerSetDemo {
    public static void main(String[] args){
        Set<String> flowerName = new HashSet<>();
        System.out.println("add item to flowerName Set");
        flowerName.add("Rose"); // adding items to the set
        flowerName.add("Lily");
        flowerName.add("Tulip");
        flowerName.add("Daisy");
        flowerName.add("Sunflower");
        System.out.println("display flowerName Set: "+ flowerName);
        System.out.println("add one more unique item to flowerName Set");
        flowerName.add("Orchid"); // add new unique item
        System.out.println("display flowerName Set: "+ flowerName);
        System.out.println("try to add duplicated item to flowerName Set");
        flowerName.add("Sunflower"); // this item will not be added, because it's duplicated
        System.out.println("display flowerName Set: "+ flowerName);
        System.out.println("check if Orchid avilable: " + flowerName.contains("Orchid")); // return ture after, item in the set
        System.out.println("check if Dahlia avilable: " + flowerName.contains("Dahlia")); // return false, item is not in the set
        System.out.println("try to remove one item from flowerName Set");
        flowerName.remove("Tulip"); // remove only one item
        System.out.println("display flowerName Set: "+ flowerName);
        System.out.println("total size is: " + flowerName.size()); // check the size of the set
        System.out.println("add one more unique item to flowerName Set");
        flowerName.add("Dahlia");
        System.out.println("display flowerName Set: "+ flowerName);
        System.out.println("total size is: " + flowerName.size()); // checking the size after adding new item
        System.out.println("remove all items from flowerName Set");
        flowerName.clear(); // remove all items of the set
        System.out.println("display flowerName Set: "+ flowerName);
        System.out.println("the total size of flowerName Set now is: " + flowerName.size());
    }
}
