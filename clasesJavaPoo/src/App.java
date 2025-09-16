public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String universidad = "Del valle";
        System.out.println(universidad);
        Humano humano1 = new Humano();
        humano1.setNombre("Juan Alberto");
        humano1.setEdad((byte)30);
        Humano humano2 = new Humano("Nicolás", (byte)19, "1117350032");
        System.out.println(humano2.getNombre()); //tenes una variable que basicamente esta creada en la clase humano, tenes que llamarla para que te imprima lo que necesitas
        System.out.println(humano2.getEdad());
        System.out.println(humano1.getEdad());
        System.out.println(humano1.getNombre());
        humano2.saludar();
        humano2.presentarse();
        humano1.presentarse();
        System.out.println(humano1.estrarto(290000));
    }
}
