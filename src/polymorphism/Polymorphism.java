package polymorphism;

class Ship {
    private String name;
    private String year;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void printShip() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
    }
}

class CruiseShip extends Ship {
    private int maxPassengers;
   
    public int getMaxPassengers() {
        return maxPassengers;
    }
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    @Override
    public void printShip() {
        System.out.println("Name: " + getName());
        System.out.println("Year: " + getYear());
        System.out.println("Maximum Passengers: " + maxPassengers);
    }
}

class CargoShip extends Ship {
    private int cargoCapacity;
  
    public int getCargoCapacity() {
        return cargoCapacity;
    }
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public void printShip() {
        System.out.println("Name: " + getName());
        System.out.println("Year: " + getYear());
        System.out.println("Cargo Capacity (in tonnage): " + cargoCapacity);
    }
}

public class Polymorphism {
    
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        
        ships[0] = new Ship();
        ships[0].setName("Ship");
        ships[0].setYear("2020");
        
        ships[1] = new CruiseShip();
        ships[1].setName("Cruise Ship");
        ships[1].setYear("2021");
        ((CruiseShip)ships[1]).setMaxPassengers(100);
        
        ships[2] = new CargoShip();
        ships[2].setName("Cargo Ship");
        ships[2].setYear("2023");
        ((CargoShip)ships[2]).setCargoCapacity(10000);
        
        for (Ship ship : ships) {
            ship.printShip();
            System.out.println(); 
        }
    }
    
}
