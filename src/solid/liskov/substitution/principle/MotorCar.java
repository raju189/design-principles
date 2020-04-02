package solid.liskov.substitution.principle;

/**
 * if class A is a subtype of class B, then we should be able to replace B with
 * A without disrupting the behavior of our program.
 * 
 * Any derived class should be able to substitute it's parent class without the
 * consumer knowingit.
 * 
 * Every class that implements an interface, must be able to substitute any
 * reference throughout the code that implements that same interface.
 * 
 * Every part of the code should get the expected result no matter what instance
 * of a class you send to it. given it implements the same interface.
 * 
 * @author G_DisGGreat
 *
 */

class Engine {

	public void on() {
		// TODO Auto-generated method stub

	}

	public void powerOn(int i) {
		// TODO Auto-generated method stub

	}

}

interface Car {

	void turnOnEngine();

	void accelerate();
}

public class MotorCar implements Car {

	private Engine engine;

	// Constructors, getters + setters

	public void turnOnEngine() {
		// turn on the engine!
		engine.on();
	}

	public void accelerate() {
		// move forward!
		engine.powerOn(1000);
	}
}

class ElectricCar implements Car {

	public void turnOnEngine() {
		throw new AssertionError("I don't have an engine!");
	}

	public void accelerate() {
		// this acceleration is crazy!
	}
}

/*
 * By throwing a car without an engine into the mix, we are inherently changing
 * the behavior of our program. This is a blatant violation of Liskov
 * substitution and is a bit harder to fix than our previous 2 principles.
 * 
 * One possible solution would be to rework our model into interfaces that take
 * into account the engine-less state of our Car.
 */
