import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = {
                new Square(),
                new Line()
        };
        for (Figure figure1: figure){
            figure1.rotate();
        }
    }
}


abstract class Figure{
    public void moveLeft(){
        System.out.println("Moving left");
    }
    public abstract void rotate();
}

class Square extends Figure{
    @Override
    public void rotate(){
        System.out.println("Square does not change");
    }
}

class Line extends Figure{
    @Override
    public void rotate(){
        System.out.println("Line rotated");
    }
}

