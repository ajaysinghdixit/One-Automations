package practice;

import java.util.concurrent.ConcurrentHashMap;

public class Compute {

    String fruit;
    Compute(String string){
        this.fruit = string;
        System.out.println("cons called");
    }

    public static void main(String[] args) {
        ConcurrentHashMap<String, Compute> map = new ConcurrentHashMap<>();
        map.computeIfAbsent("apple", (v)-> new Compute("apple"));
        map.computeIfPresent("apple", (k,v)-> new Compute("apple"));
        map.computeIfPresent("mango", (k,v)-> new Compute("apple"));
    }
}
