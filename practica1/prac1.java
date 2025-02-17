public class Punto {
	 private float x;
	    private float y;

	    public Punto(float x, float y) {
	        this.x = x;
	        this.y = y;
	    }

	    public float[] coordCartesianas() {
	        return new float[]{x, y};
	    }

	    public double[] coordPolares() {
	        double r = Math.sqrt(x * x + y * y);
	        double theta = Math.atan2(y, x);
	        return new double[]{r, theta};
	    }

	    public String toString() {
	        return "Punto(" + x + ", " + y + ")";
	    }

	    public static void main(String[] args) {
	        Punto p = new Punto(3, 4);
	        System.out.println(p.toString());
	        float[] cartesianas = p.coordCartesianas();
	        System.out.println("Coordenadas Cartesianas: (" + cartesianas[0] + ", " + cartesianas[1] + ")");
	        double[] polares = p.coordPolares();
	        System.out.println("Coordenadas Polares: (" + polares[0] + ", " + polares[1] + ")");
	    }