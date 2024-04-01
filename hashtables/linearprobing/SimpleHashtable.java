package hashtables.linearprobing;

public class SimpleHashtable {
    private StoredEmployee[] hashtable;

    public SimpleHashtable() {
        hashtable = new StoredEmployee[10];

    }

    // check for the hashed key in table or not
    public void put(String key, Employee employee) {
        int hashedkey = hashkey(key); // index into the array
        // checking whether the index is occupied or not
        // thet define that we need probing or not
        if (occupied(hashedkey)) {
            // set stock index
            int stopIndex = hashedkey;
            if (hashedkey == hashtable.length - 1) {
                hashedkey = 0;
            } else {
                hashedkey++;
            }

            while (occupied(hashedkey) && hashedkey != stopIndex) {
                hashedkey = (hashedkey + 1) % hashtable.length;
            }

        }

        if (occupied(hashedkey)) {
            System.out.println("sorry, there's already an employee at the position " + hashedkey);
        } else {
            hashtable[hashedkey] = new StoredEmployee(key, employee);
        }
    }

    // retrival
    public Employee get(String key) {
        int hashedkey = findKey(key);
        if (hashedkey == -1) {
            return null;
        }
        return hashtable[hashedkey].employee;
    }

    private int hashkey(String key) {
        return key.length() % hashtable.length;
    }

    // checking that whethear a given positon is oiccupied or not
    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    // find the key
    private int findKey(String key) {
        int hashedkey = hashkey(key);
        if (hashtable[hashedkey] != null &&
                hashtable[hashedkey].key.equals(key)) {
            return hashedkey;
        }
        int StopInedx = hashedkey;
        if (hashedkey == hashtable.length - 1) {
            hashedkey = 0;
        } else {
            hashedkey++;
        }
        while (hashedkey != StopInedx && hashtable[hashedkey] != null &&
                !hashtable[hashedkey].key.equals(key)) {
            hashedkey = (hashedkey + 1) % hashtable.length;
        }
        if (StopInedx == hashedkey) {
            return -1;
        } else {
            return hashedkey;
        }

    }

    // print hashtable methods
    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("empty");
            } else {

                System.out.println("position " + i + ": " + hashtable[i].employee);
            }
        }
    }

}
