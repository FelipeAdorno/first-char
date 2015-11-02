package br.com.first.character.exceptions;

public class FirstUniqueCharNotFoundException extends RuntimeException {

    public FirstUniqueCharNotFoundException() {
        super("Unique character not found in stream!");
    }

}
