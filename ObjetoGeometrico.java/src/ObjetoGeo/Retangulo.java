package ObjetoGeo;

public class Retangulo extends ObjetoGeometrico {
 private double comprimento;
 private double altura;

 public Retangulo(double comprimento, double altura) {
     this.comprimento = comprimento;
     this.altura = altura;
 }

 public double getArea() {
     area = comprimento * altura;
     return area;
 }

 public double getPerimetro() {
     perimetro = 2 * (comprimento + altura);
     return perimetro;
 }
}
