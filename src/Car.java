class Program{
    public static void main(String[] args) {
        Car bmw = new Car();
        System.out.println(bmw.getColor());
        System.out.println(bmw.getPrice());
    }
}

public class Car {
    public String color;
    private int price;
    private int yearOfIssue;

    public Car(String color, int price, int yearOfIssue){
        this.color = color;
        this.price = price;
        this.yearOfIssue = yearOfIssue;
    }

    Car(){
        this("red", 10000, 5);
    }

    public String getColor(){
        return this.color;
    }

    public int getPrice(){
        return this.price;
    }

    private int getYearOfIssue(){
        return this.yearOfIssue;
    }
}


