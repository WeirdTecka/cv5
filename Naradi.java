package cv5;

public class Naradi extends Zbozi{
	
	int zaruka; 
	
	public Naradi(String zbozi, float cena, int zaruka) { 
		super(zbozi, cena);
		this.zaruka = zaruka;
	}

	public int getZaruka() {
		return zaruka;
	}

	public void setZaruka(int zaruka) {
		this.zaruka = zaruka;
	}
	
	 @Override
	    public String getJednotka() // Override na String jednotky 
	    {
		 	return "mìsíc";
	    }
	
}
