
import Planet.Mars;
import Planet.Planet;
import Planet.Mercury;
import Planet.Saturn;
import Planet.Venus;
import Planet.Earth;
import Planet.Jupiter;
import Planet.Uranus;
import Planet.Neptune;

public interface Explorer {

    void visit(Mercury mercury);
    void visit(Mars mars);
    void visit(Saturn saturn);
    void visit(Venus venus);
    void visit(Earth earth);
    void visit(Jupiter jupiter);
    void visit(Uranus uranus);
    void visit(Neptune neptune);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}