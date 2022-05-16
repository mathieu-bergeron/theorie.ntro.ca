MonTableau tableauChaines = new MonTableau(new String[] {"25","45","4","5"};);

// Permis?
tableauChaines.modifierValeur(0, 12);
tableauChaines.modifierValeur(0, new Auto(12.9));

// Oups, erreur d'exécution
String chaine = (String) tableauChaines.valeurMinimale();
