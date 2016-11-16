package Testing;
import mx.com.everis.tallerjava.exception.*;
import java.util.Scanner;


public class Testing{
	
	public static void main(String[] args) {

		int []arreglo1 = new int [5];

		Scanner S = new Scanner(System.in);

		Exceptiones obj = new Exceptiones();
		

			try{
				int a = 0;
					
					do{
						System.out.print("Introduce un valor para el arreglo 1: ");
						arreglo1[a] = S.nextInt();
						a++;
					}while(a < 5);
						
			}catch(Exception e){
				System.out.println("");
				obj.Regla1();
				
			}finally{

				try{
					for (int i = 0; i < arreglo1.length; i++){
						if(arreglo1[i] > 9){
							int error;
							error = arreglo1[i]/0;
						}
					}

				}catch(Exception e){
					obj.Regla2();
				}
				finally{

					try{
						for (int i = 0; i < arreglo1.length; i++){
							if(arreglo1[i] < 0){
								int error;
								error = arreglo1[i]/0;
							}
						}
						
					}catch(Exception e){
						obj.Regla3();
					}
					finally{
						obj.termino();
					}
				}
			}
	
	}

}