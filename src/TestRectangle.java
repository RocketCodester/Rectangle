//---------------------------------------------------------------
//         COSC 1337.S01
//         Lab 4
//         2015/3/26
//         TestRectangle.java
//---------------------------------------------------------------
public class TestRectangle {
    public static void main (String args[]) {
        Rectangle r1 = new Rectangle(12,12,"blue");
        System.out.println(r1);
        Rectangle r2 = new Rectangle(5,10,"red");
        System.out.println(r2);
        Rectangle r3 = new Rectangle( );
        r3.setWidth(3);
        r3.setHeight(14);
        r3.setColor("yellow");
        System.out.println(r3);
    	System.out.println(r3.getWidth());
    	System.out.println(r3.getHeight());
    	System.out.println(r3.getColor());
    	System.out.println(r3.findArea());
    }
}