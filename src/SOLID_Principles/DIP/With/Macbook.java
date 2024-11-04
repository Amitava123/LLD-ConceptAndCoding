package SOLID_Principles.DIP.With;

import SOLID_Principles.DIP.Without.Keyboard;
import SOLID_Principles.DIP.Without.Mouse;

public class Macbook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public Macbook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
