import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSamples {

    public static void main(String[] args) {
        HashMap<Integer, String> areasHashMap = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> areasLinkedHashMap = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> areasTreeMap = new TreeMap<Integer, String>();

        testMap(areasHashMap, "HashMap");
        testMap(areasLinkedHashMap, "LinkedHashMap");
        testMap(areasTreeMap, "TreeMap");
    }

    public static void testMap(Map<Integer, String> areasMap, String mapType) {
        System.out.println(mapType + ":");

        areasMap.put(3, "Limerick");
        areasMap.put(1, "Dublin");
        areasMap.put(4, "Galway");
        areasMap.put(5, "Belfast");
        areasMap.put(2, "Cork");

        for(Integer key: areasMap.keySet()) {
            String value = areasMap.get(key);

            System.out.println(key + ": " + value);
        }

        System.out.println(System.lineSeparator());
    }

}
