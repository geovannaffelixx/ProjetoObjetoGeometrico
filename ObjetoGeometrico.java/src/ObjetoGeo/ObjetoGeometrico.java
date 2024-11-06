package ObjetoGeo;

public abstract class ObjetoGeometrico {
    protected double area;
    protected double perimetro;
    protected String cor;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public abstract double getArea();
    public abstract double getPerimetro();
}
