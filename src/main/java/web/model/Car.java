package web.model;


public class Car {

    private String model;
    private int series;
    private int speed;

    public Car() {

    }

    public Car(String model, int series, int speed) {
        this.model = model;
        this.series = series;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getSpeed() {
        return speed;
    }

    public void seSSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car Model = " + model +", serialNumber =" + series + ", MaxSpeed = " + speed;
    }
}