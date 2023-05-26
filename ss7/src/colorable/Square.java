package colorable;

public class Square extends Shape implements Colorable{
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
