import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Hola mundo! :)");
        
        fechaHoraActual();

        System.out.print("Número de usuarios: ");
        int numUsuarios = teclado.nextInt();
        scanner.nextLine();

        Usuario[] usuarios = new Usuario;

        for (int i=0; i < cantidad; i++) {
            System.out.println("Introduce la información del usuario: ");

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Apellido: ");
            String apellido = teclado.nextLine();

            System.out.print("Email: ");
            String email = teclado.nextLine();

            usuarios[i] = new Usuario(nombre, apellido, email);
        }

        System.out.println("\nDetalles de los usuarios:");
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            usuario.detallesUsuario();
        }

        public static void fechaHoraActual() {
            LocalDateTime actual = LocalDateTime.now();
            System.out.println("Fecha y hora actual: " + actual);
        }

        teclado.close();
    }
}