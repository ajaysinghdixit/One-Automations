package practice;

import java.util.function.Consumer;

public abstract class TestAbstractOne {
    public TestAbstractOne(){
        System.out.println("hello");
    }
    public void metOne(){
        System.out.println("hello");
    }
    
    public static void statOne(){
        System.out.println("I am static");
    }

    public static void main(String[] args) {
        Consumer<TestAbstractOne> metOne = TestAbstractOne::metOne;
        TestAbstractOne.statOne();
    }
}
