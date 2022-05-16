MonTableau<Integer> tableauEntiers = new MonTableau<>(new Integer[] {54,1,5,43,6};);

MonTableau<String> tableauChaines = new MonTableau<>(new String[] {"25","45","4","5"};);

MonTableau<Vehicule> tableauVehicules = new MonTableau<>(new Vehicule[] {new Auto(13.0), new Moto(23.9), new Camion(134.0)});

MonTableau<Integer> tableauEntiers = new MonTableau<Integer>(new Integer[] {54,1,5,43,6};);
//                                                  ^^^^^^^

// Erreurs de compilation!!
tableauEntiers.modifierValeur(0, "12");
tableauChaines.modifierValeur(0, new Auto(12.3));
tableauVehicules.modifierValeur(0, 123);

                                                   
