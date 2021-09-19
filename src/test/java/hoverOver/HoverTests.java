package hoverOver;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HoverTests extends BaseTest {

    @Test
    public void testHoverUser1(){
        var hoverOverPage = homePage.hoverOnImage();
        var temp = hoverOverPage.hoverOverFigure(0);
        var caption = hoverOverPage.figureCaption(temp);
        assertEquals(caption,"name: user1","test");
    }
}
