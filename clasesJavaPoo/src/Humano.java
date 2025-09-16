public class Humano {

    String nombre;
    byte edad;

    public Humano(String nuevoNombre, byte nuevaEdad){
        nombre = nuevoNombre;
        edad = nuevaEdad;
    }

    public Humano(){

    }

    public void saludar(){
        System.out.println("Que pasa corazón");
    }

    public void presentarse(){
        System.out.println("Hola miamor, me llamo " + nombre);
    }

    public String estrarto(int salario){
        if(salario == 0){
            return "0";
        }else{
            return "3";
        }

    }
}
