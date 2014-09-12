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
		//inicialize la variable luego hice el calculo matematico y devuele las exceptions.
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
	try{//devuelve un valor almacenado, y si se escede de los limites nos marca exception.
		return arreglo[pos];
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.print("se salio de los limites de la posicion");
	}
		return 0;	
		
	
	}
	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	@SuppressWarnings("null")
	static int getX(MiClase mi_clase)
	{
		//este proceso lo que hace es mandar a llamar la clase y si no es asi muestraa la exception si es valor nulo
		try{
			return mi_clase.x;
		}catch(Exception e){
			System.out.print("No es valido, vuelva intentar");
		}
		return 0;
	
		
	}

	
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	static int getPromedio(ArrayList<Integer> mi_lista)
	{
            //INICIALIZO LAS VARIABLES, LUEGO SE HACE EL CALCULO DEL PROMEDIO.
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
			
//devuelvo el valor de esa vaariable
			
			
		return promedio;
	}
	//con ayuda de esta pagina:http://jarroba.com/arraylist-en-java-ejemplos
	//Devuelve el numero mayor almacenado en 'mi_lista'
	static int getMayor(ArrayList<Integer> mi_lista)
	{
		//lo que se hace es un ciclo para poder obtener los valores y asi definir el mayor.
	int obtenermayor=mi_lista.get(0);
		
		for(int i=0;i<mi_lista.size();i++){
		if(mi_lista.get(i)>obtenermayor){
			obtenermayor=mi_lista.get(i);
		}
	
		}
		return obtenermayor;
	}
		//con ayuda de esta pagina:http://jarroba.com/arraylist-en-java-ejemplos/
	//Devuelve true si 'mi_lista' contiene 'str' de lo contrario devuelve false
	static boolean existe(ArrayList<String> mi_lista, String str)
	{
		//lo que se hace es un ciclo para poder obtener los valores y asi obtener si encuentra texto sino devuele falso
		for(int i=0;i<mi_lista.size();i++){
			if(mi_lista.get(i)==str){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{ 
	}

}
