interface Drawable{
    void draw();
    default void print(){
        System.out.println(" printing drawing.....");
    }
}
class Rect implements Drawable{
    @Override
    public void draw(){
        System.out.println("drawing...");
    }
}
public class Practice22 {
    public static void main(String[] args) {
        Rect rectObj = new Rect();
        rectObj.draw();
        rectObj.print();
    }
}
