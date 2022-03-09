package cv5;

public class Potravina extends Zbozi {
	
	int trvanlivost;
	
	public Potravina(String zbozi, double cena, int trvanlivost) {
		super(zbozi, cena);
		this.trvanlivost = trvanlivost;
	}

	public int getTrvanlivost() {
		return trvanlivost;
	}

	public void setTrvanlivost(int trvanlivost) {
		this.trvanlivost = trvanlivost;
	}

	@Override
    public String getJednotka() 
    {
       return "den";

    }
	

}
