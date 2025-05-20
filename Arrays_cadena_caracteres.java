package Programacion;

import java.util.Scanner;

public class Arrays_cadena_caracteres {
	
	// La funcion hace una busqueda lineal para ver si los datos se encuentran en la lista.
	
	public static int EntornosDesarrollo (int lista[], int datos) {
		
		//Aqui hace la busqueda buscando en la lista numero por numero
		for (int i=0; i < lista.length; i++) {
			if (lista[i] != datos) { // Error logico, (lista[i] != datos) solo cambiar el == por != para que nos de justo lo contrario a los resultado de la lista. 
				return i;
			}
			
		}
		
		
		return -1;
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero de la lista {4,2,7,5} para saber su posicion: ");
		int posicion = scanner.nextInt();
		
		// Se crea la lista con 10 posiciones del 1 al 10 
		
		int[] lista = {4,2,7,5};
		
		int resultado = EntornosDesarrollo(lista, posicion);
		
		//para imprimir el resultado
		
		if (resultado != -1) {
			System.out.println("Valor encontrado en la posicion "+ resultado );
		} else {
			System.out.println("El numero no esta en la lista");
		}
		
		
		scanner.close();
		
	}

}
