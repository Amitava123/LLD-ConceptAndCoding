package SOLID_Principles.DIP.Without;

public class Macbook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public Macbook() {
        this.keyboard = new WiredKeyboard();
        this.mouse = new WiredMouse();
    }
}
