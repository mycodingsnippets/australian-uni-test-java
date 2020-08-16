package assessment;

public class Shirt extends Commodity {

    boolean hasPockets;

    Shirt(String brandName, String description, double price,boolean hasPockets){
        super(brandName, description, price);
        this.hasPockets = hasPockets;
    }


    @Override
    public String getBrandName() {
        return brandName;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public boolean isHasPockets() {
        return hasPockets;
    }
}
