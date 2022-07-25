package executablegames.test;

import executablegames.utils.games.players.Human;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    Human human;
    @Test
    public void nameShouldNotBeNull() throws Exception {
        human = new Human(1, "human");
        human.setName(null);
        assertEquals("human", human.getName());
    }



}