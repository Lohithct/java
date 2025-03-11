class Battery {
    private int capacity;
    public Battery(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void displayInfo() {
        System.out.println("Battery Capacity: " + capacity + " MAH");
    }
}
class Mobile {
    private String model;
    private Battery battery; 
    public Mobile(String model, Battery battery) {
        this.model = model;
        this.battery = battery;
    }
    public void displayInfo() {
        System.out.println("Mobile Brand: " + model);
        battery.displayInfo(); 
    }
}
public class Main {
    public static void main(String[] args) {
        Battery battery = new Battery(6000); 
        Mobile mobile = new Mobile("Realmi 12+ pro 5g", battery);
        mobile.displayInfo();
    }
}
