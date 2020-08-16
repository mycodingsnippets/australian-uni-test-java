package assessment;

abstract class Commodity {
    String brandName;
    String description;
    double price;

    Commodity(){}

    Commodity(String brandName, String description, double price){
        this.brandName = brandName;
        this.description = description;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    abstract String getBrandName();
    abstract String getDescription();
}
