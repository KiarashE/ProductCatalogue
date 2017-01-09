public class Main {

    public static void main(String[] args) {

        ProductDesc bike = new Bike();
        bike.setBrand("Cannondale");
        bike.getBrand();
        bike.setPrice(40000);
        bike.getPrice();

        ProductDesc kitchen = new Kitchen();
        kitchen.setBrand("Vedum");
        kitchen.getBrand();
        kitchen.setPrice(850000);
        kitchen.getPrice();

        KitchenDesc kitchenDesc = new Kitchen();
        kitchenDesc.setBrand("IKEA");
        kitchenDesc.getBrand();
        kitchenDesc.setPrice(10000);
        kitchenDesc.getPrice();
        kitchenDesc.setKitchenWidth(5);
        kitchenDesc.getKitchenWidth();
        kitchenDesc.setKitchenDepth(8);
        kitchenDesc.getKitchenDepth();
        kitchenDesc.setKitchenHeight(3);
        kitchenDesc.getKitchenHeight();
        kitchenDesc.setFreezer(false);
        kitchenDesc.hasFreezer();
        kitchenDesc.setFridge(true);
        kitchenDesc.hasFridge();
        kitchenDesc.setMicro(true);
        kitchenDesc.hasMicro();

    }
}
