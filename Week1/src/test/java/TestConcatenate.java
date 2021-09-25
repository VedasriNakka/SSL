import static org.junit.Assert.*;

import org.junit.Test;

public class TestConcatenate {

	@Test
	public void test() {
		Concatenate myUnit = new Concatenate();
		String result = myUnit.concatenate("one", "two");
		assertEquals("onetwo", result);
	}

}
