import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            map.put("Key_" + i, "Value_" + i);
        }

        Iterator<Map.Entry<String, String>> m = map.entrySet().iterator();
        for (Map.Entry<String, String> x : map.entrySet()) {

        }
    }
}
