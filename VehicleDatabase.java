package assessment;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class VehicleDatabase {

    private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public void add(Vehicle v){
        Vehicle veh = new Vehicle(v.getManufacturer(), v.getTotal_kms_driven(), v.isCurrent_status());
        vehicleList.add(veh);
    }

    public double getAverageKilometres(){
        Double avgKm = 0.0;
        for (Vehicle v: vehicleList){
            avgKm += v.getTotal_kms_driven();
        }
        return avgKm/vehicleList.size();
    }

    public Vehicle getVehicleById(long id){
        for(Vehicle v: vehicleList){
            if(v.getVehicle_id()==id){
                return v;
            }
        }
        return null;
    }

    public ArrayList<Vehicle> getVehiclesInRange(double minKilo, double maxKilo){
        ArrayList<Vehicle> vehInRange = new ArrayList<Vehicle>();
        for (Vehicle v: vehicleList){
            if(v.getTotal_kms_driven() < maxKilo && v.getTotal_kms_driven() > maxKilo){
                vehInRange.add(v);
            }
        }
        return vehInRange;
    }

    public void reportVehicles(){

        try {
            PrintWriter pw = new PrintWriter(new File("vehicles-report.txt"));

            pw.printf("ID    MAKE     KILOMETER     OUT ON STREET");
            pw.println();

            for (Vehicle v : vehicleList) {
                long id = v.getVehicle_id();
                String manufacturer = v.getManufacturer();
                double kms = v.getTotal_kms_driven();
                boolean currentStatus = v.isCurrent_status();
                pw.printf("%d    %s     %f     %b", id, manufacturer, (double) kms, currentStatus);
                pw.println();
            }

            pw.close();
        }catch (Exception e){
            System.out.println("Some Error Occured " + e);
        }

    }
}
