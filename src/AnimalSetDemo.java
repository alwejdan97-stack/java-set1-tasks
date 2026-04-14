import java.util.HashSet;
import java.util.Set;

public class AnimalSetDemo {
    public static void main(String[] args){
        Set<String> animalName = new HashSet<>();
        System.out.println("add item to animalName Set");
        animalName.add("Cat"); // adding items to the set
        animalName.add("Cat");
        animalName.add("Goat");
        animalName.add("Zebra");
        animalName.add("Tiger");
        System.out.println("display animalName Set: "+ animalName);
        System.out.println("add one more unique item to animalName Set");
        animalName.add("Lion"); // add new unique item
        System.out.println("display animalName Set: "+ animalName);
        System.out.println("try to add duplicated item to animalName Set");
        animalName.add("Tiger"); // this item will not be added, because it's duplicated
        System.out.println("display animalName Set: "+ animalName);
        System.out.println("check if Lion avilable: " + animalName.contains("Lion")); // return ture after, item in the set
        System.out.println("check if Elephant avilable: " + animalName.contains("Elephant")); // return false, item is not in the set
        System.out.println("try to remove one item from animalName Set");
        animalName.remove("Lion"); // remove only one item
        System.out.println("display animalName Set: "+ animalName);
        System.out.println("total size is: " + animalName.size()); // check the size of the set
        System.out.println("add one more unique item to animalName Set");
        animalName.add("Elephant");
        System.out.println("display animalName Set: "+ animalName);
        System.out.println("total size is: " + animalName.size()); // checking the size after adding new item
        System.out.println("remove all items from animalName Set");
        animalName.clear(); // remove all items of the set
        System.out.println("display animalName Set: "+ animalName);
        System.out.println("the total size of animalName Set now is: " + animalName.size());
    }
}
