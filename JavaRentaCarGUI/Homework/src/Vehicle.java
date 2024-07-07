public class Vehicle {
    public String brand;
    public String Plate ;
    public String segment ;
    public String fuelType;
    public String transmissionType ;
    public  String smokeType ;
    public String doorCount ;
    public int VehicleCharge;
    public boolean rent ;
    public String currentLoc ;
    public String[] Location = {"Kayseri","Bolu","Ankara","Istanbul","Mersin","Antalya","Izmir"};
    public Vehicle(){}

    public Vehicle(String Brand,String plate,String Segment,String fuelType,String TransmissionType,String smokeType,String doorCount,String currentLoc,int vehicleCharge)
    {
        this.brand = Brand;
        this.Plate = plate;
        this.segment = Segment;
        this.fuelType = fuelType;
        this.transmissionType = TransmissionType ;
        this.smokeType = smokeType;
        this.doorCount = doorCount;
        this.currentLoc = currentLoc ;
    }

    public String getSegment() {
        return segment;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getSmokeType() {
        return smokeType;
    }

    public String getDoorCount() {
        return doorCount;
    }

    public int getVehicleCharge() {
        return VehicleCharge;
    }

    public void setVehicleCharge(int vehicleCharge) {
        VehicleCharge = vehicleCharge;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public String getCurrentLoc() {
        return currentLoc;
    }

    public void setCurrentLoc(String currentLoc) {
        this.currentLoc = currentLoc;
    }
    public void ChangeLocation(String pull)
    {
    }
    public void PickLocation(String pick)
    {

    }

}
