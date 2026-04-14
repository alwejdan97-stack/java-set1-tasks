import java.util.HashSet;
import java.util.Set;

public class CarSetDemo {
    public static void main(String[] args){
        Set<String> carName = new HashSet<>();
        carName.add("corolla"); // adding items to the set
        carName.add("mazda");
        carName.add("cammry");
        carName.add("sunny");
        carName.add("jeep");
        System.out.println(carName);
        carName.add("BMW"); // add new unique item
        System.out.println(carName);
        carName.add("jeep"); // this item will not be added, because it's duplicated
        System.out.println(carName);
        System.out.println("check if jeep avilable: " + carName.contains("jeep")); // return ture after, item in the set
        System.out.println("check if Audi avilable: " + carName.contains("Audi")); // return false, item is not in the set
        carName.remove("mazda"); // remove only one item
        System.out.println(carName);
        System.out.println("total size is: " + carName.size()); // check the size of the set
        carName.add("sunny");
        System.out.println(carName);
        System.out.println("total size is: " + carName.size()); // checking the size after adding new item
        carName.clear(); // remove all items of the set
        System.out.println(carName);
        System.out.println("the size now is: " + carName.size());
    }
}
