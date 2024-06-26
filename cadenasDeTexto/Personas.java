package cadenasDeTexto;

// Crear clase Personas
public class Personas {

    // Atributos de la clase
    public String nombre;
    public int edad;
    public int cuenta;
    public String automovil;
    public String hobby;

    // Constructor de la clase
    public Personas(String nombre, int edad, int cuenta, String automovil, String hobby) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = cuenta;
        this.automovil = automovil;
        this.hobby = hobby;
    }

    // Métodos y/o Acciones
    public void saludar() {
        System.out.println("Hola banda soy: " + nombre + " de " + edad + " años, mi cuenta es " + cuenta +
                ", tengo un " + automovil + " y mi hobby es " + hobby + ".");
    }

    // Métodos getter de los atributos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCuenta() {
        return cuenta;
    }

    public String getAutomovil() {
        return automovil;
    }

    public String getHobby() {
        return hobby;
    }

    // Métodos setter de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public void setAutomovil(String automovil) {
        this.automovil = automovil;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // Método main para probar la clase Personas
    public static void main(String[] args) {
        Personas persona1 = new Personas("Luis", 25, 233113, "Corsa", "Ciclismo");

        // Llamar al método Saludar
        persona1.saludar();
    }
}
