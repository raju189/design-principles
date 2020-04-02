package solid.interface_segregation.principle;

/**
 * larger interfaces should be split into smaller ones. By doing so, we can
 * ensure that implementing classes only need to be concerned about the methods
 * that are of interest to them.
 * 
 * 
 * A client should never be forced to depend on methods it doesn't use.
 * 
 * 
 * A client should never depend on anything more than the method it's calling.
 * 
 * 
 * Changing one method in a class shouldn't affect classes that don't depend on
 * it.
 * 
 * 
 * Replace fat interfaces with many small, specific interfaces.
 * 
 * @author G_DisGGreat
 *
 */

//without Interface segregation

interface BearKeeperI {

	void washTheBear();

	void feedTheBear();

	void petTheBear();
}

//with Interface segregation

interface BearCleaner {
	void washTheBear();
}

interface BearFeeder {
	void feedTheBear();
}

interface BearPetter {
	void petTheBear();
}

public class BearCarer implements BearCleaner, BearFeeder {

	public void washTheBear() {
		// I think we missed a spot...
	}

	public void feedTheBear() {
		// Tuna Tuesdays...
	}
}

class CrazyPerson implements BearPetter {

	public void petTheBear() {
		// Good luck with that!
	}
}