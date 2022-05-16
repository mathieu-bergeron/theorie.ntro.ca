public abstract class Vehicule implements Comparable {

	private double totalKilometres = 0;
	
	public Vehicule(double totalKilometres) {
		this.totalKilometres = totalKilometres;
	}

	@Override
	public int compareTo(Object autre){
	    int resultat = 0;

	    if(this.totalKilometres < ((Vehicule) autre).totalKilometres){
	        resultat = -1;
	    }else if(this.totalKilometres > ((Vehicule) autre).totalKilometres){
	        resultat = +1;
	    }

	    return resultat;
	}

	//...
}
