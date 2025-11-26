/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX1;

/**
 *
 * @author aco9500
 */
public class Temperatura {
    //atributs
    private double Celsius;
    //constructor

    public Temperatura() {   //constructor per defecte
    }
    
    public Temperatura(double Celsius) {
        this.Celsius = Celsius;
    }
    //getters i setters
    public double getCelsius() {
        return Celsius;
    }
    public void setCelsius(double Celsius) {
        if(Celsius>-50 && Celsius<50){
            this.Celsius = Celsius;
        }else{
            System.out.println("La temperatura està en un "
                    + "rang no valid");
        }
    }
    //metode
    public double grausFahrenheit(){
        return (9.0/5.0)*Celsius+32;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "Celsius=" + Celsius + 
                " Fahrenheit=" + this.grausFahrenheit()+ '}';
    }
    
}
