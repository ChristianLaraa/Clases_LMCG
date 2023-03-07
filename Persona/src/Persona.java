public class Persona {
    private int edad;
    private String nombre;
    private double estatura;
    private double peso;
    private String genero;

    public Persona() {
        edad = 0;
        nombre = "";
        estatura = 0.0;
        peso = 0.0;
        genero = "";
    }

    public Persona(int edad, String nombre, double estatura, double peso, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                '}';
    }
    public void Comer() {
        peso += 5;
        System.out.println(nombre + " Se preparo una quesadilla y se la comio con guacamole" + peso + "Kg" );
    }
    public void Correr() {
        peso -= 5;
        System.out.println(nombre + " Para bajar de peso, decides hacer cardio y/o corres para bajar de peso. "  + peso + "Kg");
    }
    public void Jugar() {
        estatura += 0.10;
        System.out.println(nombre + " Juega basketball por ende tiende a crecer mas en menos tiempo " + estatura + "m");
    }

}