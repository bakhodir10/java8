package lambda;

import java.util.LinkedList;
import java.util.List;

public class BiFunction {
    public static void myFunction2() {
        java.util.function.BiFunction<Double, Double, List<Double>> biF =
                (x, y) -> {
                    List<Double> list = new LinkedList<>();
                    list.add(Math.pow(x, y));
                    list.add(x * y);
                    return list;
                };
        System.out.println(biF.apply(2.0, 3.0));
    }
}
