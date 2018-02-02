package generic;

import java.util.Collection;

public class Example1 {
    public static <E extends Collection<E>> boolean find1(E list, E el) {
        return list.contains(el);
    }
}
