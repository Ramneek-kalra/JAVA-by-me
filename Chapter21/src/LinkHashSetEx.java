
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSetEx {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("london");
        set.add("Itali");
        set.add("Malishia");
        set.add("Quata");
        set.add("Esift");
        set.add("Turki");
        System.out.println(set);
        
        for(Object element:set){
            System.out.print(element+" ");
        }
    }
}
