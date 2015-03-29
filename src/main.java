import java.util.Random;

public class main {

	public static void main(String[] args) {

		int[] heap = new int[10];

		Random generator = new Random();

		for (int i = 0; i < 10; i++){
			
			int l = generator.nextInt(100);
			heap[i] = l;

		}

		System.out.println("Moja tablica:");

		for (int i = 0; i < 10; i++){
			
			System.out.println("Komórka " + i + " ma wartość " + heap[i]);				
			
		}
		
	}

}

