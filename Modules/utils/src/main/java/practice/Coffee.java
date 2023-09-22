package practice;

import java.util.Arrays;

public enum Coffee {
    BIG(10,"A"),
    MEDIUM(5,"B"),
    SMALL(2,"C");
    final int price;
    final String size;
    Coffee(int price, String size){
        this.price = price;
        this.size = size;
    }
}

 class TestCoffee{
     public static void main(String[] args) {
         Coffee[] cf = Coffee.values();
         System.out.println(Arrays.toString(cf));
         Integer[] intt = new Integer[5];
         intt[0] = 1;
         System.out.println(Arrays.toString(intt));
     }
}