abstract public class Shape{
    private double height;
    private double startPosition;

    Shape(double startPosition){
        this.startPosition = startPosition;
    }

    abstract double calculateVolume();

    abstract double findArea();
    
}