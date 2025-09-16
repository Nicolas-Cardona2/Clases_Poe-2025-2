public class Humano {

    private String nombre;//asi dejas los datos vacios para agregarlos en el otro archivo
    private byte edad;
    private String identificacion;

    public Humano(String nuevoNombre, byte nuevaEdad, String nuevaIdentificacion){// creas un constructor como este para datos que quieres tener ya listos o implementados en el otro archivo
        nombre = nuevoNombre;
        edad = nuevaEdad;
        identificacion = nuevaIdentificacion;
    }

    public Humano(){

    }

    public void saludar(){
        System.out.println("Que pasa corazón, mi cedula es " + identificacion);
    }

    public void presentarse(){
        System.out.println("Hola miamor, me llamo " + nombre + " y tengo " + edad);
    }

    public String estrarto(int salario){
        if(salario == 0){
            return "0";
        }else{
            return "3";
        }

    }

    public String getNombre(){
    return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public void setEdad(byte nuevaEdad){
        edad = nuevaEdad;
    }

    public byte getEdad(){
    return edad;
    }

    public String getIdentificacion(){
    return identificacion;
    }

    /* se pueden crear los getter, setters y el constructor de una clase desde el mismo visual con click derecho -> source action y ahi 
      elegit la opcion que desean 
     */
}
