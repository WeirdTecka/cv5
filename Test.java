package cv5;

public class Test {

	public static void main(String[] args)
	{
		Zbozi[] poleZbozi = new Zbozi[4]; //vytvo�en� pole pro 4 zbozi
		
		poleZbozi[0] = new Potravina("Rohl�k",1.5, 1); //Deklarace hodnot do pole
        poleZbozi[1] = new Naradi("Kle�t�",278,24);
        poleZbozi[2] = new Potravina("Chleba",20.8,6);
        poleZbozi[3] = new Potravina("Jablko",51,20);
        
        for(int i = 0; poleZbozi.length > i ;i++ ) // For kter� b�� od 0 po velikost Arraye zbozi
        {
            System.out.print(poleZbozi[i].getZbozi() + ", cena " + poleZbozi[i].getCena()); // V�pis jm�na zbo�� a cenu ur�it�ho zbozi dle 1

            if(poleZbozi[i] instanceof Potravina ) // Podm�nka, kter� kdy� je zbo�� potravina vyp�e i trvanlivost
            {
                Potravina trvanlivost = (Potravina) poleZbozi[i];
                System.out.println(", Trvanlivost " + trvanlivost.getTrvanlivost() + " " + trvanlivost.getJednotka());
            }
            else
            {
                Naradi zaruka = (Naradi) poleZbozi[i];
                System.out.println(", Z�ruka " + zaruka.getZaruka() + " " + zaruka.getJednotka());
            }
        }
	}
			
}
