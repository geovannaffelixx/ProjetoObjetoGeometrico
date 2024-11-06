package ObjetoGeo;

public class Triangulo extends ObjetoGeometrico {
 private double base;
 private double altura;

 public Triangulo(double base, double altura) {
     this.base = base;
     this.altura = altura;
 }

 public double getArea() {
     area = (base * altura) / 2;
     return area;
 }

 public double getPerimetro() {
     perimetro = 3 * base; // considerando equilátero
     return perimetro;
 }
}
