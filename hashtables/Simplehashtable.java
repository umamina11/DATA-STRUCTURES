package hashtables;

public class Simplehashtable {
    private Employee[] hashtable;

    public Simplehashtable() {
        hashtable = new Employee[10];

    }

    // check for the hashed key in table or not
    public void put(String key, Employee employee) {
        int hashedkey = hashkey(key); // index into the array
        if (hashtable[hashedkey] != null) {
            System.out.println("sorry, there's already an employee at the position " + hashedkey);
        } else {
            hashtable[hashedkey] = employee;
        }
    }

    // retrival
    public Employee get(String key) {
        int hashedkey = hashkey(key);
        return hashtable[hashedkey];
    }

    private int hashkey(String key) {
        return key.length() % hashtable.length;
    }

    // print hashtable methods
    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }

}
