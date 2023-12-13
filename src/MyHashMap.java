import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> dicitionarulNostru = new HashMap<>();
        dicitionarulNostru.put(1, "First");
        dicitionarulNostru.put(2, "Second");
        dicitionarulNostru.put(3, "Third");
        dicitionarulNostru.put(4, "Forth");

        // dicitionarulNostru.replace(3,"Third-replace");
        // System.out.println(dicitionarulNostru.replace(3,"Third-replace");
        System.out.println(dicitionarulNostru.size());
        dicitionarulNostru.remove(3);
        dicitionarulNostru.replace(2, "Second-repalce");
        System.out.println(dicitionarulNostru.get(2));

        System.out.println(dicitionarulNostru.get(3));
        System.out.println(dicitionarulNostru.get(4));

        System.out.println(dicitionarulNostru.keySet());

        System.out.println(dicitionarulNostru.values());
        System.out.println(dicitionarulNostru.containsValue("First"));
        System.out.println(dicitionarulNostru.containsValue(1));

        for (int key : dicitionarulNostru.keySet()) {
            System.out.println(key);
        }
        for (String value : dicitionarulNostru.values()) {
            System.out.println(value);
        }


    }
}
