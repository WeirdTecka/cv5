package cv5;

public abstract class Zbozi {
	String zbozi;
	double cena;
	private final double DPH = 1.21; //pro lepší poèítání nastaveno jeko 121 %
	
	
	public Zbozi(String zbozi, double cena) {
		super();
		this.zbozi = zbozi;
		this.cena = cena;
	}
	
	public String getZbozi() {
		return zbozi;
	}
	public void setZbozi(String zbozi) {
		this.zbozi = zbozi;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}

	
	public abstract String getJednotka();
		
}

