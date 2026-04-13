import java.util.HashSet;
import java.util.Set;

public class CourseSetDemo {
    public static void main(String[] args){
        Set<String> courseName = new HashSet<>();
        courseName.add("course 1");
        courseName.add("course 2");
        courseName.add("course 3");
        courseName.add("course 4");
        courseName.add("course 5");
        System.out.println(courseName);
        courseName.add("course 4");
        System.out.println(courseName);
        System.out.println("check if course 4 is avilable: " + courseName.contains("course 4"));
        courseName.remove("course 4");
        System.out.println(courseName);
        System.out.println("total size is: " + courseName.size());
        courseName.clear();
        System.out.println(courseName);
        System.out.println("total size is: " + courseName.size());
    }
}
