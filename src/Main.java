import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int armut,elma,domates,muz,patlıcan;
		double tutar;
		Scanner deger = new Scanner(System.in);
		System.out.print("armut kilogram giriniz: ");
		armut=deger.nextInt();
		System.out.print("elma kilogram giriniz: ");
		elma=deger.nextInt();
		System.out.print("domates kilogram giriniz: ");
		domates=deger.nextInt();
		System.out.print("muz kilogram giriniz: ");
		muz=deger.nextInt();
		System.out.print("patlican kilogram giriniz: ");
		patlıcan=deger.nextInt();
		tutar=armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlıcan*5;
		System.out.println("alisverisinizin tutari: "+ tutar);
	}

}
