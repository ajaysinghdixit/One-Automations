package practice;

import java.util.Collection;
import java.util.List;

public class TestGenerics {
    public  <T extends Collection<T>> void metOne(List<T> lst){
        System.out.println(lst);
    }

    public  void metOtwo(List lst){
        System.out.println(lst);
    }
}

