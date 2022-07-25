package executablegames.test;

import executablegames.utils.games.HangManGame.HangedMan;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HangedManTest {

    HangedMan hangedMan;

    @Test
    public void shouldSeparateWordInline() throws Exception {}{
        hangedMan.separateSecretWordInLine("secretWord");
        assert hangedMan.secretWordSeparatedByLine.length == 10;
    }

    @Test
    public void shouldNotAcceptEmptyString() throws Exception {
        String secretWord = "secretWord";
        hangedMan.separateSecretWordInLine(secretWord);
        hangedMan.separateSecretWordInLine("");
        assertEquals(secretWord, hangedMan.secretWordSeparatedByLine);
    }

    @After
    public void cleanUpSecretWord() throws Exception {
        hangedMan.secretWordSeparatedByLine = null;
    }



}