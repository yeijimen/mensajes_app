import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("---------------------");
            System.out.println("Aplicacion de Mensajes");
            System.out.println("1. Crear Mensaje");
            System.out.println("2. Listar Mensaje");
            System.out.println("3. Editar Mensaje");
            System.out.println("4. Eliminar Mensaje");
            System.out.println("5. Salir");

            //leemos la opcion ingresada por el usuario
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){
                case 1:
                    MensajeServices.crearMensaje();
                    break;
                case 2:
                    MensajeServices.listarMensaje();
                    break;
                case 3:
                    MensajeServices.editarMensaje();
                    break;
                case 4:
                    MensajeServices.borrarMensaje();
                    break;
                default:
                    break;
            }
        }while (opcion != 5);
    }
}
