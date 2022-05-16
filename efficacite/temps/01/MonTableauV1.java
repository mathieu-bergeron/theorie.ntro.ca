public class MonTableau implements Tableau {
	
	private Object[] valeurs;
	
	public MonTableau(Object[] valeurs) {
		this.valeurs = valeurs;
	}
}


@Override
public Object obtenirValeur(int index) {
	return valeurs[index];
}

@Override
public void modifierValeur(int index, Object nouvelleValeur) {
	valeurs[index] = nouvelleValeur;
}

@Override
public Object valeurMinimale() {
	
	Object valeurMinimale = null;
	
	if(valeurs.length > 0) {
		valeurMinimale = valeurs[0];
	}
	
	for(int i = 1; i < valeurs.length; i++) {
		if(siValeurPlusPetite(valeurs[i], valeurMinimale)) {
			valeurMinimale = valeurs[i];
		}
	}
	
	return valeurMinimale;
}
}

private boolean siValeurPlusPetite(Object valeur, Object valeurMinimale) {
	
	boolean siValeurPlusPetite = false;
	
	if(valeur instanceof Integer && valeurMinimale instanceof Integer) {
		
		siValeurPlusPetite = siEntierPlusPetit((Integer) valeur, (Integer) valeurMinimale);

	}else if(valeur instanceof String && valeurMinimale instanceof String) {
		
		siValeurPlusPetite = siChainePlusPetite((String) valeur, (String) valeurMinimale);

	}else if(valeur instanceof Vehicule && valeurMinimale instanceof Vehicule) {

		siValeurPlusPetite = ((Vehicule)valeurMinimale).siMoinsDeKilometrageQue((Vehicule)valeurMinimale);

	}else {
		
		// ?????
	}
	
	return siValeurPlusPetite;
}

	private boolean siEntierPlusPetit(Integer valeur, Integer valeurMinimale) {
		return valeur.compareTo(valeurMinimale) < 0;
	}

	private boolean siChainePlusPetite(String valeur, String valeurMinimale) {
		return valeur.compareTo(valeurMinimale) < 0;
	}


}
