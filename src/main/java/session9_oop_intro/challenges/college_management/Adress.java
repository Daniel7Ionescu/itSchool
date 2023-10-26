package session9_oop_intro.challenges.college_management;

public class Adress {

    private String cityName;
    private String streetName;
    private String buildingName;
    private int apartmentNumber;
    private int houseNr;

    //living in an apartment building
    public Adress(String cityName, String streetName, String buildingName, int apartmentNumber) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.buildingName = buildingName;
        this.apartmentNumber = apartmentNumber;
    }

    //living in a house
    public Adress(String cityName, String streetName, int houseNr) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.houseNr = houseNr;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(int houseNr) {
        this.houseNr = houseNr;
    }
}
