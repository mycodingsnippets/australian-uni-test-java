package assessment;

public class Vehicle {

    private long vehicle_id = 0;
    private String manufacturer;
    private double total_kms_driven;
    private boolean current_status;

    private static long count = 0;

    public Vehicle(){}

    public Vehicle(String manufacturer, double total_kms_driven){
        this.vehicle_id = ++count;
        this.manufacturer = manufacturer;
        this.total_kms_driven = total_kms_driven;
        this.current_status = false;
    }

    public Vehicle(String manufacturer, double total_kms_driven, boolean current_status){
        this.vehicle_id = ++count;
        this.manufacturer = manufacturer;
        this.total_kms_driven = total_kms_driven;
        this.current_status = current_status;
    }

    public long getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(long vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getTotal_kms_driven() {
        return total_kms_driven;
    }

    public void setTotal_kms_driven(double total_kms_driven) {
        this.total_kms_driven = total_kms_driven;
    }

    public boolean isCurrent_status() {
        return current_status;
    }

    public void setCurrent_status(boolean current_status) {
        this.current_status = current_status;
    }

    public void changeKms(double km){
        this.total_kms_driven += km;
    }

}
