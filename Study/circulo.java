package Study;

public class circulo {
    private double raio;

    public circulo(double raio) {
        this.raio = raio;
    }

    public static void circunferencia(double raio){
        double circunfe;
        circunfe = 2*3.14*raio;
    }

    public static void diametro(double raio){
        double diam;
        diam = 2 * raio;
    }

    public static void area(double raio){
        double area;
        area = 3.14 * Math.pow(raio,raio);
    }
}