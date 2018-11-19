/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author biserPC
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {
        Map<String, String> unorderedMap = new HashMap<>();
        Map<String, String> orderedMap = new LinkedHashMap<>();
        Map<String, String> sortedMap = new TreeMap<>();
        
        String[][] pairs = {
            {"anton", "antonov"},
            {"peter", "petrov"},
            {"ivan", "ivanov"},
            {"simeon", "simeonov"},
            {"trendafil", "trendafilov"}
        };
        
        for(String[] pair : pairs){
            unorderedMap.put(pair[0], pair[1]);
            orderedMap.put(pair[0], pair[1]);
            sortedMap.put(pair[0], pair[1]);
        }
        
        //printMap(unorderedMap);
        //printMap(orderedMap);
        //printMap(sortedMap);
        
        for(Entry<String, String> pair : sortedMap.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        
        //System.out.println(sortedMap.get("simeon"));
    }

    private static void printMap(Map<String, String> map) {
        
        System.out.println(map.getClass().toString());
        
        Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Entry<String, String> pair = iterator.next();
            System.out.printf("%-15s %-15s%n", pair.getKey(), pair.getValue()); 
        }
        
        System.out.println();
    }
    
}
