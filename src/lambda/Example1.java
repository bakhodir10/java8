package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> consumer1 = e -> System.out.print(e);
        Consumer<String> consumer2 = System.out::print;
        List<String> list = Arrays.asList("Bakhodir", "Javokhir");
        list.forEach(consumer);
        list.forEach(String::toUpperCase);
    }
}