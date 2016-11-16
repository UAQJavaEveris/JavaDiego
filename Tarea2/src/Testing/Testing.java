package Testing;

public class Testing {
	
	public static void main(String args[])throws Exception{

		int numeros [] = {1,2,3,4,5,7};
		int limite = 5;
		if (limite < numeros.length) {
			throw new Exception();
		}
		else{
			System.out.println("Sin exception");
		}
	}
}
