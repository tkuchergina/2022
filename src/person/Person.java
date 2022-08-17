package person;

public class Person {
    String name;
    int age;
    Integer salary;
    {
        System.out.println("Объект готов быть создан");
    }
    public Person(String name, int age, Integer salary) {
        this(name, age);
        this.salary = salary;
        System.out.println("Объект создан");
    }

    Person(){
        this("Tom", 18, 0);
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("David", 34, 1000);
        System.out.println(person.name + " " + person.age + " " + person.salary);
    }

}
