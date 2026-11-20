public class BuildABike {

   private String brand;
   private String model;
   private int yearMade;
   private double priceBoughtFor;
   private double bikeCurrentValue;
   private double totalMilesRidden;
   private boolean isWorking;
   
   public BuildABike() {
   brand = "Propain";
   model = "Tyee 6.1";
   yearMade = 2022;
   priceBoughtFor = 5000.00;
   bikeCurrentValue = 4000.00;
   totalMilesRidden = 100;
   isWorking = true;
   }
   
   public BuildABike(String brand, String model, int yearMade, double priceBoughtFor, double bikeCurrentValue, double totalMilesRidden, boolean isWorking) {
   this.brand = brand;
   this.model = model;
   this.yearMade = yearMade;
   this.priceBoughtFor = priceBoughtFor;
   this.bikeCurrentValue = bikeCurrentValue;
   this.totalMilesRidden = totalMilesRidden;
   this.isWorking = isWorking;
   }
   
   public void goForARide(double milesRidden) {
   totalMilesRidden += milesRidden;
   bikeCurrentValue -= 10.0;
   System.out.println("You go for a " + milesRidden + " mile bike ride, your bikes value decreases by 10$ and is now: " + bikeCurrentValue);
   }
   
   public double washBike() {
   bikeCurrentValue += 25.0;
   return bikeCurrentValue;
   }
   
   public void crash() {
   isWorking = false;
   System.out.println("You crash your bike and it breaks. Also you broke your leg and can't walk.");
   }
   
   public boolean fixBike() {
   isWorking = true;
   return isWorking;
   }
   
   public void upgradeBike(String partReplaced) {
   bikeCurrentValue += 100;
   System.out.println("You replaced " + partReplaced + " and your bikes value increased by 100$");
   }
}