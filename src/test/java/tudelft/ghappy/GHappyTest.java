package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;



public class GHappyTest {

    private GHappy ghappy;

    @BeforeEach
    public void initialize(){this.ghappy = new GHappy();}

    @Test
    public void twoLettersInTheMiddle(){

        Assertions.assertTrue(ghappy.gHappy("xxggxx"));
    }

    @Test
    public void oneLetterInTheMiddle(){

        Assertions.assertFalse(ghappy.gHappy("xxgxx"));

    }

    @Test
     public void twoLettersAndOneLetter(){

        Assertions.assertFalse(ghappy.gHappy("xxggyygxx"));
    }
    @Test
    public void justOneG(){
        Assertions.assertFalse(ghappy.gHappy("g"));

    }

    @Test
     public void justDoubleG(){

        Assertions.assertTrue(ghappy.gHappy("gg"));
    }
    @Test
     public void emptyString(){
        Assertions.assertTrue(ghappy.gHappy(""));
    }

    @Test
    public void threeGees(){

        Assertions.assertTrue(ghappy.gHappy("xxgggxx"));
    }

    @Test
    public void threeGeesAndTwoGees(){

        Assertions.assertTrue(ghappy.gHappy("xxgggxxggxx"));
    }
    @Test
    public void threeGeesAndOneG(){
        Assertions.assertFalse(ghappy.gHappy("xxgggxxgxx"));
    }

}
