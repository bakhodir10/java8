package stream;

public class Person {
    private String name;
    private String ssn;
    private int age;

    public Person(String name, String ssn, int age) {
        this.name = name;
        this.ssn = ssn;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
