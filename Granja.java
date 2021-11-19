
public class Granja
{
   private Granja granjero;
   private String nombre;
   private String ubicacion;
   
   public Granja (Granjero propietario){
       this.granjero = granjero;
    }
    
    public Granja(String nombre, String ubicacion, Granja granjero){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.granjero = granjero;
        
    }
    
    
   public String toString(){
       StringBuilder resultado = new StringBuilder();
       
       resultado.append("\n Datos de la granja ");
       resultado.append( "\n ==================== ");
       resultado.append( "\n Nombre : ");
       resultado.append(nombre);
       resultado.append("\n Ubicacion : ");
       resultado.append(ubicacion);
       resultado.append( "\n Granjero : ");
       resultado.append(granjero);
       return resultado.toString();
   }
}
