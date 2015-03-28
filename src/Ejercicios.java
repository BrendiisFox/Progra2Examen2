import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicios {
	
	//Devuelve true si todos los elementos de mi_lista (dada) son pares, de lo contrario devuelve false.
	static boolean sonPares(ArrayList<Integer> mi_lista)
	{
		int encontrar = 0;
		//Se iguala la variable a cero.
		for(int b = 0; b < mi_lista.size(); b++)
		{
			if(mi_lista.get(b)%2==0)
				//Se utiliza un calculador de modulo (%) ya que el numero es par si es divisible entre dos.
					{
				encontrar ++;
				//Encontrar aumenta.
					}
			if(encontrar == mi_lista.size())
				//Ciclo para encontrar numeros par en la lista.
			{
				return true;
				//Si la condicion se cumple devuelve true (verdadero).
			}
		}

		return false;
	}
	
	//Escribe n1, n2 y n3 (dados) en un archivo con nombre nombre_archivo (dado) separados por espacios
	static void escribir3Numeros(String nombre_archivo,int n1, int n2,int n3)
	{
		try
		{
			PrintWriter b = new PrintWriter (nombre_archivo);
			//PrintWriter permite escribir dentro del documento "nombre_archivo".
			b.println(n1 + " " + n2 + " " + n3);
			//Devuelve los valores n1, n2, n3 con un espacio entre ellos-
			b.close();
			//Cierra PrintWriter.
		}catch(Exception b)
		{
			b.printStackTrace();
		}
	}
	
	//Devuelve true si el archivo con nombre nombre_archivo (dado) contiene al menos 2 palabras repetidas
	static boolean existenRepetidas(String nombre_archivo)
	{	
		try
		{
			String word = null, repet = null;
			//Se hace null
			Scanner b = new Scanner (new File(nombre_archivo));
			// atarapa lo que se escribe
			System.out.println(word);
		//imprime las palabras
			while(b.hasNext())
			//se crea un ciclo para recorrer el archivo
			{
				word = b.next();
				System.out.println(word);
				if(word.equals(repet));
				{
					return true;
				}
			}
		}catch(Exception b)
		{
			b.printStackTrace();
		}
		return false;
	}
}
	
		
		
