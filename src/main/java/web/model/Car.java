package web.model;

public class Car {

    String model;
    String color;
    int series;

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

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Car(String model, String color, int series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }
}
