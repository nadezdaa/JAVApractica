package gravitripsPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testGame {

	@Test
	public void test() {
     Field field = new Field(6, 7);
     field.field = new FieldSymbol[][]{
				{ null, null, null, null, null, null, null, },
				{ null, null, null, null, null, null, null, },
				{ null, null, null, null, null, null, null, },
				{ null, null, null, null, null, null, null, },
				{ null, null, null, null, null, null, null, },
				{ null, FieldSymbol.X, FieldSymbol.X, FieldSymbol.X, FieldSymbol.X, null, null, }, 
				};
		
		assertTrue(field.WinConditions(FieldSymbol.X));
	}

}
