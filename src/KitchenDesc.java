/**
 * Created by kiarash on 2017-01-09.
 */
public interface KitchenDesc extends ProductDesc, KitchenApplianceDesc {
    public int getKitchenWidth();

    public void setKitchenWidth(int width);

    public int getKitchenHeight();

    public void setKitchenHeight(int height);

    public int getKitchenDepth();

    public void setKitchenDepth(int depth);
}
