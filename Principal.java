import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo! :)");
        fechaHoraActual();
    }

    public static void fechaHoraActual() {
        LocalDateTime actual = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + actual);
    }
}
