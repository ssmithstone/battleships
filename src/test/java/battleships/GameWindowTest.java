package battleships;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

public class GameWindowTest {


    BattleShipDriver driver;

    @Before
    public void setUp(){
        driver = new BattleShipDriver();
    }

    @After
    public void tearDown() throws Exception {
        driver.dispose();
    }

    @Test
    public void weCanLoadUpTheMainWindow() throws Exception {

        BattleShipsSwingGame.main();

    }

}

class BattleShipsSwingGame extends JFrame {
    public static final String MAIN_WINDOW = "Battle Ships";


    BattleShipsSwingGame() throws HeadlessException {
        setName(MAIN_WINDOW);
    }

    public static void main(String... args) {
        BattleShipsSwingGame game = new BattleShipsSwingGame();
        game.setVisible(true);
    }
}

class BattleShipDriver extends JFrameDriver {


    @SuppressWarnings("unchecked")
    public BattleShipDriver(){
        super(new GesturePerformer() , new AWTEventQueueProber() , named(BattleShipsSwingGame.MAIN_WINDOW) , showingOnScreen());
    }

}


