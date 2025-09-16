public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String universidad = "Del valle";
        Humano humano1 = new Humano();
        humano1.nombre = "Juan Alberto";
        humano1.edad = 19;
        Humano humano2 = new Humano("Nicolás", (byte)19);
        System.out.println(humano2.nombre); //tenes una variable que basicamente esta creada en la clase humano, tenes que llamarla para que te imprima lo que necesitas
        System.out.println(humano2.edad);
        System.out.println(humano1.edad);
        System.out.println(humano1.nombre);
        humano2.saludar();
        humano2.presentarse();
        humano1.presentarse();
        System.out.println(humano1.estrarto(290000));
    }
}
