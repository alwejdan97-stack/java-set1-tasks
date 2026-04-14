import java.util.HashSet;
import java.util.Set;

public class MovieSetDemo {
    public static void main(String[] args){
        Set<String> movieName = new HashSet<>();
        movieName.add("Movie 1");
        movieName.add("Movie 2");
        movieName.add("Movie 3");
        movieName.add("Movie 4");
        movieName.add("Movie 5");
        System.out.println(movieName);
        movieName.add("Movie 4");
        System.out.println(movieName);
        System.out.println("check if Movie 6 avilable: " + movieName.contains("Movie 6"));
        movieName.remove("Movie 4");
        System.out.println(movieName);
        System.out.println("total size is: " + movieName.size());
        movieName.clear();
        System.out.println(movieName);
        System.out.println("total size is: " + movieName.size());
    }
}
