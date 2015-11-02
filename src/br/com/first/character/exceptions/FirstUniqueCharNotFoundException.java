package br.com.first.character.exceptions;

/**
 * The type First unique char not found exception.
 * @author Felipe Adorno (felipeadsc@gmail.com)
 */
public class FirstUniqueCharNotFoundException extends RuntimeException {

    /**
     * Instantiates a new First unique char not found exception.
     */
    public FirstUniqueCharNotFoundException() {
        super("Unique character not found in stream!");
    }

}
