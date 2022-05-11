/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package water.and.computer.manufacturing;

/**
 *
 * @author saliy5109
 */
import java.util.Scanner;

public class WaterAndComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        final double WATER_RATE = 1.5;
        double combos; 
        double total;
        
        System.out.println("How many computer/monitor combos do you own?");
        combos = input.nextDouble();
        
        total = combos * WATER_RATE;
        
        System.out.println("It took " + total + " tons of water to create those computers.");
    }
    
}
