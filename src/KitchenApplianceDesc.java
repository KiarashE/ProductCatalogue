/**
 * Created by kiarash on 2017-01-09.
 */
public interface KitchenApplianceDesc {
    public void setStove(boolean hasStove);
    public void setFridge(boolean hasFridge);
    public void setFreezer(boolean hasFreezer);
    public void setMicro(boolean hasMicro);
    public boolean hasStove();
    public boolean hasFridge();
    public boolean hasFreezer();
    public boolean hasMicro();
}
