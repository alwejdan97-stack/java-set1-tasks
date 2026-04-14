import java.util.HashSet;
import java.util.Set;

public class AppSetDemo {
    public static void main(String[] args){
        Set<String> appName = new HashSet<>();
        appName.add("whatsApp");
        appName.add("snapchat");
        appName.add("youtube");
        appName.add("Gmail");
        appName.add("instagram");
        System.out.println(appName);
        appName.add("youtube");
        System.out.println(appName);
        System.out.println("check if snapchat avilable: " + appName.contains("snapchat"));
        appName.remove("snapchat");
        System.out.println(appName);
        System.out.println("total size is: " + appName.size());
        appName.clear();
        System.out.println(appName);
        System.out.println("total size is: " + appName.size());
    }
}
