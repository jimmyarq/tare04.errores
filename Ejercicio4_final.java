package mx.generation;
import java.util.Scanner;

public class Codigo4 {
    public static void main(String[] args) {
    	// Se crea un objeto Scanner para entrada del usuario
        Scanner s = new Scanner(System.in);
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();

        if (j1.equals(j2)) { 
        // Se coloca el método equals para comparar en reemplazando ==
            System.out.println("Empate");
        } else {
            int g = 2;
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) { 
        // equals en lugar de ==
                        g = 1;            	
                    }
                    break; 
        // Se agrega break después de cada case

                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;

                case "tijeras": 
        // Se cambia el nombre de "tijera" a "tijeras", para el input del usuario
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;

                default:
                    break; 
        // Se agrega default case y un break para entradas inválidas
            }
            System.out.println("Gana el jugador " + g);
        }
    }
}
