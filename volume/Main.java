class Shape {
    private double volume;

    public void setVolume(double v) { volume = v; }
    public double getVolume() { return volume; }
}

class Cube extends Shape {
    public void calc(double s) { setVolume(s * s * s); }
}

class Sphere extends Shape {
    public void calc(double r) { setVolume(4.0/3 * Math.PI * r * r * r); }
}

class Cylinder extends Shape {
    public void calc(double r, double h) { setVolume(Math.PI * r * r * h); }
}

public class Main {
    public static void main(String[] args) {

        Cube c = new Cube();
        c.calc(5);
        System.out.println("Cube: " + c.getVolume());

        Sphere s = new Sphere();
        s.calc(3);
        System.out.println("Sphere: " + s.getVolume());

        Cylinder cy = new Cylinder();
        cy.calc(2, 10);
        System.out.println("Cylinder: " + cy.getVolume());
    }
}