package lt.bt.tasks.figure.data;

import lt.bt.tasks.figure.Figure;

public class Triangle extends Figure {


    @Override
    public void findPerimeter() {
        double k = area / Math.sqrt(3);
        perimeter = 8 * Math.sqrt(k);
        System.out.println("Kai trikampio plotas " + area + " trikampio perimetras " + nf.format(perimeter));

    }

    @Override
    public void findArea() {
        double n = Math.sqrt(3) / 64;
        area = Math.pow(perimeter, 2) * n;
        System.out.println("Kai trikapmio perimetras " + perimeter + " trikampio plotas " +  nf.format(area));

    }

    @Override
    public void findLength() {
        double k = area / Math.sqrt(3);
        length = 2 * Math.sqrt(k) ;
        System.out.println("Kai trikampio plotas " + area + " trikampio krastines ilgis " + nf.format(length));

    }

    @Override
    public void findRadius() {

    }
}
