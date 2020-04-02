package solid.dependency.inversion.principle;

/**
 * The principle of Dependency Inversion refers to the decoupling of software
 * modules. This way, instead of high-level modules depending on low-level
 * modules, both will depend on abstractions.
 * 
 * 
 * High Level modules should not depend on low-level modules. Both should depend
 * on abstraction.
 * 
 * Never depend on anything concrete, only depend on abstraction.
 *
 * Able to change an implementation easily without altering the high level code.
 * 
 * 
 * @author G_DisGGreat
 *
 */

class Monitor {
}

class Windows98MachineVilation {

	private final StandardKeyboard keyboard;
	private final Monitor monitor;

	public Windows98MachineVilation() {
		monitor = new Monitor();
		keyboard = new StandardKeyboard();
	}

}

//with Dependency Inversion
interface Keyboard {
}

class StandardKeyboard implements Keyboard {
}

public class Windows98Machine {

	private final Keyboard keyboard;
	private final Monitor monitor;

	public Windows98Machine(Keyboard keyboard, Monitor monitor) {
		this.keyboard = keyboard;
		this.monitor = monitor;
	}
}
