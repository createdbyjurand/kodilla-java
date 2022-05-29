package Modul_00_Witamy_w_bootcampie_online.Sekcja_05_Czym_jest_obiektowosc.resources;

public class Plane {

    private double maxWeight;
    private double emptyWeight;
    private double loadWeight;
    private double travelSpeed;
    private double flyHours;
    private double consumption;
    private double maxFuel;
    private double keroseneStorage;

    public Plane(
            double maxWeight,
            double emptyWeight,
            double loadWeight,
            double travelSpeed,
            double flyHours,
            double consumption,
            double maxFuel,
            double keroseneStorage
    ) {
        this.maxWeight = maxWeight;
        this.emptyWeight = emptyWeight;
        this.loadWeight = loadWeight;
        this.travelSpeed = travelSpeed;
        this.flyHours = flyHours;
        this.consumption = consumption;
        this.maxFuel = maxFuel;
        this.keroseneStorage = keroseneStorage < this.maxFuel ? keroseneStorage : this.maxFuel;
    }

    public Plane() {
        System.out.println("Plane object created");
    }

    public void takeOff() {
    }

    public void landing() {
    }

    public double getMaxReach() {
        return (keroseneStorage / consumption) * travelSpeed;
    }
}

