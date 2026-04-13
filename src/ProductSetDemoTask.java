import java.util.HashSet;
import java.util.Set;

public class ProductSetDemoTask {
    public static void main(String[] args){
        Set<String> codeSet = new HashSet<>();
        codeSet.add("code 1");
        codeSet.add("code 2");
        codeSet.add("code 3");
        codeSet.add("code 4");
        codeSet.add("code 5");
        codeSet.add("code 6");
        codeSet.add("code 7");
        for(String code: codeSet){
            System.out.println(code);
        }
        codeSet.add("code 8");
        for(String code: codeSet){
            System.out.println(code);
        }

    }
}
