package t9input;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class T9InputTest {
	private T9TextInput textInput;
	
	@Before
	public void setUp() throws Exception {
		textInput = new T9TextInput();
		String path = this.getClass().getResource("/unigram.txt").getPath();
		textInput.buildTrie(path);
	}

	@Test
	public void testT9() {
		int nResults = 5;
		String input = "6837";
		List<String> result = textInput.getWordList(input, nResults);
		List<String> expected = Arrays.asList("over","overlying","overcome","overcoat","overgrowth");
		assertEquals(result,expected);
		
		input = "86";
		result = textInput.getWordList(input, nResults);
		expected = Arrays.asList("to","under","took","united","too");
		assertEquals(result,expected);
		
		input = "69";
		result = textInput.getWordList(input, nResults);
		expected = Arrays.asList("my","own","myself","owing","owners");
		assertEquals(result,expected);
		
		input = "23777";
		result = textInput.getWordList(input, nResults);
		expected = Arrays.asList("besprinkled","cesspool","cesspool's","cesspools");
		assertEquals(result,expected);
		
		input = "11111";
		result = textInput.getWordList(input, nResults);
		assertEquals(result.size(), 0);
		
		input = "77777";
		result = textInput.getWordList(input, nResults);
		assertEquals(result.size(), 0);
	}

}
