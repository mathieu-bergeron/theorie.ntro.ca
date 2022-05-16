public interface Tableau {

	Object obtenirValeur(int index);

	void modifierValeur(int index, Object nouvelleValeur);

	Object valeurMinimale();
}
