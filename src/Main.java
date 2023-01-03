/*
    Code from https://horstmann.com/sjsu/graphics/

 */

public class Main {
    public static void main(String[] args) {

        Rectangle box = new Rectangle(5,10,60,80);
        box.draw();
        Ellipse egg = new Ellipse(50, 200, 40, 60);
        egg.setColor(Color.YELLOW);
        egg.fill();
    }
}