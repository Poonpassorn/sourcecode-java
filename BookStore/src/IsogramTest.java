import static org.junit.Assert.*;

import org.junit.Test;

public class IsogramTest {

	@Test
	public void test() {
		Isogram isogram = new Isogram();
		assertTrue(isogram.check("lumberjacks"));
	}
	
	@Test
	public void test2() {
		Isogram isogram = new Isogram();
		assertFalse(isogram.check("aba"));
	}

}
