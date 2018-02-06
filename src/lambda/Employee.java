package lambda;

public class Employee implements Comparable<Employee> {
    private String firstName, lastName;
    private int salary;

    public Employee(String f, String l, int s) {
        this.firstName = f;
        this.lastName = l;
        this.salary = s;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("first name: ");
        sb.append(firstName);
        sb.append(" last name: ");
        sb.append(lastName);
        sb.append(" salary: ");
        sb.append("").append(salary).append(">");
        return sb.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        if (o.getClass() != this.getClass()) return -1;
        return this.getFirstName().compareTo(o.firstName);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}

