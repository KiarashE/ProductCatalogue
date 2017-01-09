/**
 * Created by kiarash on 2017-01-09.
 */
public class Product implements ProductDesc {

    public double price;
    public String brand;

    @Override
    public double getPrice() {
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.price);
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.price);
    }

    @Override
    public String getBrand() {
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.brand);
        return this.brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.brand);
    }
}
