package zadaca10;

public class Dostava1 {
	public static void main(String[]args) {
		String lokacija=new String("Naselba1, Zgrada2");
		Adresalok adresa1=new Adresalok(15, lokacija);
		Kupuvac tom=new Kupuvac(1212, adresa1);
		System.out.println("KupuvacID:" + tom.getKupuvacID());
		System.out.println("StanBr:" + tom.getAdresaLinija().getStanBr());
		System.out.println("Lokacija:" + tom.getAdresaLinija().getLokacija());
		System.out.println();
		
		Adresalok adresa2=new Adresalok(32, lokacija);
		Kupuvac marko=new Kupuvac(1673, adresa2);
		System.out.println("KupuvacID" + marko.getKupuvacID());
		System.out.println("StanBr:" + marko.getAdresaLinija().getStanBr());
		System.out.println("Lokacija:" + marko.getAdresaLinija().getLokacija());
		
	}
}