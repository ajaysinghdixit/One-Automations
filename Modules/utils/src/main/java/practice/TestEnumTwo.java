package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum TestEnumTwo {
    BIG(10,"large"){
        @Override
        void make(){
            System.out.println("making big one");
        }
    },
    SMALL(5,"Small") {
        @Override
        void make() {
            System.out.println("making small one");
        }
    };

    final int price;
    final String size;

    abstract void make();

    TestEnumTwo(int price, String size){
        this.price = price;
        this.size = size;
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println(Arrays.stream(TestEnumTwo.values()).filter(value -> value.price==10).toList().get(0));
        TestEnumTwo.valueOf("BIG").make();
        String[] strs = new String[3];
        strs[0] = "zab";
        strs[1] = "ycd";
        strs[2] = "xef";
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        List<String> str = new ArrayList<>(List.of(strs));
        Collections.sort(str);
        List<List<Integer>> result = new ArrayList<>();
        int last = 0;

        System.out.println(str.size());
        System.out.println(str.indexOf("djdj"));
    }
}
