import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Guerrero legolas = new Guerrero(TipoGuerrero.LARGA_DISTANCIA, "Legolas");
        Guerrero petrosky = new Guerrero(TipoGuerrero.CORTA_DISTANCIA, "Petro");

        int lista [] = {1,2,3};
        System.out.println(lista[1]);
        Guerrero lista2 [] = {legolas, petrosky, 
                              new Guerrero(TipoGuerrero.CORTA_DISTANCIA, "Jhon")};
        System.out.println(lista2[2].getNombre());

        ArrayList <Guerrero> listaUsuarios = new ArrayList<Guerrero>();
        boolean crearGuerreros = true;
        while(crearGuerreros){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Guerreros si o no?(S o N): ");
            String consulta = scanner.nextLine();
            switch (consulta) {
                case "S":
                    System.out.println("dame el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Dame el tipo del guerrero: ");
                    TipoGuerrero tipoGuerrero = TipoGuerrero.valueOf(scanner.nextLine());
                    listaUsuarios.add(new Guerrero(tipoGuerrero, nombre));
                    break;
                
                case "N":
                    crearGuerreros = false;
                    break;
                default:
                    System.out.println("pailotas no es ninguna de esas 2 opciones");
                    break;
            }
            System.out.println(listaUsuarios);
        }
    }
}
