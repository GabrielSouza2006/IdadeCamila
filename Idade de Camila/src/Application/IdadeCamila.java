package Application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IdadeCamila {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> idades = new ArrayList(); 
		
		System.out.println("Digite as idades: ");
		for(int i=0; i<3; i++) {
			int idade = sc.nextInt();
			
			idades.add(idade);
		}
		
		Collections.sort(idades);
		
		System.out.println("A idade de Camila �: " + idades.get(1));
		
		sc.close();
	}

}
