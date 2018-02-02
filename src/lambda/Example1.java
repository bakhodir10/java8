package lambda;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };

//        Consumer<String> consumer = e -> System.out.println(e);
//        Consumer<String> consumer = System.out::print;
          List<String> list = Arrays.asList("Bakhodir", "Javokhir");
//        list.forEach(consumer);
          list.forEach(e -> e.toUpperCase());
    }
}