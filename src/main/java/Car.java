public class Car {
    private String carName;
    private double carPrice;
    private boolean isElectric;

    public Car(String name, double price, boolean isElectric) {
        this.carName = name;
        this.carPrice = price;
        this.isElectric = isElectric;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
