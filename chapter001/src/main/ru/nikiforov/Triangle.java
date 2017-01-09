package src.main.ru.nikiforov;

//rласс треугольник
public class Triangle {
    public Point a;
    public Point b;
    public Point c;
    public double p;
    public double area;

    //конструктор класса треугольник
    public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
    }

    public double area() {

    double ab = distanceTo(a, b);
    double bc = distanceTo(b, c);
    double ac = distanceTo(a, c);

    double p = (ab+bc+ac)/2;
    double area = Math.sqrt(p*(p-ab)*(p-bc)*(p-ac));
    return area;
    }
}