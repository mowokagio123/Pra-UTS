import java.util.Scanner;

public class Perjalanan{
	public static void main(String []args){
		Mobil Jalan = new Mobil(180,0,0);
		Scanner scan = new Scanner (System.in);
		while (!Jalan.isstarted()) {
			System.out.println("1. Start");
			System.out.println("2. stop");
			System.out.println("3. Rem");
			System.out.println("4. Over gigi");
			System.out.println("5. Gas");
			System.out.println("");
			System.out.println("Kecepatan Mobil "+ Jalan.getkecActual());
			System.out.println("Pilihan anda ");
			int pilih = scan.nextInt();
			switch (pilih){
				case 1 :
					Jalan.started();
					break;
				case 2 :
					Jalan.stop();
					break;
				case 3 :
					Jalan.rem();
					break;
				case 4 :
					System.out.println("Pilih Gigi 1-5");
					int Gigi = scan.nextInt();
					Jalan.gantiGigi(Gigi);
					break;
				case 5 :
					Jalan.gas();
					if (Jalan.getkecActual() == 180) {
						System.out.println("Kecepatan sudah pada batasnya");
					}
					break;

 			}		
		}

	}
}