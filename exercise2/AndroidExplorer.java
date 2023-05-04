import Planets.*;

public class AndroidExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Warning: Landing to Mercury. Halt all unnecessary processes to avoid oveheating.");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Warning: Landing to Venus. Halt all unnecessary processes to avoid oveheating.");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("Warning: Landing to Earth. Halt all unnecessary processes to avoid oveheating.");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Warning: Landing to Mars. Halt all unnecessary processes to avoid oveheating.");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Warning: Landing to Jupiter. Halt all unnecessary processes to avoid oveheating.");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Warning: Landing to Saturn. Halt all unnecessary processes to avoid oveheating.");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Warning: Landing to Uranus. Halt all unnecessary processes to avoid oveheating.");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Warning: Landing to Neptune. Halt all unnecessary processes to avoid oveheating.");
    }
}