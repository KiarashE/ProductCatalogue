/**
 * Created by kiarash on 2017-01-09.
 */
public class Kitchen extends Product implements KitchenDesc {

    public int width;
    public int height;
    public int depth;
    public boolean hasStove;
    public boolean hasFridge;
    public boolean hasFreezer;
    public boolean hasMicro;

    @Override
    public int getKitchenWidth() {
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.width);
        return this.width;
    }

    @Override
    public void setKitchenWidth(int width) {
        this.width = width;
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.width);
    }

    @Override
    public int getKitchenHeight() {
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.height);
        return this.height;
    }

    @Override
    public void setKitchenHeight(int height) {
        this.height = height;
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.height);
    }

    @Override
    public int getKitchenDepth() {
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.depth);
        return this.depth;
    }

    @Override
    public void setKitchenDepth(int depth) {
        this.depth = depth;
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.depth);
    }

    @Override
    public void setStove(boolean hasStove) {
        this.hasStove = hasStove;
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.hasStove);
    }

    @Override
    public void setFridge(boolean hasFridge) {
        this.hasFridge = hasFridge;
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.hasFridge);
    }

    @Override
    public void setFreezer(boolean hasFreezer) {
        this.hasFreezer = hasFreezer;
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.hasFreezer);
    }

    @Override
    public void setMicro(boolean hasMicro) {
        this.hasMicro = hasMicro;
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.hasMicro);
    }

    @Override
    public boolean hasStove() {
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.hasStove);
        return this.hasStove;
    }

    @Override
    public boolean hasFridge() {
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.hasFridge);
        return this.hasFridge;
    }

    @Override
    public boolean hasFreezer() {
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.hasFreezer);
        return this.hasFreezer;
    }

    @Override
    public boolean hasMicro() {
        System.out.println("Method: \"" + new Object(){}.getClass().getEnclosingMethod().getName() + "\" Value of " + this.getClass().getSimpleName() + ": " + this.hasMicro);
        return this.hasMicro;
    }


}
