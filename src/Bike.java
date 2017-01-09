/**
 * Created by kiarash on 2017-01-09.
 */
public class Bike extends Product implements BikeDesc {

    public int size;
    public String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

}
