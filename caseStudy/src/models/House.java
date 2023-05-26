package models;

public class House extends Facility{
     private String roomStandard;
     private String numberOfFloors;

    public House() {
    }

    public House(String roomStandard, String numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceName, String areaUsed, String rentalCosts, String maxPeople, String costsType, String roomStandard, String numberOfFloors) {
        super(serviceName, areaUsed, rentalCosts, maxPeople, costsType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                "} " + super.toString();
    }
}
