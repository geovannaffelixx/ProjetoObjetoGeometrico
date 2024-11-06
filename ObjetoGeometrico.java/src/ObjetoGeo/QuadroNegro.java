package ObjetoGeo;

public class QuadroNegro {
 private Quadrado quadrado;
 private Retangulo retangulo;
 private Circunferencia circunferencia;
 private Triangulo triangulo;

 public void criaQuadrado(double lado, String cor) {
     quadrado = new Quadrado(lado);
     quadrado.setCor(cor);
 }

 public void criaRetangulo(double comprimento, double altura, String cor) {
     retangulo = new Retangulo(comprimento, altura);
     retangulo.setCor(cor);
 }

 public void criaCircunferencia(double raio, String cor) {
     circunferencia = new Circunferencia(raio);
     circunferencia.setCor(cor);
 }

 public void criaTriangulo(double base, double altura, String cor) {
     triangulo = new Triangulo(base, altura);
     triangulo.setCor(cor);
 }

 public void mostraAreaObjetos() {
     System.out.println("Área dos objetos:");
     System.out.println("Quadrado: " + quadrado.getArea());
     System.out.println("Retângulo: " + retangulo.getArea());
     System.out.println("Triângulo: " + triangulo.getArea());
     System.out.println("Circunferência: " + circunferencia.getArea());
 }

 public void mostraPerimetroObjetos() {
     System.out.println("Perímetros dos objetos:");
     System.out.println("Quadrado: " + quadrado.getPerimetro());
     System.out.println("Retângulo: " + retangulo.getPerimetro());
     System.out.println("Triângulo: " + triangulo.getPerimetro());
     System.out.println("Circunferência: " + circunferencia.getPerimetro());
 }

 public void mostraCorObjetos() {
     System.out.println("Cores dos objetos:");
     System.out.println("Quadrado: " + quadrado.getCor());
     System.out.println("Retângulo: " + retangulo.getCor());
     System.out.println("Triângulo: " + triangulo.getCor());
     System.out.println("Circunferência: " + circunferencia.getCor());
 }

 public static void main(String[] args) {
     QuadroNegro quadroNegro = new QuadroNegro();
     quadroNegro.criaQuadrado(10.6, "Branco");
     quadroNegro.criaRetangulo(50.5, 20.4, "Azul");
     quadroNegro.criaTriangulo(6.7, 5.5, "Amarelo");
     quadroNegro.criaCircunferencia(10, "Verde");

     quadroNegro.mostraAreaObjetos();
     quadroNegro.mostraPerimetroObjetos();
     quadroNegro.mostraCorObjetos();
 }
}
