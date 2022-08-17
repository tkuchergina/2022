public class Dog {
    String breed;
    boolean hasOwner;
    int age;

    public Dog(String dogBreed, boolean dogOwned, int dogYears) {
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        Dog mydog = new Dog("poodle", false, 5);
        Dog sistersDog = new Dog("shiba inu", true, 10);
        boolean Older = (mydog.age > sistersDog.age);
        int TotalAge = mydog.age + sistersDog.age;

        System.out.println("Two dogs created: a " + mydog.breed + "and a " + sistersDog.breed);
        System.out.println("The statement that mydoc is an older doc is:" + Older);
        System.out.println("The total age of thees dogs is " + TotalAge);
    }
}
