public class MonTableau implements Tableau, Formateur {
	
	ElementTableau[] valeurs;

	//...
	
	@Override
	public String formater(){
	    StringBuilder builder = new StringBuidler();

	    builder.append("[");

	    if(valeurs.length > 0){
	        builder.append(valeurs[0].formater());
	    }

	    for(int i = 1; i < valeurs.length; i++) {
	        builder.append(", ");
	        builder.append(valeurs[i].formater());
	    }

	    builder.append("]");

	    return builder.toString();
	}
}
	


	
	

}

@Override
public Comparable obtenirValeur(int index) {
	return valeurs[index];
}

@Override
public void modifierValeur(int index, Comparable nouvelleValeur) {
	valeurs[index] = nouvelleValeur;
}

@Override
public Comparable valeurMinimale() {

	Comparable valeurMinimale = null;

	if(valeurs.length > 0) {
		valeurMinimale = valeurs[0];
	}

	for(int i = 1; i < valeurs.length; i++) {
		if(valeurs[i].compareTo(valeurMinimale) < 0) {

			valeurMinimale = valeurs[i];
		}
	}
	
	return valeurMinimale;
}

private boolean siValeurPlusPetite(Comparable valeur, Comparable valeurMinimale) {
    return valeur.compareTo(valeurMinimale) < 0;
}


}
