package models;

public abstract class Facility {
    private String serviceName;
    private String areaUsed;
    private String rentalCosts;
    private String maxPeople;
    private String costsType;

    public Facility() {
    }

    public Facility(String serviceName, String areaUsed, String rentalCosts, String maxPeople, String costsType) {
        this.serviceName = serviceName;
        this.areaUsed = areaUsed;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.costsType = costsType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(String areaUsed) {
        this.areaUsed = areaUsed;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getCostsType() {
        return costsType;
    }

    public void setCostsType(String costsType) {
        this.costsType = costsType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", areaUsed='" + areaUsed + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", maxPeople='" + maxPeople + '\'' +
                ", costsType='" + costsType + '\'' +
                '}';
    }
}
