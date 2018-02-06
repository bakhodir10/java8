package lambda;


import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, String> search =
            (list, salary, ch) -> list
                    .stream()
                    .filter(e -> e.getSalary() > salary)
                    .filter(e -> e.getLastName().charAt(0) > ch)
                    .map(Employee::getFullName)
                    .sorted()
                    .collect(Collectors.joining(","));
}
