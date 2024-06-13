package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnaks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        var salir = false;
        var consola = new Scanner(System.in);
        // lista de productos de tipo Snacks
        List<Snack> productos = new ArrayList<>();
        System.out.println("** Maquina de Snacks **");
        Snacks.mostrarSnacks();
        while ((!salir)){
            try { var opcion = mostrarMenu(consola);
             // salir = ejecutarOpciones(opcion, consola, productos);

            }catch (Exception e){
                System.out.println("Ocuerrio un error: "+ e.getMessage());
            }
            finally {
                System.out.println();


            }
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.println("""
                        Menu:
                        1.Comprar Snack
                        2.Mostrar ticket
                        3.Agregar Nuevo Snack
                        4.Salir
                        Elige una opcion:\s""");
        return Integer.parseInt(consola.nextLine());
    }

}
