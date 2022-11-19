package ödoyeto;
import java.util.Scanner;

public class mmain {

	public static void main(String[] args) {
		binT tree=new binT();
		Scanner scanner = new Scanner(System.in);

		int t;
		do {
			System.out.println("Sayi ekleme islemi icin 1'e, donguden cikmak icin 0'a basin.\n");
			 t=scanner.nextInt();
			 
			 if(t==1) {
				 
		System.out.println("Saga eklemek icin 1'e, sola eklemek icin 2'ye, yazdirmak icin 3'e basin.\n");
		int z=scanner.nextInt();
		if(z==1) {
			
		System.out.println("ekleyeceginiz sayiyi girin:");
		int x=scanner.nextInt();
		
		tree.addright(x);
		
		}
		
		else if(z==2) {
			System.out.println("ekleyeceginiz sayiyi girin:");
			int x=scanner.nextInt();
			
			
			tree.addleft(x);
		}
		
		else if(z==3) {
			tree.printpreorder();
		}
		
		else {
			System.out.println("Hatali sayi girdiniz!!");
		}
			 }
			 
			 else if(t!=0) {
				 System.out.println("Hatalı islem secimi!!");
			 }
		
		}while(t!=0);
		
		System.out.println("Donguden Cikildi.");
	}
		
	}


