package learning.oop;

// Restored from commit b038c969; adapted for a standalone lesson.
// Run this class's main() in IntelliJ IDEA.
public class AbstractFigureDemo {
    public static void main(String[] args) {
        Figure[] figures = {
                new Square(),
                new Line()
        };
        for (Figure figure : figures){
            figure.rotate();
        }
    }
}


// Abstract classes can contain both implemented and abstract methods.
abstract class Figure{
    public void moveLeft(){
        System.out.println("Moving left");
    }
    // Concrete subclasses must implement rotate().
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
