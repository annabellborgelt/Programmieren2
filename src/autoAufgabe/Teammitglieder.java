package autoAufgabe;

public abstract class Teammitglieder {
	public Teammitglieder(String name, String vorname, String nationalitšt, int nummer,int Anzahlderrennen) {
		this.name = name;
		this.vorname = vorname;
		Nationalitšt = nationalitšt;
		this.nummer = nummer;
		this.Anzahlderrennen=Anzahlderrennen;
	}
	private String name;
	private String vorname;
	private String Nationalitšt;
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
	public String getNationalitšt() {
		return Nationalitšt;
	}
	public void setNationalitšt(String nationalitšt) {
		Nationalitšt = nationalitšt;
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