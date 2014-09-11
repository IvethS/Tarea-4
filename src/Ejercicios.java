import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class MiClase
{
	int x;
	public MiClase(int x) {
		this.x = x;
	}
	
};

class MiException extends Exception
{
	
}

public class Ejercicios {


	  void funcion() throws MiException
	{
		throw new MiException();
	}

	//Devuelve la division entre 'a' y 'b'
	//Se deben manejar las excepciones en caso de dividir entre 0
	static int dividir(int a, int b)
	{
		int division=0;
		Scanner s = new Scanner (System.in);
		try 
		{
			
			 a = s.nextInt();
			
			b = s.nextInt();
			division=(a/b);
			
		}catch(ArithmeticException mi_exception)
		{
			System.out.println("Error: No se puede divid entre 0.");
		
		}finally
		{
		System.out.println("FInal del programa.");
	}
		
		return division;
	}
	
	//Devuelve el valor almacenado en 'arreglo' en la posicion 'pos'
	//Se deben manejar las excepciones en caso la posicion se salga de los limites
	static int getNumero(int arreglo[], int pos)
	{
		
		
		return -1;
	}
	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	@SuppressWarnings("null")
	static int getX(MiClase mi_clase)
	{
		try 
		{
	
			 mi_clase = null;
			 
		}catch(InputMismatchException mi_exception)
		{
			System.out.println("Error: No se puede dejar vacio");
		
		}finally
		{
		System.out.println("FInal del programa.");
	}
		return mi_clase.x;
		
	}

	
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	static int getPromedio(ArrayList<Integer> mi_lista)
	{
	
	
		    int n1=0;
		    int n2=0;
		    int n3=0;
		    int n4=0;
		    int promedio=0;
	
			mi_lista.add(n1);
			mi_lista.add(n2);
			mi_lista.add(n3);
			mi_lista.add(n4);
			mi_lista.add(promedio);
				
			promedio= (n1+n2+n3+n4/4);
			

			
			
		return promedio;
	}
	
	//Devuelve el numero mayor almacenado en 'mi_lista'
	static int getMayor(ArrayList<Integer> mi_lista)
	{
		return -1;
	}
	
	//Devuelve true si 'mi_lista' contiene 'str' de lo contrario devuelve false
	static boolean existe(ArrayList<String> mi_lista, String str)
	{
		return false;
	}
	
	public static void main(String[] args)
	{ 
	}

}
