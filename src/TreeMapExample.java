import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        Map<String, Integer> treemap = new TreeMap<>();

        treemap.put("Dublin", 500000);
        treemap.put("Cork", 120000);
        treemap.put("Limerick", 80000);

        System.out.println(treemap);                ;
    }

}
