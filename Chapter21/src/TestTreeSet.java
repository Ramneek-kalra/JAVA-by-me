
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("london");
        set.add("paris");
        set.add("New York");
        set.add("San Fansisco");
        set.add("Beijinj");
        set.add("New York");

        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println(treeSet + "");
        System.out.println("first tree set: " + treeSet.first());
        System.out.println("last tree set: " + treeSet.last());
        System.out.println("handSet(\"New York\"): " + treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York\"): " + treeSet.tailSet("New York"));

        System.out.println("Lower(\"p\"): " + treeSet.lower("p"));
        System.out.println("higher(\"p\"): " + treeSet.higher("p"));
        System.out.println("floor(\"p\"): " + treeSet.floor("p"));
           System.out.println("ceiling(\"p\"): " + treeSet.ceiling("p"));
System.out.println("pollFirst(): " + treeSet.pollFirst());
System.out.println("pollLast(): " + treeSet.pollLast());
System.out.println("New tree set: " + treeSet);
        
        
    }

}
