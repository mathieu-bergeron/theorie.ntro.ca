public abstract class Vehicule implements Comparable<Vehicule> {

	@Override
	public int compareTo(Vehicule autre){
	    int resultat = 0;

	    if(this.totalKilometres < autre.totalKilometres){
	        resultat = -1;
	    }else if(this.totalKilometres > autre.totalKilometres){
	        resultat = +1;
	    }

	    return resultat;
	}
}
