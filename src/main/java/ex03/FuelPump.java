package ex03;

import java.text.DecimalFormat;

public class FuelPump {
    private String fuelType;
    private double fuelPrice;
    private double fuelQuantity;

    DecimalFormat toDecimal = new DecimalFormat("0.00");

    public FuelPump(String fuelType, double fuelPrice, double fuelQuantity) {
        this.fuelType = fuelType;
        this.fuelPrice = fuelPrice;
        this.fuelQuantity = fuelQuantity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelPrice() {
        return fuelPrice;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public String refuelByValue(double value) {
        double amount = value / fuelPrice;
        String formattedAmount = toDecimal.format(amount);
        return "\n Foram abastecidos " + formattedAmount + " litros.";
    }

    public String refuelByLiters(double liters) {
        double total = fuelPrice * liters;
        String formattedTotal = toDecimal.format(total);
        return "\n O valor total será de R$ " + formattedTotal + ".";
    }
}
