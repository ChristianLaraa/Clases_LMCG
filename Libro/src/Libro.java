import java.awt.*;

public class Libro {
    private String Titulo;
    private String Genero;
    private int AnoPublicacion;
    private Color color;
    private String Autor;

    public Libro() {
        Titulo = "";
        Genero = "";
        AnoPublicacion = 0;
        color = Color.blue;
        Autor = "";
    }

    public Libro(String Titulo, String Genero, int AnoPublicacion, Color color, String Autor) {
        this.Autor = Autor;
        this.Genero = Genero;
        this.AnoPublicacion = AnoPublicacion;
        this.color = color;
        this.Autor = Autor;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getAnoPublicacion() {
        return AnoPublicacion;
    }

    public void setAnoPublicacion(int edad) {
        this.AnoPublicacion = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Titulo='" + Titulo + '\'' +
                ", Genero='" + Genero + '\'' +
                ", AnoPublicacion=" + AnoPublicacion +
                ", color=" + color +
                ", Autor='" + Autor + '\'' +
                '}';
    }
    public void alimentar(){
        Autor = "Cortazar";
        System.out.println(Autor + " El es " + Autor + " Uno de los mejopres cuentistas de la historia.");
    }

    public void acariciar(){
        Autor = "Bukowski";
        System.out.println(Autor + " El es " + Autor+ "Padre del realismo sucio.");
    }
    public void reganio(){
        Autor = "Jung";
        System.out.println(Autor  + "El es" + Autor + "Padre de la psicologia moderna");
    }
}