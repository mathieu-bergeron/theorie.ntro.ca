MonTableau<Vehicule> tableauVehicules = new MonTableau<>(new Vehicule[] {new Auto(13.0), new Moto(23.9), new Camion(134.0)});

// Permis??
tableauVehicules.valeurMinimale().compareTo(12);
