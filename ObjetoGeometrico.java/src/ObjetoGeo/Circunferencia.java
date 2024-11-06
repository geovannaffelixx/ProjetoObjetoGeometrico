package ObjetoGeo;

public class Circunferencia extends ObjetoGeometrico {
 private double raio;
 private final double pi = 3.141618;

 public Circunferencia(double raio) {
     this.raio = raio;
 }

 public double getArea() {
     area = pi * raio * raio;
     return area;
 }

 public double getPerimetro() {
     perimetro = 2 * pi * raio;
     return perimetro;
 }
}
