package zadaca10;
	public class Adresalok {
		 private int stanBr;
		 private String lokacija;
		 public Adresalok (int stanBr , String lokacija) {
			this.stanBr = stanBr;
			this.lokacija = lokacija;
		 }
		 public int getStanBr() {
			 return stanBr;
				}
		public String getLokacija() {
			return lokacija;
			}
		}
		class Kupuvac {
			private int kupuvacID;
			 private Adresalok adresaLinija;
			 public Kupuvac (int kupuvacID , Adresalok adresaLinija){
				 this.kupuvacID = kupuvacID;
				 this.adresaLinija = adresaLinija;
			 }
			 public int getKupuvacID() {
				 return kupuvacID;
			 }
			 public Adresalok getAdresaLinija() {
				 return adresaLinija;
			}
		}
		class Dostava{
			public static void main(String[] args) {
				String lokacija = new String ("Naselbal, Zgrada2"); 
				Adresalok adresal = new Adresalok (15, lokacija);
				Kupuvac tom = new Kupuvac(1212, adresal); 
				System.out.println("Kupuvac Id:"  + tom.getKupuvacID());
				System.out.println("Stan br: "  + tom.getAdresaLinija().getStanBr());
				System.out.println("Lokacija:" + tom.getAdresaLinija().getLokacija());
				System.out.println();
				Adresalok adresa2 = new Adresalok (32, lokacija); 
				Kupuvac marko = new Kupuvac (1673, adresa2);
			System.out.println("Kupuvac Id: " + marko.getKupuvacID());
			System.out.println("Stan br: " + marko.getAdresaLinija().getStanBr());
			System.out.println("Lokacija:" + marko.getAdresaLinija().getLokacija());
			}
			}

