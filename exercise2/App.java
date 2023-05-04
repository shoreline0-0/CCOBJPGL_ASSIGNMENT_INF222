import javax.print.attribute.standard.MediaSize.NA;

import Explorers.*;
import Planet.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet venus = new Venus();
        Planet earth = new Earth();
        Planet jupiter = new Jupiter();
        Planet uranus = new Uranus();
        Planet neptune = new Neptune();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer capsule = new AndroidExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        venus.accept(astronaut);
        earth.accept(astronaut);
        jupiter.accept(astronaut);
        uranus.accept(astronaut);
        neptune.accept(astronaut);

        System.out.println("");
        
        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        venus.accept(rover);
        earth.accept(rover);
        jupiter.accept(rover);
        uranus.accept(rover);
        neptune.accept(rover);

        System.out.println("");
        
        mars.accept(capsule);
        saturn.accept(capsule);
        mercury.accept(capsule);
        venus.accept(capsule);
        earth.accept(capsule);
        jupiter.accept(capsule);
        uranus.accept(capsule);
        neptune.accept(capsule);
    }
}
