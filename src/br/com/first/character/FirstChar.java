package br.com.first.character;

import br.com.first.character.exceptions.FirstUniqueCharNotFoundException;
import br.com.first.character.stream.Stream;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The type First char.
 * @author Felipe Adorno (felipeadsc@gmail.com)
 */
public class FirstChar {

    /**
     * Get the first chat from Stream.
     *
     * @param input the Stream input
     * @return the unique first char
     */
    public static char firstChar(final Stream input) {
        Map<Character,Integer> repeatTimes = iterateOverStream(input);
        Character uniqueChar = getFirstUniqueChar(repeatTimes);
        if(uniqueChar == null) {
            throw new FirstUniqueCharNotFoundException();
        }
        return uniqueChar;
    }

    private static Map<Character,Integer> iterateOverStream(Stream input) {
        Map<Character,Integer> repeatTimes = new LinkedHashMap<>();
        while (input.hasNext()) {
            char actualChar = input.getNext();
            repeatTimes.put(actualChar, repeatTimes.containsKey(actualChar) ? repeatTimes.get(actualChar) + 1 : 1);
        }
        return repeatTimes;
    }

    private static Character getFirstUniqueChar(Map<Character, Integer> repeatTimes) {
        Character uniqueChar = null;
        for (Map.Entry<Character,Integer> entry : repeatTimes.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueChar = entry.getKey();
                break;
            }
        }
        return uniqueChar;
    }
}
