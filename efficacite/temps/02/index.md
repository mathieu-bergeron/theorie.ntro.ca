---
title: ""
weight: 1
bookHidden: true
---


# Théorie 3.2: structure générique (2)

<center>
<video width="50%" src="01.mp4" type="video/mp4" controls>
</center>

* Comment restreindre un tableau générique à un type précis?
    * tableau de chaînes, tableau d'entiers, tableau de `Vehicule`

* Comment prévenir une erreur d'exécution de ce genre:

$[java ./Erreur]()

* La technique à utiliser s'appelle les *paramètres de type*

## Utiliser les paramètres de type

<center>
<video width="50%" src="02.mp4" type="video/mp4" controls>
</center>

* Un paramètre de type permet de spécifier quel genre de `Tableau` on veut:

$[java ./Utiliser 1 5]()

* `<Integer>` est le paramètre de type restreignant le tableau aux entiers

* `<String>` est le paramètre de type restreignant le tableau aux chaînes

* `<Vehicule>` est le paramètre de type restreignant le tableau aux `Vehicule`

* Le paramètre vide `<>` est rempli (deviné) par le compilateur, lorsque possible
    * p.ex. la première ligne équivaut à:

$[java ./Utiliser 7 8]()

## Erreurs de compilation

<center>
<video width="50%" src="03.mp4" type="video/mp4" controls>
</center>

* Grace aux paramètres de type, le compilateur peut faire plus de vérifications

* Certaines erreur d'exécution deviennent des erreurs de compilation:

$[java ./Utiliser 10 13]()

## L'interface `Tableau` avec paramètres de type

<center>
<video width="50%" src="04.mp4" type="video/mp4" controls>
</center>

$[java ./Tableau]()

* Le paramètre `<C extends Comparable>` se lit:
    * le type `C` est une sous-classe de `Comparable`

* Le type `C` est ensuite utilisé où `Comparable` serait utilisé


## Implanter `Tableau` avec paramètres de type

<center>
<video width="50%" src="05.mp4" type="video/mp4" controls>
</center>


* L'implantation commence comme suit:

$[java ./MonTableau 1 8]()

* Il y a deux paramètres de type:
    * `<C extends Comparable>` indique: le type `C` est une sous-classe de `Comparable`
    * `<C>` spécifie que l'interface `Tableau` est utilisée avec le type `C`

* L'implantation des méthodes utilise le type `C`:

$[java ./MonTableau 10 35]()


## Il reste une erreur d'exécution!

<center>
<video width="50%" src="06.mp4" type="video/mp4" controls>
</center>

* Le code ci-bas va compiler, mais provoquer une erreur d'exécution:

$[java ./Erreur2]()

* Pour régler l'erreur il faut spécifier cette notion:
    * un `Vehicule` peut seulement être comparé à un autre `Vehicule`

* Pour ce faire, il faut paramétrer `Comparable` quand on définit `Vehicule`

$[java ./Vehicule]()

* De la même façon, il faut paramétrer `Comparable` quand on définit `Tableau`

$[java ./Tableau2]()

* Le paramètre de type `<C extends Comparable<C>>` se lit:
    * `C` est un sous-type de `Comparable` qui peut seulement se comparer à `C`

* Les avertissements de *type incomplet* devraient aussi disparaîtrent
