import java.awt.*;

public class LibroRead {
    import java.awt.*;

    public class LibroRead {
        public static void main(String[] args) {
            Libro titulo1= new Libro("Java a Fondo", "Aprendizaje, programación",2, Color.BLUE, "Sznajdleder");
            Libro titulo2 = new Titulo();
            titulo1.setGenero("Novela");
            titulo1.setAnoPublicacion(2015);
            titulo1.setColor(Color.BLACK);
            titulo1.setAutor("Bukowski");

            System.out.println(titulo1.toString());
            System.out.println(titulo2.toString());

            titulo1.leer();
            titulo2.analizar();
            titulo1.subrayar();
        }
    }
}
