package programs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterCasesTest {
    @Test
    public void testCharacter()
    {
        String input="Chicky";
        String output=CharacterCases.changeCharacterCase(input);
        assertEquals("cHICKY",output);
    }
    @Test
    public void testLowerCharacter()
    {
        String input="chicky";
        String output=CharacterCases.changeCharacterCase(input);
        assertEquals("CHICKY",output);
    }
    @Test
    public void testUpperCharacter()
    {
        String input="CHICKY";
        String output=CharacterCases.changeCharacterCase(input);
        assertEquals("chicky",output);
    }
    @Test
    public void testNull()
    {
        String input=null;
        String output=CharacterCases.changeCharacterCase(input);
        assertEquals(null,output);
    }
    @Test
    public void testEmptyString()
    {
        String input="";
        String output=CharacterCases.changeCharacterCase(input);
        assertEquals(null,output);
    }

}
