//---------------------------------------------------------------
//         COSC 1337.S01
//         Lab 4
//         2015/3/26
//         Rectangle.java
//---------------------------------------------------------------
public class Rectangle {   
    private double width;
    private double height;
    private String color;
    public Rectangle() {
        width = 3;
        height = 4;
        color = "white";
        System.out.println("Rectangle class - default constructor");
    }
    public Rectangle (double width , double height, String color) { 
        this.width = width;
        this.height = height;
        this.color = color;
        System.out.println("Rectangle class - overloaded constructor");
    }
    public double getWidth () {return width;}
    public void setWidth (double width) {this.width = width;}
    public double getHeight () {return height;}
    public void setHeight (double height) {this.height = height;}
    public String getColor () {return new String(color);}
    public void setColor ( String color ) { this.color = color;}
    public double findArea () {return width*height;}
    @Override
    public String toString () {
        String x;
        x = " " + width + " " + height + " " + color + " ";
        return x;
    }
}