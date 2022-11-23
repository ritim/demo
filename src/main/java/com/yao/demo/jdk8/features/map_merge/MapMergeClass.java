package com.yao.demo.jdk8.features.map_merge;

import lombok.Data;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMergeClass {
    @Data
    static class Employee{
        private Long id;
        private String name;

        public Employee(long id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    public static <K, V> HashMap<K, V> merge(Map<K, V> map1, Map<K,V> map2){
        var result = new HashMap<K, V>(map1);
        map2.forEach((key, value) -> result.merge(key, value, (v1, v2) -> v2));
        return result;
    }

    public static <K, V> Map<K, V> mergeByStream(Map<K, V> map1, Map<K,V> map2){
        return Stream.of(map1, map2)
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v2));
    }

    public static void main(String[] args){
        Map<String, Employee> map1 = new HashMap<>();
        Map<String, Employee> map2 = new HashMap<>();

        Employee employee1 = new Employee(1L, "Henry");
        Employee employee2 = new Employee(22L, "Annie");
        Employee employee3 = new Employee(8L, "John");
        map1.put(employee1.getName(), employee1);
        map1.put(employee2.getName(), employee2);
        map1.put(employee3.getName(), employee3);
        //----------------------------------------
        Employee employee4 = new Employee(2L, "George");
        Employee employee5 = new Employee(3L, "Henry");
        map2.put(employee4.getName(), employee4);
        map2.put(employee5.getName(), employee5);


        var result1 = merge(map1, map2);
        System.out.println("Map1=>" + map1);
        System.out.println("Map2=>" + map2);
        System.out.println("result1=>" + result1);

        var result2 = mergeByStream(map1, map2);
        System.out.println("Map1=>" + map1);
        System.out.println("Map2=>" + map2);
        System.out.println("result2=>" + result2);


    }


}
