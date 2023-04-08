import java.util.Scanner;

public class MensajeServices {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu Mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Tu Nombre");
        String nombre = sc.nextLine();

        Mensaje registro = new Mensaje();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMensaje(){

    }

    public static void borrarMensaje(){

    }

    public static void editarMensaje(){

    }
}
