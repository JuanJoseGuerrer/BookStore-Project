
package javaapp;
import java.util.Scanner;
        
public class Data {
    public static void main(String[] args) {
        
        Books B1 = new Books("El principito", "Antoine de Saint-Exupery", "novela infantil", "1943", true, 1, 10, "sin usuario", 0, 0);
        Books B2 = new Books("El alquimista", "Paulo Coelho", "aventuras", "1988", true, 1, 10, "sin usuario", 0, 0);
        Books B3 = new Books("Cronica de una muerte anunciada", "Gabriel Garcia Marquez", "novela-policial", "1981", true, 1, 10, "sin usuario", 0, 0);
        
        Scanner sc = new Scanner(System.in); //entrada de datos
        System.out.println("¿Que libro deseas ver?");
        System.out.println(" 01 El principito");
        System.out.println(" 02 alquimista");
        System.out.println(" 03 cronica de una muerte anunciada01");
        String op = sc.nextLine();
        
        switch(op){
            case "01":
                System.out.println(B1);
                break;
            case "02":
                System.out.println(B2);
                break;
            case "03":
                System.out.println(B3);
        }
    }
    
   
    
    
    
}

