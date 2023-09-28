package com.systechafrica.part3.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class WorkingWithMaps {
    public static void main(String[] args) {

        // Map<KT,VT> map;
        List<String> johnNickNames = new ArrayList<>();
        johnNickNames.add("mhusika");
        johnNickNames.add("ntate");
        johnNickNames.add("yokana");

        List<String> smithNickNames = new ArrayList<>();
        smithNickNames.add("john");
        smithNickNames.add("doe");
        smithNickNames.add("smith");

        Map<String, String> students = new HashMap<>();
        Map<String, List<String>> studentMap = new HashMap<>();

        studentMap.put("john", johnNickNames);
        studentMap.put("smith", smithNickNames);

        System.out.println(studentMap);
        Set<Entry<String, List<String>>> entrySet = studentMap.entrySet();
        Set<String> keySet = studentMap.keySet();
        Collection<List<String>> values = studentMap.values();

        for (Entry<String, List<String>> record : entrySet) {
            System.out.println(record.getKey() + " => " + record.getValue());
        }
        for (List<String> nickNames : values) {
            System.out.println(nickNames);
        }
        for (String key : keySet) {
            System.out.println(key);
        }
        System.out.println("John nicknames: "+studentMap.get("john"));
        System.out.println("Contains Key emily: "+studentMap.containsKey("emily"));
        System.out.println("Contains value smithNickNames: "+studentMap.containsValue(smithNickNames));

    }
}
