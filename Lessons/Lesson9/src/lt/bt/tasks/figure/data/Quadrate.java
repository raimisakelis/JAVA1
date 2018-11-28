package lt.bt.tasks.figure.data;

import lt.bt.tasks.figure.Figure;

public class Quadrate extends Figure {


    @Override
    public void findPerimeter() {
        perimeter = Math.sqrt(area) * 4;
        System.out.println("Kai kvadrato plotas " + area + " kvadrato perimetras " + nf.format(perimeter));
    }


    @Override
    public void findArea() {
        double m = perimeter / 4;
        area = Math.pow(m, 2);
        System.out.println("Kai kvadrato perimetras " + perimeter + " kvadrato plotas " + nf.format(area));

    }

    @Override
    public void findLength() {
        length =  Math.sqrt(area);
        System.out.println("Kai kvadrato plotas " + area + " kvadrato krastines ilgis  " + nf.format(length));
    }

    @Override
    public void findRadius() {

    }
}
