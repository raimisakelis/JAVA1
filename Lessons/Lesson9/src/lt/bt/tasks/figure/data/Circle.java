package lt.bt.tasks.figure.data;

import lt.bt.tasks.figure.Figure;

public class Circle extends Figure {



    @Override
    public void findPerimeter() {
        double d = pi * area;
        perimeter = 2 * (Math.sqrt(d));
        System.out.println("Kai skritulio plotas " + area + " skritulio perimetras " + nf.format(perimeter));

    }

    @Override
    public void findArea() {
        area = Math.pow(perimeter, 2) / (4 * pi);
        System.out.println("Kai skritulio perimetras " + perimeter + " skritulio plotas " + nf.format(area));

    }

    @Override
    public void findLength() {


    }

    @Override
    public void findRadius() {
        radius = (Math.sqrt(area/pi));
        System.out.println("Kai skritulio plotas " + area + " skritulio spindulys " + nf.format(radius));

    }
}
