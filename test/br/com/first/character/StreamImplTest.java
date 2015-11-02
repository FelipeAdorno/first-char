package br.com.first.character;

import br.com.first.character.stream.Stream;
import br.com.first.character.stream.StreamImpl;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class StreamImplTest extends TestCase {

    private Stream stream;

    @Before
    public void setUp() throws Exception {
        stream = new StreamImpl("aAbBABac");
    }

    @Test
    public void testGetNext() throws Exception {
        assertThat(stream.getNext(), equalTo('a'));
        assertThat(stream.getNext(), equalTo('A'));
        assertThat(stream.getNext(), equalTo('b'));
        assertThat(stream.getNext(), equalTo('B'));
        assertThat(stream.getNext(), equalTo('A'));
        assertThat(stream.getNext(), equalTo('B'));
        assertThat(stream.getNext(), equalTo('a'));
        assertThat(stream.getNext(), equalTo('c'));
    }

    @Test
    public void testHasNext() throws Exception {
        assertThat(stream.getNext(), equalTo('a'));
        assertThat(stream.hasNext(), equalTo(true));
        assertThat(stream.getNext(), equalTo('A'));
        assertThat(stream.hasNext(), equalTo(true));
        assertThat(stream.getNext(), equalTo('b'));
        assertThat(stream.hasNext(), equalTo(true));
        assertThat(stream.getNext(), equalTo('B'));
        assertThat(stream.hasNext(), equalTo(true));
        assertThat(stream.getNext(), equalTo('A'));
        assertThat(stream.hasNext(), equalTo(true));
        assertThat(stream.getNext(), equalTo('B'));
        assertThat(stream.hasNext(), equalTo(true));
        assertThat(stream.getNext(), equalTo('a'));
        assertThat(stream.hasNext(), equalTo(true));
        assertThat(stream.getNext(), equalTo('c'));
        assertThat(stream.hasNext(), equalTo(false));
    }

}
