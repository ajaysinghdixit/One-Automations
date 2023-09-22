package practice;

import java.util.*;

public class TestOne {
    String str;

    public TestOne(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        TestOne one = new TestOne("hoo");
        System.out.println(one.str);
        String str = """
                My name is
                anthony ghonsalvis,"
                    mai duniya' me akela hoon\\n dil bhi hai
                        khali.
                """;
        System.out.println(str.translateEscapes().strip());
        int a = 12;
        String b = "22";
        int dd = Integer.parseInt(b);
        System.out.println(a + dd);
        System.out.println(a + Integer.parseInt(b));
        System.out.println(Integer.toString('b'));
        char[] ch = new char[3];
        ch[0] = 'a';
        ch[1] = 'b';
        System.out.println(String.valueOf(ch));
        int[] d = {1, 2, 3};
        System.out.println(str.substring(1));

        System.out.println(Roman.valueOf("X").getValue());

        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        String str1 = "IVXCDM";
        System.out.println(romans.get(str1.charAt(0)));
        System.out.println(romans.get(str1.charAt(1)));
        System.out.println(romans.get(str1.charAt(2)));
        System.out.println(romans.get(str1.charAt(3)));
        System.out.println(romans.get(str1.charAt(4)));
        System.out.println(romans.get(str1.charAt(5)));
        System.out.println("substring is" + str1.substring(0, str1.length()));
        System.out.println(str1.substring(str1.indexOf("VX"),4));
        System.out.println(str1.contains("IV"));
        String[] sttr = new String[6];
        System.out.println(sttr.length);
        for (String s : sttr) {
        }

        List<String> lst = new ArrayList<>();
        lst.add("a");
        lst.add("b");
        lst.add("c");
        lst.add("d");
        lst.add("e");
        System.out.println(lst);
        lst.add(2,"f");
        System.out.println(lst);
//        metOne(lst);

        List<String> strlst = new ArrayList<>(10);
        strlst.add("hello");
        strlst.add("moto");
        strlst.add("moto");
        strlst.add("moto");
        strlst.add("motoone");
        strlst.forEach(System.out::println);


        Set<String> setOne = new HashSet<>(strlst);
        System.out.println(setOne);
        String strrrr = "Hello";
        System.out.println(setOne.stream().toList());

    }

    public static <T extends Comparator<? super T>> void metOne(List<T> list){
        System.out.println(list);
    }
}

enum Roman {

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private final int value;

     Roman(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
