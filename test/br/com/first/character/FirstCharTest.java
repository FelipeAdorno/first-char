package br.com.first.character;

import br.com.first.character.exceptions.FirstUniqueCharNotFoundException;
import br.com.first.character.stream.StreamImpl;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * The type First char test.
 * @author Felipe Adorno (felipeadsc@gmail.com)
 */
@RunWith(JUnit4.class)
public class FirstCharTest extends TestCase {

    /**
     * Test first char.
     *
     * @throws Exception the exception
     */
    @Test
    public void testFirstChar() throws Exception {
        assertThat(FirstChar.firstChar(new StreamImpl("aAbBABac")), equalTo('b'));
        assertThat(FirstChar.firstChar(new StreamImpl("aAbBABcb")), equalTo('a'));
        assertThat(FirstChar.firstChar(new StreamImpl("AbBABbca")), equalTo('c'));
    }

    /**
     * Test first char not found.
     *
     * @throws Exception the exception
     */
    @Test(expected = FirstUniqueCharNotFoundException.class)
    public void testFirstCharNotFound() throws Exception {
        FirstChar.firstChar(new StreamImpl("aaaaaaaa"));
    }
}