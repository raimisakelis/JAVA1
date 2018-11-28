package lt.bt.tasks;

import lt.bt.tasks.figure.Figure;
import lt.bt.tasks.figure.data.Circle;
import lt.bt.tasks.figure.data.Quadrate;
import lt.bt.tasks.figure.data.Triangle;

public class FigureTest {

    public static void main(String[] args) {

        Figure tri = new Triangle();
        Figure quad = new Quadrate();
        Figure cir = new Circle();

        //set area
        tri.setArea(100);
        quad.setArea(100);
        cir.setArea(100);

        //get perimeter
        tri.findPerimeter();
        quad.findPerimeter();
        cir.findPerimeter();

        //set perimeter
        tri.setPerimeter(100);
        quad.setPerimeter(100);
        cir.setPerimeter(100);

        //get area
        tri.findArea();
        quad.findArea();
        cir.findArea();

        //set area
        tri.setArea(100);
        quad.setArea(100);
        cir.setArea(100);


        //get radius or length
        tri.findLength();
        quad.findLength();
        cir.findRadius();



    }
}
