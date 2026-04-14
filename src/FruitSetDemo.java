import java.util.HashSet;
import java.util.Set;

public class FruitSetDemo {
    public static void main(String[] args){
        Set<String> fruitlName = new HashSet<>();
        System.out.println("add item to fruitlName Set");
        fruitlName.add("Apple"); // adding items to the set
        fruitlName.add("Banana");
        fruitlName.add("Orange");
        fruitlName.add("Grape");
        fruitlName.add("Mango");
        System.out.println("display fruitlName Set: "+ fruitlName);
        System.out.println("add one more unique item to fruitlName Set");
        fruitlName.add("Strawberry"); // add new unique item
        System.out.println("display fruitlName Set: "+ fruitlName);
        System.out.println("try to add duplicated item to fruitlName Set");
        fruitlName.add("Mango"); // this item will not be added, because it's duplicated
        System.out.println("display fruitlName Set: "+ fruitlName);
        System.out.println("check if Mango avilable: " + fruitlName.contains("Mango")); // return ture after, item in the set
        System.out.println("check if Cherries avilable: " + fruitlName.contains("Cherries")); // return false, item is not in the set
        System.out.println("try to remove one item from fruitlName Set");
        fruitlName.remove("Mango"); // remove only one item
        System.out.println("display fruitlName Set: "+ fruitlName);
        System.out.println("total size is: " + fruitlName.size()); // check the size of the set
        System.out.println("add one more unique item to fruitlName Set");
        fruitlName.add("Cherries");
        System.out.println("display fruitlName Set: "+ fruitlName);
        System.out.println("total size is: " + fruitlName.size()); // checking the size after adding new item
        System.out.println("remove all items from fruitlName Set");
        fruitlName.clear(); // remove all items of the set
        System.out.println("display fruitlName Set: "+ fruitlName);
        System.out.println("the total size of fruitlName Set now is: " + fruitlName.size());
    }
}
