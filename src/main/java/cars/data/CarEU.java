package cars.data;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class CarEU extends Car implements Serializable {
    /**
     * Data class for eu car data
     */

    private static final long serialVersionUID = -3145577002152184851L;

    public String model;
    public List<String> labels;
    public String fuel;

    public double kilometerTotal;
    public double kilometerStart;
    public double estimatedRange;
    public double travelTimeTotal;
    public double travelTime;

    public double oilLevel;
    public double breakFluidLevel;
    public double fuelLevel;

    public boolean engineWarning;
    public boolean breaksWarning;
    public boolean forwardCollisionWarning;
    public boolean airbag;
    public boolean serviceCall;
    public double tirePressure;
    public boolean lightingSystemFailure;

    public double temperatureEngine;
    public double temperatureInside;
    public double temperatureOutside;
    public double temperatureBreaks;
    public double temperatureTires;

    public double breakPower;
    public boolean breakActive;

    public double gasPower;
    public boolean gasActive;
    public boolean light;
    public boolean acc;
    public double kmh;
    public double rpm;
    public double oxygenLevel;

    public boolean infotainmentOn;
    public String infotainmentService;
    public double infotainmentVolume;

    public CarEU(String id, String model, List<String> labels, String fuel) {
        super.id = id;
        this.model = model;
        this.labels = labels;
        this.fuel = fuel;

        // Initialze car direction
        Random rand = new Random();
        super.dirX = rand.nextDouble() * (rand.nextBoolean() ? -1 : 1);
        super.dirY = rand.nextDouble() * (rand.nextBoolean() ? -1 : 1);

        super.lat = rand.nextInt(10) + 44 + rand.nextDouble();
        super.lon = rand.nextInt(32) - 2 + rand.nextDouble();
    };

    public void setValues(double kilometerTotal, double kilometerStart, double estimatedRange, double travelTimeTotal,
            double travelTime, double oilLevel, double breakFluidLevel, double fuelLevel, boolean engineWarning,
            boolean breaksWarning, boolean forwardCollisionWarning, boolean airbag, boolean serviceCall,
            double tirePressure, boolean lightingSystemFailure, double temperatureEngine, double temperatureInside,
            double temperatureOutside, double temperatureBreaks, double temperatureTires, double breakPower,
            boolean breakActive, double gasPower, boolean gasActive, boolean light, boolean acc, double kmh, double rpm,
            double oxygenLevel, boolean infotainmentOn, String infotainmentService, double infotainmentVolume) {

        this.kilometerTotal = kilometerTotal;
        this.kilometerStart = kilometerStart;
        this.estimatedRange = estimatedRange;
        this.travelTimeTotal = travelTimeTotal;
        this.travelTime = travelTime;
        this.oilLevel = oilLevel;
        this.breakFluidLevel = breakFluidLevel;
        this.fuelLevel = fuelLevel;
        this.engineWarning = engineWarning;
        this.breaksWarning = breaksWarning;
        this.forwardCollisionWarning = forwardCollisionWarning;
        this.airbag = airbag;
        this.serviceCall = serviceCall;
        this.tirePressure = tirePressure;
        this.lightingSystemFailure = lightingSystemFailure;
        this.temperatureEngine = temperatureEngine;
        this.temperatureInside = temperatureInside;
        this.temperatureOutside = temperatureOutside;
        this.temperatureBreaks = temperatureBreaks;
        this.temperatureTires = temperatureTires;
        this.breakPower = breakPower;
        this.breakActive = breakActive;
        this.gasPower = gasPower;
        this.gasActive = gasActive;
        this.light = light;
        this.acc = acc;
        this.kmh = kmh;
        this.rpm = rpm;
        this.oxygenLevel = oxygenLevel;
        this.infotainmentOn = infotainmentOn;
        this.infotainmentService = infotainmentService;
        this.infotainmentVolume = infotainmentVolume;
    }

    @Override
    public void setPos(double lat, double lon) {
        super.lat = lat;
        super.lon = lon;
    }
}