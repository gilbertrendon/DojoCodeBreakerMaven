package source.web.java.EjercicioMaven;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CodeBreakerTest {

	private CodeBreaker code = new CodeBreaker("1234");
	String result;
	
	@Test
	public void guessAllMatch() {
		result = code.guess("1234");
		assertEquals("xxxx", result);
	}
	
	@Test
	public void guessOneFailAndThreeMatch(){
		result = code.guess("0234");
		assertEquals("xxx", result);
	}
	
	@Test
	public void guessTwoFailAndTwoMatch(){
		result = code.guess("0034");
		assertEquals("xx", result);
	}
	
	@Test
	public void guessThreeFailAndOneMatch(){
		result = code.guess("0004");
		assertEquals("x", result);
	}
	
	@Test
	public void guessAllFail(){
		result = code.guess("0000");
		assertEquals("", result);
	}
	
	@Test
	public void guessAllMessy(){
		result = code.guess("4321");
		assertEquals("____", result);
	}
	
	@Test
	public void guessThreeMessy(){
		result = code.guess("4120");
		assertEquals("___", result);
	}
	
	@Test
	public void guessTwoMessy(){
		result = code.guess("0041");
		assertEquals("__", result);
	}
	
	@Test
	public void guessOneMessy(){
		result = code.guess("0040");
		assertEquals("_", result);
	}
	
	@Test
	public void guessOneMatchThreeMessy(){
		result = code.guess("2314");
		assertEquals("x___", result);
	}
	
	@Test
	public void guessTwoMatchTwoMessy(){
		result = code.guess("1432");
		assertEquals("xx__", result);
	}
	
	@Test
	public void guessOneFailThreeMessy(){
		result = code.guess("4320");
		assertEquals("___", result);
	}
	
	@Test
	public void guessTwoFailTwoMessy(){
		result = code.guess("0041");
		assertEquals("__", result);
	}
	
	@Test
	public void guessThreeFailOneMessy(){
		result = code.guess("0400");
		assertEquals("_", result);
	}
	
}