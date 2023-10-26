package session15_equals_hashcode.challenges.extend_enum_17;

public enum CarType implements PriceService, ManufacturerService{

    MODEL_Y,
    V60,
    BRONCO;

    @Override
    public String toString() {
        return "Car type: " + this.name() + " price: $" + getPrice() + ", manufacturer " + getManufacturer();
    }

    @Override
    public double getPrice() {
        double result = 0;
        switch (this.name()){
            case "BRONCO" -> result = 35000;
            case "V60" -> result = 55000;
            case "MODEL_Y" -> result = 75000;
        }
        return result;
    }

    @Override
    public String getManufacturer() {
        String result = "";
        switch (this.name()){
            case "BRONCO" -> result = "Ford";
            case "V60" -> result = "Volvo";
            case "MODEL_Y" -> result = "Tesla";
        }
        return result;
    }
}
