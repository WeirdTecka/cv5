package cv5;

public class Test {

	public static void main(String[] args)
	{
		Zbozi[] poleZbozi = new Zbozi[4]; //vytvoøení pole pro 4 zbozi
		
		poleZbozi[0] = new Potravina("Rohlík",1.5, 1); //Deklarace hodnot do pole
        poleZbozi[1] = new Naradi("Kleštì",278,24);
        poleZbozi[2] = new Potravina("Chleba",20.8,6);
        poleZbozi[3] = new Potravina("Jablko",51,20);
        
        for(int i = 0; poleZbozi.length > i ;i++ ) // For který bìží od 0 po velikost Arraye zbozi
        {
            System.out.print(poleZbozi[i].getZbozi() + ", cena " + poleZbozi[i].getCena()); // Výpis jména zboží a cenu urèitého zbozi dle 1

            if(poleZbozi[i] instanceof Potravina ) // Podmínka, která když je zboží potravina vypíše i trvanlivost
            {
                Potravina trvanlivost = (Potravina) poleZbozi[i];
                System.out.println(", Trvanlivost " + trvanlivost.getTrvanlivost() + " " + trvanlivost.getJednotka());
            }
            else
            {
                Naradi zaruka = (Naradi) poleZbozi[i];
                System.out.println(", Záruka " + zaruka.getZaruka() + " " + zaruka.getJednotka());
            }
        }
	}
			
}
