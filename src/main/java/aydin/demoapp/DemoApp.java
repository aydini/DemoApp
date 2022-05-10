/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aydin.demoapp;
import java.util.Scanner;
/**
 *
 * @author ilknur
 */
public class DemoApp {

    public static void main(String[] args) {
        
        
        Scanner s = new Scanner (System.in);
        Player p = new Player();
        int i = s.nextInt();
        p.name = "ilknur";
        System.out.println("Greetings World!" + i + p);
    }
}
