package ObjetoGeo;

public class Quadrado extends ObjetoGeometrico {
 private double lado;

 public Quadrado(double lado) {
     this.lado = lado;
 }

 public double getArea() {
     area = lado * lado;
     return area;
 }

 public double getPerimetro() {
     perimetro = 4 * lado;
     return perimetro;
 }
}
