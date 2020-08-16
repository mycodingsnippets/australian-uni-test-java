package assessment;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PartCA {

    public static void main(String[] args) {
        ArrayList<Vehicle> v = processTextFile();
        for(Vehicle veh: v){
            System.out.println("----------------------");
            System.out.println(veh.getVehicle_id());
            System.out.println(veh.getManufacturer());
            System.out.println(veh.getTotal_kms_driven());
            System.out.println(veh.isCurrent_status());
            System.out.println("----------------------");
        }
    }

    public static ArrayList<Vehicle> processTextFile(){
        ArrayList<Vehicle> vehiclesList = new ArrayList<Vehicle>();
        try {
            int total_vehicles;
            FileReader f = new FileReader("C:\\Users\\y509120\\Desktop\\algoWorld\\src\\assessment\\vehicles.txt");
            Scanner s = new Scanner(f);

            total_vehicles = Integer.parseInt(s.nextLine());

            for(int i = 0; i <  total_vehicles; i++) {
                String manufacturer = null;
                double kms = 0;
                boolean onSteet = false;
                for (int j = 0; j < 3; j++) {
                    if (j % 3 == 0) {
                        manufacturer = s.nextLine();
                    } else if (j % 3 == 1) {
                        kms = Double.parseDouble(s.nextLine());
                    } else if (j % 3 == 2) {
                        onSteet = Boolean.parseBoolean(s.nextLine());
                    }
                }
                Vehicle v = new Vehicle(manufacturer, kms, onSteet);
                vehiclesList.add(v);
            }

            f.close();
        }catch (Exception e){
            System.out.println("Some Error Occured " + e);
        }
        return vehiclesList;
    }
}
