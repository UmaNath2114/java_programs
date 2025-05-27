public class Car {
    private String model;
    private String color;
    private int year;
    private int price;

    public Car(String model,String color,int year,int price){
        this.model=model;
        this.color=color;
        this.year=year;
        this.price=price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[]args){
        Car car1=new Car("BMW","red",2025,15000000);
        Car car2=new Car("TOYOTO","Blue",2024,5000000);
        System.out.println(car1.getModel() + " is a " + car1.getColor() + " color car released in " + car1.getYear() + " price of " + car1.getPrice());
        System.out.println(car2.getModel() + " is a " + car2.getColor() + " color car released in " + car2.getYear() + " price of " + car2.getPrice());


    }
}
