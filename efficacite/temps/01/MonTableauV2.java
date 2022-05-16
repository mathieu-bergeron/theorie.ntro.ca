public class MonTableau implements Tableau {
	
	Comparable[] valeurs;

	@Override
	public void valeursInitiales(Comparable[] valeurs) {
		this.valeurs = valeurs;
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
