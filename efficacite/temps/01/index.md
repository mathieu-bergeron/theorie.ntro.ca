---
title: ""
weight: 1
bookHidden: true
---


# Théorie 3.1: structure générique (1)

{{% video src="./01.mp4" width="50%" %}}

* Comment définir un tableau générique? ($[link ../../../02/01/theorie/](théorie 2.1))

* Comment s'assurer que le même code fonctionne pour:
    * tableau d'entiers, tableau de chaînes, tableau de `Vehicule`, etc.

* On regarde deux techniques ici:
    * Définir un tableau d'objets `Object[] tableau;`
    * Définir un tableau d'objets comparables `Comparable[] tableau;`

## Première version: `Object[] tableau`

<center>
<video width="50%" src="02.mp4" type="video/mp4" controls>
</center>

* En java, une classe hérite toujours de `Object`

* Un tableau `Object[] tableau` peut alors stoquer n'importe quel sorte d'objet

* Voici l'interface de la première version de notre `Tableau` générique:

    ```java
    {{% embed src="./TableauV1.java" indent="1" %}}
    ```

* Le `Tableau` peut faire trois choses:
    * `obtenirValeur`: récupérer la valeur stoquée à un certain `index`
    * `modifierValeur`: stoquer une valeur à un certain `index`
    * `valeurMinimale`: trouver et retourner la plus petite valeur du tableau


## Implanter `Object[] tableau`

<center>
<video width="50%" src="03.mp4" type="video/mp4" controls>
</center>

* L'implantation commence comme suit:

$[java ./MonTableauV1 1 8]()

* Le constructeur permet de spécifier les valeurs initiales (un tableau d'`Object`)
    * ces valeurs sont mémorisées dans un attribut privé

* Le tableau est générique. On peut créer plusieurs types de tableaux:

$[java ./UtiliserV1 5 13]()

* L'implantation de `modifierValeur` et `obtenirValeur` est simple:

$[java ./MonTableauV1 11 19]()

* L'utilisation aussi:

$[java ./UtiliserV1 15 22]()

* L'implantation de `valeurMinimale` est à premier vue simple:

$[java ./MonTableauV1 21 38]()

* Le problème est dans l'implantation de `siValeurPlusPetite`

## Problème avec `Object[] tableau`

<center>
<video width="50%" src="04.mp4" type="video/mp4" controls>
</center>

* Comparer les valeurs est un problème:

$[java ./MonTableauV1 40 62]()

* Il faudrait ajouter du code à la méthode ci-haut pour chaque type d'objet

* Notre classe `Tableau` n'est plus vraiment générique

* La solution est de déléguer aux objets la tâche de se comparer

* On a besoin pour ça d'un contrat avec ces objets


## Deuxième version: `Comparable[] tableau`

<center>
<video width="50%" src="05.mp4" type="video/mp4" controls>
</center>

* L'interface `Comparable` est un contrat qui signifie qu'un objet sait se comparer

* Pour remplir ce contrat, il faut implanter la méthode `int compareTo(Object autre)`
    * retourner `-1` si l'objet courant est plus petit que l'`autre` objet
    * retourner `0` si l'objet courant est égal à l'`autre` objet
    * retourner `+1` si l'objet courant plus grand que l'`autre` objet

* Avec `Comparable`, l'interface de notre tableau générique devient:

    $[java ./TableauV2]()

    * Dans Eclipse, vous allez avoir des avertissements de *type incomplet*
    * On peut les ignorer pour l'instant

        <center>
        <video width="50%" src="avertissements.mp4" type="video/mp4" controls>
        </center>

* L'implantation commence comme suit:

$[java ./MonTableauV2 1 8]()

* Cette fois-ci, on mémorise un tableau de `Comparable`
    * on ne connaît rien des objets, sauf qu'ils implante `compareTo(Object autre)`

* Les méthodes `obtenirValeur`, `modifierValeur` et `valeurMinimale` sont pareilles

* La méthode `siValeurPlusPetite` n'est plus du tout problématique

$[java ./MonTableauV2 40 42]()

* Par contre, il faut maintenant que `Vehicule` implante `Comparable`

$[java ./Vehicule]()

* NOTE: les classes `String` et `Integer` (et d'autres) implantent déjà `Comparable`



## Recapitulation

<center>
<video width="50%" src="06.mp4" type="video/mp4" controls>
</center>

* Pour créer un tableau générique, il faut mémoriser des objets qu'on ne connaît pas

* Pour comparer ces objets, il faut exiger qu'ils implantent l'interface `Comparable`

* Pour en faire plus, il faut exiger une interface avec plus de méthodes

* Par exemple, si on veut que `Tableau` affiche les valeurs, on peut demander:
    * que chaque objet implante `ElementTableau` qui contient `String formater()`
    * alors on a:

$[java ./MonTableau_formater 1 26]()




## Problèmes avec `Comparable[] tableau`

<center>
<video width="50%" src="07.mp4" type="video/mp4" controls>
</center>

* Notre `Tableau` ne permet pas vraiment de spécifier le type des éléments

* En particulier, on peut faire:

$[java ./Utiliser_erreurs 5 15]()

* On peut ajouter un entier ou une `Auto` à un tableau de chaînes?

* Comment bloquer cette option pour éviter les erreurs d'exécution?

* (Réponse au $[link ../../02/](module 3.2))
