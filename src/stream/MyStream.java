package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStream<T> {
    private List<T> elements;

    public static <T> MyStream<T> of(List<T> aList) {
        return new MyStream<>(aList);
    }

    private MyStream(List<T> aList) {
        this.elements = aList;
    }

    public static <S> MyStream<S> concat(MyStream<S> s1, MyStream<S> s2) {
        List<S> list = new ArrayList<>();
        list.addAll(s1.elements);
        list.addAll(s2.elements);
        return new MyStream<>(list);
    }

    public <R> MyStream<R> flatMap(Function<T, MyStream<R>> mapper) {
        //implement
        List<R> list = new ArrayList<>();
        for (T t : this.elements) {
            MyStream r = mapper.apply(t);
        }
        return null;
    }

    public List<T> asList() {
        return this.elements;
    }

    public <R> MyStream<R> map(Function<T, R> mapper) {
        List<R> els = new ArrayList<>();
        for (T t : this.elements) {
            R r = mapper.apply(t);
            els.add(r);
        }
        return new MyStream<>(els);
    }

    public MyStream<T> filter(Predicate<T> predicate) {
        List<T> els = new ArrayList<>();
        for (T t : this.elements) {
            if (predicate.test(t)) {
                els.add(t);
            }
        }
        return new MyStream<>(els);
    }
}
