package practice;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestJukeBox {
    public static void main(String[] args) throws Exception {
        String var = "makemv ytrip";
        String var2 = var.substring(1);
        System.out.println(var2);
        System.out.println(var.charAt(0));
        String strAny = """
                I can type anything"'/hello is
                !@
                """;
        System.out.printf(String.format("this is %1$s %2$s", "one","two"));

        System.out.println(strAny);
        String stttttttt = "07:05:45PM";
        System.out.println(stttttttt.substring(0,2));
        stttttttt = stttttttt.replace(stttttttt.substring(0,2), String.valueOf(Integer.parseInt(stttttttt.substring(0,2)) + 12));
        System.out.println(stttttttt);
        List<Integer> lst = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        lst.sort(Collections.reverseOrder());
        List<Integer> nls = lst.stream().limit(3).toList();
        int[] arrint = new int[]{lst.get(0),lst.get(1)};
        System.out.println("limited list" + nls);
        System.out.println(Arrays.toString(new int[]{lst.get(0), lst.get(1)}));
        String s = "12:45:54PM";
        System.out.println("date thing");
        System.out.println(date(s));
        Map<Integer,Integer> candles = new HashMap<>();
        candles.put(1,101);
        candles.put(2,102);
        candles.put(3,103);
        candles.put(4,104);
        candles.put(5,105);
        candles.put(6,106);
        candles.put(7,107);
        candles.put(8,108);
        candles.put(9,lst.get(0)+lst.get(1));
        for(Map.Entry m : candles.entrySet()){
            System.out.println("printong map entry");
            System.out.println(m.getKey());
            System.out.println(m.getValue());

        }
        System.out.println("map keys");
        System.out.println(candles.keySet().stream().mapToInt(Integer -> Integer).max().isPresent());
        System.out.println(candles.values());
        System.out.println("keys in list"+ lst);
        Map<Integer,Integer> mapp = candles.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("is map sorted" + mapp);
        int[] retArr = new int[4];
        retArr[0] = 3;
        int p = retArr.length ;

        System.out.println(candles.put(5,1));
        System.out.println("map thing");
        System.out.println(candles.get(3));
        if (candles.containsKey(3)){

        }
        staircase(6);
        if (0 > 10)
            System.out.println("lolo");
        else if (0 > 19)
            System.out.println("lololo");
        System.out.println((15 - 23) + " " + (23 - 31));
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(List.of(1, 2, 3));
        matrix.add(List.of(11, 12, 13));
        System.out.println(matrix.get(0).get(2));
        List<Integer> elements = List.of(1, 4, -3, 0, 6, -9, 0, 1, 8, -12);
        int[] arrr = new int[]{1,2,3,4,5,6};
        elements.lastIndexOf("");
        System.out.println("max using stream"+ elements.stream().mapToInt(v->v).max());
        System.out.println("max using stream"+ elements.stream().mapToInt(v->v).max());
        miniMaxSum(elements);
        elements = List.of(7,69,2,221,8974);
        miniMaxSum(elements);
        double negatives = elements.stream().filter(i -> i < 0).count();
        double positives = elements.stream().filter(i -> i > 0).count();
        double zeros = elements.stream().filter(i -> i == 0).count();
        System.out.printf("%.4f%n", negatives / elements.size());
        System.out.printf("%15s", "heading1");
        System.out.println(positives / elements.size());
        System.out.println(zeros / elements.size());
        List<Integer> arList = IntStream.of(1, 2, 3, 4, 5).boxed().toList();
        List<JukeBox> carvan = new ArrayList<>();
        carvan.add(new JukeBox().setTitle("Song One").setGenre("Rock").setSinger("Sonu").setYear(2020));
        carvan.add(new JukeBox().setTitle("Song Two").setGenre("Chill").setSinger("Shaan").setYear(2021));
        carvan.add(new JukeBox().setTitle("Song Three").setGenre("Sad").setSinger("Shanu").setYear(2022));
        carvan.add(new JukeBox().setTitle("Song Four").setGenre("Stupid").setSinger("Sonu").setYear(2023));
        carvan.add(new JukeBox().setTitle("Song Five").setGenre("Hot").setSinger("Alka").setYear(2024));
        carvan.add(new JukeBox().setTitle("Song One").setGenre("Sot").setSinger("Sunidhi").setYear(2025));
        carvan.add(new JukeBox().setTitle("Song Two").setGenre("Pot").setSinger("Udit").setYear(2026));
        carvan.add(new JukeBox().setTitle("Song Three").setGenre("Rot").setSinger("Falguni").setYear(2027));
        carvan.add(new JukeBox().setTitle("Song Four").setGenre("Got").setSinger("KK").setYear(2028));
        carvan.add(new JukeBox().setTitle("Song Two").setGenre("Rock").setSinger("Sonu").setYear(2029));
        carvan.add(new JukeBox().setTitle("Song Four").setGenre("Stupid").setSinger("Sonu").setYear(2020));
        System.out.println(carvan);
        Collections.sort(carvan);
        System.out.println("sorted");
        System.out.println(carvan);
        System.out.println(carvan.get(0).equals(carvan.get(carvan.size() - 2)));

        carvan.stream().limit(3);

        System.out.println("hello");
        List<JukeBox> filtered = carvan.stream().filter(song -> song.getGenre().equals("Rock"))
                .sorted(Comparator.comparing(JukeBox::getTitle))
                .toList();
        System.out.println(filtered);
        System.out.println("file read");
        byte[] arr = TestJukeBox.class.getResourceAsStream("maven.properties").readAllBytes();
        for (Byte b : arr
        ) {
            System.out.println(b.toString());

        }
        System.out.println();
        TestJukeBox.class.getResourceAsStream("maven.properties").read();
        System.out.println("file read");
        carvan.sort(Comparator.comparing(JukeBox::getYear));
        System.out.println(carvan);

        Collections.sort(carvan);

        List<String> lstone = carvan.stream().map(JukeBox::getGenre).distinct().sorted().toList();
        System.out.println(lstone);
        System.out.println(Integer.MAX_VALUE);
//        TestJukeBox.rInt(new int[5]);

        List<Integer> arrayInt = List.of(1,5,-10,34,12,8);
        String sttt = "helloworld";



    }

    public static int rInt(int[] arr) throws Exception {
        if (arr == null) {
            throw new RuntimeException();
        } else throw new Exception();
    }

    public static void staircase(int n) {
        for (int index = 1; index <= n; index++) {
            for (int col = 1; col <= n - index; col++) {
                System.out.print(" ");
            }
            for (int hash = 1; hash <= index; hash++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int sum = 0;
        int largest = arr.get(0);
        int lowest = arr.get(0);
        for (Integer integer : arr) {
            sum = integer + sum;
            if (integer > largest) {
                largest = integer;
            } else if (integer < lowest)
                lowest = integer;
        }
        System.out.println("largest" + largest);
        System.out.println("lowest" + lowest);
        System.out.println((sum - largest) + " " + (sum-lowest));
    }

    public static String date(String s){
        if(s.startsWith("12") && s.endsWith("AM")){
            s = s.replace(s.substring(0,2),"00");
        }
        else if(s.endsWith("PM") && !s.startsWith("12")){
            s = s.replace(s.substring(0,2),String.valueOf(Integer.parseInt(s.substring(0,2))+12));
        }
        return s.substring(0,s.length()-2);
    }
}
