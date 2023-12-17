import java.util.HashMap;
import java.util.Map;

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
        dicitionarulNostru.remove(1);
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
        // Adaugati un dictionar nou cu numele studenti cu elemente
        // key-value: numeStudent(String)-treceExamenul(Boolean).
        // Adaugati 5 elemente cu valori diferite.
        // Adaugati o metoda care sa afiseze doar studentii care trec examenu
        HashMap<String, Boolean> studenti = new HashMap<>();
        studenti.put("Ana", true);
        studenti.put("Radu", false);
        studenti.put("Mihai", true);
        studenti.put("Raul", false);
        studenti.put("Ion", true);

        afiseazaStudentiPromovati(studenti);
    }

    public static void afiseazaStudentiPromovati(Map<String, Boolean> studenti) {
        System.out.println("Studentii care au trecut examenul:");
        for (Map.Entry<String, Boolean> entry : studenti.entrySet()) {
            if (entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }
    }
}
