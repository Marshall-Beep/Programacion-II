package practica2;

public class Prac2 {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 3);
        Punto p2 = new Punto(4, 6);
        Linea l = new Linea(p1, p2);
        Circulo c = new Circulo(p1, 3.0f);

        System.out.println(l);
        l.dibujaLinea();

        System.out.println(c);
        c.dibujaCirculo();
    }
}

class Punto {
    public float x;
    public float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] coord_cartesianas() {
        return new float[]{this.x, this.y};
    }

    public float[] coord_polares() {
        float radio = (float) Math.sqrt(this.x * this.x + this.y * this.y);
        float angulo = (float) Math.atan2(this.y, this.x); // atan2(y, x) evita errores
        angulo = (float) Math.toDegrees(angulo);
        return new float[]{radio, angulo};
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", this.x, this.y);
    }
}


//CLASE LINEA 


class Linea {
    public Punto p1;
    public Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return "Línea de " + p1 + " a " + p2;
    }

    public void dibujaLinea() {
        System.out.println("linea en " + p1 + " y " + p2);
    }
}


//CLASE CIRCULO


class Circulo {
    public Punto centro;
    public float radio;

    public Circulo(Punto c, float r) {
        this.centro = c;
        this.radio = r;
    }

    public String toString() {
        return "Círculo centro " + centro + " y radio " + radio;
    }

    public void dibujaCirculo() {
        System.out.println("Dibujando círculo con centro " + centro + " y radio " + radio);
    }
}
