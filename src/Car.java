public class Car {
    private String model;
    private int miles;

    public Car(String model, int miles) {
        this.model = model;
        this.miles = miles;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newName) {
        model = newName;
    }

    public String toString() {
        return model + " " + miles + "mi";
    }
}