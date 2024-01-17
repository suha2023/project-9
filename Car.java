
package sample;

/**
 *
 * @author suha9
 */
public class Car {
   public String brand; 
   
   public Car(){}
   public Car(String brand){
       this.brand=brand;
   }

    

    public String getBrand() {
        return brand;
    }
public void run(){
  System.out.println(this.brand + " Car is running...");
}
}

