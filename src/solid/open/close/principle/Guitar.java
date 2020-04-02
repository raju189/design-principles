package solid.open.close.principle;

/**
 * classes should be open for extension, but closed for modification
 * 
 * we stop ourselves from modifying existing code and causing potential new bugs
 * 
 * 
 * 
 * An entity open for extension, But closed for modification.
 * 
 * Extend functionality by adding new code instead of changing existing code.
 * 
 * 
 * Separate the behaviors, so the system can easily be extended, but never
 * broken.
 * 
 * Goal: get to a point where you can never break the core of your system.
 * 
 * @author G_DisGGreat
 *
 */

public class Guitar {
	private String make;
	private String model;
	private int volume;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}

/**
 * Instead of adding/modifying new functionality to existing class. By extending
 * the Guitar class we can be sure that our existing application won't be
 * affected.
 * 
 * @author G_DisGGreat
 *
 */
class SuperCoolGuitarWithFlames extends Guitar {

	private String flameColor;

	public String getFlameColor() {
		return flameColor;
	}

	public void setFlameColor(String flameColor) {
		this.flameColor = flameColor;
	}

}
