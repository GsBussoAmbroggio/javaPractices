package chapter9;

public class Square extends Rectangle {

    @Override
    protected double calculatePerimeter(){
        return sides * length;
    }

    public void print(String c){
        System.out.println("I am a " + c);
    }
}