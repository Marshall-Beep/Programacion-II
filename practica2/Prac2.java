import javax.swing.*;
import java.awt.*;

public class Prac2 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Punto p1 = new Punto(50, 150);
        Punto p2 = new Punto(250, 300);
        Linea l = new Linea(p1, p2);
        Circulo c = new Circulo(p1, 50);

        l.dibujaLinea(g2);
        c.dibujaCirculo(g2);
        dibujarPunto(g2, p1);
        dibujarPunto(g2, p2);
    }

    public void dibujarPunto(Graphics2D g2, Punto p) {
        g2.setColor(Color.BLACK);  
        g2.fillOval((int) p.x - 3, (int) p.y - 3, 6, 6);  // Dibujar un punto pequeño
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Gráfico en Swing");
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(new Prac2());
        ventana.setVisible(true);
    }
}

// CLASE PUNTO
class Punto {
    public float x, y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
}

// CLASE LINEA
class Linea {
    public Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void dibujaLinea(Graphics2D g2) {
        g2.setColor(Color.BLUE); 
        g2.setStroke(new BasicStroke(2)); 
        g2.drawLine((int) p1.x, (int) p1.y, (int) p2.x, (int) p2.y); 
    }
}

// CLASE CIRCULO
class Circulo {
    public Punto c;
    public float r;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public void dibujaCirculo(Graphics2D g2) {
        g2.setColor(Color.RED); 
        g2.setStroke(new BasicStroke(2));
        g2.drawOval((int) (centro.x - radio), (int) (centro.y - radio), (int) (radio * 2), (int) (radio * 2));
    }
}
