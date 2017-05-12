package autoAufgabe;

public class Rennstall {

private String teamname;
private String Sponsor;
private int Anzahlteammitglieder;
private int Anzahlrennwagen;


private ArrayList teammitglieder = new ArrayList();
private int anzahlTeammitglieder = 5;
private int teamCount=0;


public Rennstall(String teamname, String sponsor, int anzahlteammitglieder, int anzahlrennwagen) {
	this.teamname = teamname;
	Sponsor = sponsor;
	Anzahlteammitglieder = anzahlteammitglieder;
	Anzahlrennwagen = anzahlrennwagen;
}

	public boolean addTeammitglied(Teammitglied team){
		if(this.anzahlTeammitglieder < 5){
			this.teammitglieder.add(team);
			this.teamCount++;
			return true;
		}
		return false;
	
		private ArrayList rennwagenanzahl = new ArrayList();
		private int anzahlRennwagen = 5;
		private int teamCount = 0;	


		public boolean addRennwagen(Rennwagen team){
			if(this.rennwagenanzahl < 3){
				this.Rennwagen.add(team);
				this.teamCount++;
				return true;
			}
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mechaniker Kamil=new Mechaniker("Achmett", "Brötchen", "spanisch",12,5,"Reifen",3,8);
		System.out.println(kamil.gesamtgehaltberechnen());
		Pilot Anni=new Pilot("Harald","Schmidt","türkisch",1,8,9);
		System.out.println(Ali.gehaltberechnen());
		Rennwagen CarLol=new Rennwagen(true,null); 
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getSponsor() {
		return Sponsor;
	}

	public void setSponsor(String sponsor) {
		Sponsor = sponsor;
	}

	public int getAnzahlteammitglieder() {
		return Anzahlteammitglieder;
	}

	public void setAnzahlteammitglieder(int anzahlteammitglieder) {
		Anzahlteammitglieder = anzahlteammitglieder;
	}

	public int getAnzahlrennwagen() {
		return Anzahlrennwagen;
	}

	public void setAnzahlrennwagen(int anzahlrennwagen) {
		Anzahlrennwagen = anzahlrennwagen;
	}

}
