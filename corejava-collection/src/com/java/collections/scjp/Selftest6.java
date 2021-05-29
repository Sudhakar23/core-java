package com.java.collections.scjp;
interface Hungry<E>{void munch(E x);}
interface Carnivore<E extends Animal>extends Hungry<E>{}
//interface Herbivore<E extends Plant>extends Hungry<E>{}
interface Herbivore<E extends Animal>extends Hungry<E>{}
abstract class Plant{}
class Gress extends Plant{}
abstract class Animal{}
class Sheep extends Animal implements   Herbivore<Sheep>{
	public void munch(Sheep x){}
}
class wolf extends Animal implements  Carnivore<Sheep>{
	public void munch(Sheep x){}
}
public class Selftest6 {

}
