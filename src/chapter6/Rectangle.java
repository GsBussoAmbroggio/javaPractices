package chapter6;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }
    public Rectangle(double length, double width){
        this.length = length; //can be set this way
        setWidth(width); // or can be set this way. these are only different here to demo alternative options.

    }

    double getLength(){
        return  length;
    }

    void setLength(double length){
        this.length = length;
    }
    double getWidth(){
        return width;
    }
    void setWidth(double width){
        this.width = width;
    }
    double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    double calculateArea(){
        return length * width;
    }

}
