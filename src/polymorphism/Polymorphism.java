package polymorphism;

class Ship {
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getYearBuilt() {
        return yearBuilt;
    }
    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    public void printShip() {
        System.out.println("Ship Name: " + name);
        System.out.println("Year Built: " + yearBuilt);
    }
}

class CruiseShip extends Ship {
    private int maxPassengers;
    
    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }
    
    public int getMaxPassengers() {
        return maxPassengers;
    }
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    @Override
    public void printShip() {
        System.out.println("Ship Name: " + getName());
        System.out.println("Year Built: " + getYearBuilt());
        System.out.println("Maximum Passengers: " + maxPassengers);
    }
}

class CargoShip extends Ship {
    private int cargoCapacity;
    
    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }
    
    public int getCargoCapacity() {
        return cargoCapacity;
    }
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public void printShip() {
        System.out.println("Ship Name: " + getName());
        System.out.println("Year Built: " + getYearBuilt());
        System.out.println("Cargo Capacity (in tonnage): " + cargoCapacity);
    }
}

public class Polymorphism {
    
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Ship", "2020");
        ships[1] = new CruiseShip("Cruise Ship", "2021", 100);
        ships[2] = new CargoShip("Cargo Ship", "2022", 10000);
        
        for (Ship ship : ships) {
            ship.printShip();
            System.out.println(); 
        }
    }
    
}