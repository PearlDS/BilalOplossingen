public class ShoePair {

    private String brand;
    private boolean complete;
    private String colour;
    private int size;
    private double price;


    public ShoePair(String brand, boolean complete, String colour, int size, double price) {
        this.brand = brand;
        this.complete = complete;
        this.colour = colour;
        this.size = size;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShoePair{" +
                "brand='" + brand + '\'' +
                ", complete=" + complete +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
