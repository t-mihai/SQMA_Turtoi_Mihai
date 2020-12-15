public class Car {

    String brand;
    boolean running;

    public Car(String brand) {
        this.brand = brand;
        this.running = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public String start(){
        this.running = true;
        return "Start";
    }

    public String stop(){
        this.running = false;
        return "Stop";
    }

}
