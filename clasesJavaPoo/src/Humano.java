public class Humano {

    String nombre;//asi dejas los datos vacios para agregarlos en el otro archivo
    byte edad;

    public Humano(String nuevoNombre, byte nuevaEdad){// creas un constructor como este para datos que quieres tener ya listos o implementados en el otro archivo
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
