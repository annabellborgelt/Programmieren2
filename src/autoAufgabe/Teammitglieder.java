package autoAufgabe;

public abstract class Teammitglieder {
	public Teammitglieder(String name, String vorname, String nationalit�t, int nummer,int Anzahlderrennen) {
		this.name = name;
		this.vorname = vorname;
		Nationalit�t = nationalit�t;
		this.nummer = nummer;
		this.Anzahlderrennen=Anzahlderrennen;
	}
	private String name;
	private String vorname;
	private String Nationalit�t;
	private int nummer;
	public int saisongehalt;
	private int Anzahlderrennen;
	protected int renngehalt;
	
	
	public int Saisongehaltberechnen(){
		saisongehalt=Anzahlderrennen*renngehalt;
		return saisongehalt;
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNationalit�t() {
		return Nationalit�t;
	}
	public void setNationalit�t(String nationalit�t) {
		Nationalit�t = nationalit�t;
	}
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public int getAnzahlderrennen() {
		return Anzahlderrennen;
	}

	public void setAnzahlderrennen(int anzahlderrennen) {
		Anzahlderrennen = anzahlderrennen;
	}
}