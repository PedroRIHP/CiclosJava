import java.util.Scanner;

public class CiclosJava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  ciclo for
		 *  for (varIble de inicializacion; variable inicializacion < 10; variable++){
		 *  codigo
		 *  codigo
		 *  }
		 */
		/*
		 * ciclo while 
		 * este ciclo pregunta y despues se ejecuta, mientras se cumpla la condicion nunca se detiene, por eso es nesesario una condicion que en algun momento salga del bucle
		 * while(condicion){ // la condicion es la que, en algun punto llega a ser falsa, para que se detenga el ciclo while 
		 * codigo
		 * codigo
		 * codigo
		 * }
		 * 
		 * ciclo do while
		 * este ciclo se ejecuta y despues pregunta, si al final la condicion while: aun se cumple vuelve a ejecutarse
		 * do {
		 * codigo
		 * codigo
		 * codigo
		 * }while(condicion)
		 * 
		 */
	
		//for(int i=0; i <15;i++) {
		//	System.out.println(i+1);
		//}
		double x = 0;
		double y = 0;		
		//int a = 0;
		//System.out.println("metele el numero pai");
		//Scanner Entradaa = new Scanner (System.in);
		// a = Entradaa.nextInt ();
		 //tabla(a);
		 //numero(a);
		 juego(x,y);
		 juego2(x,y);
	}	
		
	
	/*
	public static void tabla(int a) {
			
		 for(int i=1; i <=10;i++) {
			 System.out.println(a + "X" + i + " = " + a*i);
			 System.out.println(a*i);
				
			}
		}
		
		public static void numero(int a) {
			int sumpar = 0;
			int sumimpar = 0;
		 for(int i=1; i <=a;i++) {
			 if (i % 2 == 0) {
				 sumpar = sumpar + i;
			 }else {
				 sumimpar = sumimpar + i;
			 }
				 System.out.println("numeros impares" + sumpar);
				 System.out.println("numeros pares" + sumimpar);
		
		 }
		
		}
		
		*/
		 
		/* Escribir un programa que pida 2 numeros por consola de manera reiterada
		 * La ejecución del programa terminará cuando los numeros ingresados sean
		 * iguales.
		 * 
		 * Nota: utilizar un ciclo while
		 */
		
		
		public static void juego(double x, double y) {
			
			while (x != y) { //el inicio del while con las variables X,Y declaradas en el Main como 1 y 0 para que sean diferetnes y arranque segun la condicion que le pedimos
				
				System.out.println("piensa un numero"); // aqui le pedimos un numero al usuario, el valor de X
				Scanner Entradax = new Scanner (System.in);
				 x = Entradax.nextInt ();
				 
				System.out.println("piensa otro numero"); // aqui tambien le pedimos otro numero, el valor de Y
				
				 y = Entradax.nextInt ();
				 
				 if (x==y) {
					 System.out.println("ya se acabo amigo XD"); // esto es para que el usuairo sepa que ya se termino
				 }
				 
			}	
		}
		
		public static void juego2(double x, double y) {
			Scanner Entradax = new Scanner (System.in);//el mismo escaner se puede usar para leer mas de una cosa, es un objeto
			do { //el inicio del while con las variables X,Y declaradas en el Main como 1 y 0 para que sean diferetnes y arranque segun la condicion que le pedimos
				
				System.out.println("piensa un numero"); // aqui le pedimos un numero al usuario, el valor de X
				
				 x = Entradax.nextInt ();
				 
				System.out.println("piensa otro numero"); // aqui tambien le pedimos otro numero, el valor de Y
				
				 y = Entradax.nextInt ();				// aqui usamos el escaner para leer la entrada y
				 
				 if (x==y) {
					 System.out.println("ya se acabo amigo XD"); // esto es para que el usuairo sepa que ya se termino
				 }
				 
			}while (x != y)	;
			Entradax.close();
		}


		 
	
}
