

public class Mascota
{
    private String nombre;
    private int edad;
    private String tipo;
    
    public Mascota(String nombre, int edad, String tipo){
        this.nombre= nombre;
        this.edad = edad;
        this.tipo = tipo;
    }
    
    public String toString(){
    StringBuilder resultado = new StringBuilder();
    
    resultado.append("\n Nombre : ");
    resultado.append(nombre);
    resultado.append("\n Edad : ");
    resultado.append(edad);
    resultado.append("\n Tipo : ");
    resultado.append(tipo);
    
    return resultado.toString();
    }
}
