
import java.util.HashSet;
import java.util.Set;

public class TestHasSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("BD");
        set.add("UK");
        set.add("USA");
        set.add("UKS");
        set.add("RUS");
        System.out.println(set);
        set.remove("USA");
        System.out.println(set.size());
        System.out.println(set);
        
        Set<String> set2 = new HashSet<>();
        set2.add("JAPAN");
        set2.add("RUS");
        set2.add("NEPAL");
        set.addAll(set2);
        System.out.println("\n");

        System.out.println(set2);
        System.out.println("\n");
        set2.addAll(set);
        System.out.println(set2);
    }

}
