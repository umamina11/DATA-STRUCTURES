package hashtables.HashtableJDK;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billend = new Employee("Bill", "End", 78);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        // REplacing infroamtion
        // Employee employee = hashMap.put("Doe", mikeWilson);
        // System.out.println(employee);

        // PutifAbsent methods
        Employee employee = hashMap.putIfAbsent("Doe", mikeWilson);
        System.out.println(employee);

        // System.out.println(hashMap.get("someone", mikeWilson));

        System.out.println(hashMap.remove("Jones"));

        System.out.println(hashMap.containsValue("Doe"));
        System.out.println(hashMap.containsValue(janeJones));
        /*
         * Iterator<Employee> iterator = hashMap.values().iterator();
         * while (iterator.hasNext()) {
         * System.out.println(iterator.next());
         */
        // using for each method
        hashMap.forEach((k, v) -> System.out.println("key :" + k + "Employee : " + v));
    }
}
