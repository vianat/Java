package src.main.ru.nikiforov;

    /**
     * Класс расчета дистанции между 2я точками
     */
public class Point {
    public double x;
    public double y;
    public double distance;

    //конструктор создания объекта класса Point
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point point1 = new Point(1.0, 1.0);
    Point point2 = new Point(2.0, 2.0);

    //расчет расстояния между 2х точек
    public double distanceTo(Point point) {

        return distance = Math.sqrt(Math.pow(point2.x-point1.x, 2) +
         							Math.pow(point2.y-point2.y, 2));
	}

}