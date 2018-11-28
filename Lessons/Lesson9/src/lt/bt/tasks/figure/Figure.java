package lt.bt.tasks.figure;


import java.text.NumberFormat;

import static java.util.Locale.UK;

public abstract class Figure {

    protected String type;
    protected double area;
    protected double perimeter;
    protected double length;
    protected double radius;
    public float pi = (float) Math.PI;


    protected NumberFormat nf;  {
        nf = NumberFormat.getNumberInstance(UK);
        nf.setMaximumFractionDigits(2);
        nf.setMinimumIntegerDigits(1);
    }


    public abstract void findPerimeter();

    public abstract void findArea();

    public abstract void findLength();

    public abstract void findRadius();


    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getRadius() {
        return radius;
    }

    public double getLength() {
        return length;
    }

}
