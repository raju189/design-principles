package solid.single.resposibility.principle;

/**
 * Single Responsibility principle states that a class should only have one responsibility.
 * Furthermore, it should only have one reason to change.
 * 
 * A class should only be responsible for one thing.
 * 
 * There's a place for everything and everything is in it's place.
 * 
 * Find one reason to change and take everything else out of the class.
 * 
 * Very precise names for many small classes, generic name for large classes.
 * 
 * @author G_DisGGreat
 *
 */

public class Book {

	private String name;
	private String author;
	private String text;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	// Below methods are related to book and acts on own props

	public String replaceWordInText(String word) {
		return text.replaceAll(word, text);
	}

	public boolean isWordInText(String word) {
		return text.contains(word);
	}

	// Below methods are not only related to Books and other responsibility as well
	// these should be moved to another class

//	// methods for outputting text
//    void printTextToConsole(String text){
//        //our code for formatting and printing the text
//    }
// 
//    void printTextToAnotherMedium(String text){
//        // code for writing to any other location..
//    }

}

class BookPrinter {
	// methods for outputting text
	void printTextToConsole(String text) {
		// our code for formatting and printing the text
	}

	void printTextToAnotherMedium(String text) {
		// code for writing to any other location..
	}
}
