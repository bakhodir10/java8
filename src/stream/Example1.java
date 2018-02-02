package stream;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static List<Student> myFunction1(List<Student> students, List<Integer> ids) {
        return students.stream()
                .filter(s -> ids.indexOf(s.getId()) > -1)
                .collect(Collectors.toList());
    }

    public static List<String> myFunction2(List<Student> students, List<Integer> ids) {
        return students.stream()
                .filter(s -> ids.indexOf(s.getId()) > -1)
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static String myFunction3(List<Student> students) {
        return students.stream()
                .filter(s -> s.getId() > 5)
                .map(Student::getName)
                .collect(Collectors.joining(","));
    }

    public static Student myFunction4(List<Student> students) {
        return students.stream()
                .reduce(null,
                        (before, after) -> before == null ? after
                                : before.getId() > after.getId() ? before : after);
    }

    public static List<Person> myFunction5(List<Student> students) {
        return students.stream()
                .filter(e -> e.getAge() > 18)
                .map(e -> new Person(e.getName(), "ssn", e.getAge()))
                .collect(Collectors.toList());
    }

    public static List<Integer> myFunction6(HashMap<Integer, Student> stds, List<Integer> ids) {
        return stds.values().
                stream()
                .filter(e -> ids.contains(e.getId()))
                .map(Student::getId)
                .collect(Collectors.toList());
    }
}