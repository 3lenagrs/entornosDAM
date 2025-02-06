public class Usuario {
    public String nombre;
    public String apellido;
    public String email;

    public Usuario(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public void detallesUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("email: " + email);
        System.out.println("----------------------");
    }
}