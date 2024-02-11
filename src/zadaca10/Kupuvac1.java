package zadaca10;

public class Kupuvac1 {
	private int kupuvacID;
	private Adresalok adresaLinija;
	public Kupuvac1(int kupuvacID,Adresalok adresaLinija) {
		this.kupuvacID=kupuvacID;
		this.adresaLinija=adresaLinija;
	}
	public int getKupuvacID() {
		return kupuvacID;
	}
	public Adresalok getAdresaLinija() {
		return adresaLinija;
	}
}