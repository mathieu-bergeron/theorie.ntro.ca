package tutoriels.generer_tutoriel2_7.theorie;

public class UtiliserV1 {

public static void main(String[] args) {

    MonTableau tableauChaines = new MonTableau(new String[] {"25","45","4","5"};);

    // Permis?
    tableauChaines.modifierValeur(0, 12);
    tableauChaines.modifierValeur(0, new Auto(12.9));

    // Oups, erreur d'exécution
    String chaine = (String) tableauChaines.valeurMinimale();
}

    int entier = tableauEntiers.obtenirValeur(1);
    tableauEntiers.modifierValeur(1, entier+10);

    String chaine = tableauChaines.obtenirValeur(3);
    tableauChaines.modifierValeur(0,"Ah!");

    Vehicule vehicule = tableauVehicules.obtenirValeur(0);
    tableauVehicules.modifierValeur(2, new Auto(21.0));


	
	public static void main(String[] args) {
		
		exempleEntiers();
		exempleChaines();
		exempleAutos();
		
		provoquerDesErreurs();
	}
	

	private static void exempleEntiers() {
		
		Integer[] valeursInitiales = new Integer[] {54,1,5,43,6};
		
		TableauV1 tableau = new MonTableauV1();
		tableau.valeursInitiales(valeursInitiales);
		
		utiliserTableau(tableau, 12);
	}

	private static void exempleChaines() {
		
		String[] valeursInitiales = new String[] {"25","45","4","5"};
		
		TableauV1 tableau = new MonTableauV1();
		tableau.valeursInitiales(valeursInitiales);
		
		utiliserTableau(tableau, "199");
	}

	private static void exempleAutos() {
		
		Auto[] valeursInitiales = new Auto[] {new Auto(13.0), new Auto(23.9), new Auto(134.0)};
		
		TableauV1 tableau = new MonTableauV1();
		tableau.valeursInitiales(valeursInitiales);
		
		utiliserTableau(tableau, new Auto(24.13));
	}

	private static void utiliserTableau(TableauV1 tableau, Object autreValeur) {
		
		StringBuilder message = new StringBuilder();

		Object valeurMinimale = tableau.valeurMinimale();
		
		message.append("La valeur minimale du tableau est ");
		message.append(formaterValeur(valeurMinimale));
		
		if(siPlusPetitQue(valeurMinimale, autreValeur)) {
			message.append(", ce qui est plus petit que ");
		}else {
			message.append(", ce qui est plus grand ou égal à ");
		}
		
		message.append(formaterValeur(autreValeur));
		
		System.out.println(message.toString());
	}

	private static boolean siPlusPetitQue(Object valeur, Object autreValeur) {
		boolean siPlusPetit = false;

		if(valeur instanceof Integer && autreValeur instanceof Integer) {
			
			siPlusPetit = ((Integer)valeur) < ((Integer)autreValeur);
			
		}else if(valeur instanceof String && autreValeur instanceof String) {

			siPlusPetit = ((String)valeur).compareTo((String)autreValeur) < 0;

		}else if(valeur instanceof Auto && autreValeur instanceof Auto) {

			siPlusPetit = ((Auto)valeur).siMoinsDeKilometrageQue((Auto)autreValeur);

		}else {
			
			// ???
		}
		
		return siPlusPetit;
	}
	
	private static String formaterValeur(Object valeur) {
		String resultat = valeur.toString();
		
		if(valeur instanceof String) {
			resultat = "\"" + resultat + "\"";
		}

		return resultat;
	}

	
	private static void provoquerDesErreurs() {

		Integer[] entiersInitiaux = new Integer[] {54,1,5,43,6};
		String[] chainesInitiales = new String[] {"25","45","4","5"};
		Auto[] autosInitiales = new Auto[] {new Auto(13.0), new Auto(23.9), new Auto(134.0)};
		
		TableauV1 tableauEntiers = new MonTableauV1();
		tableauEntiers.valeursInitiales(entiersInitiaux);

		TableauV1 tableauChaines = new MonTableauV1();
		tableauChaines.valeursInitiales(chainesInitiales);


		TableauV1 tableauAutos = new MonTableauV1();
		tableauAutos.valeursInitiales(autosInitiales);

		// Erreur d'exécution
		//tableauChaines.modifierValeur(2, new Auto(1345.0));

		// Erreur d'exécution
		//String uneChaine = (String) tableauEntiers.obtenirValeur(1);

		// Erreur d'exécution
		//Integer entierMinimum = (Integer) tableauChaines.valeurMinimale();
		
		// Erreur d'exécution
		//tableauChaines.modifierValeur(2, 12);
		//String chaineMinimale = (String) tableauChaines.valeurMinimale();
		
		// Erreur d'exécution
		//Object autreValeur = 12;
		//siPlusPetitQue(tableauChaines.valeurMinimale(), autreValeur);
	}
	
	

}
