
public class Principal
{
    public static void main (){
        
        Granjero paco = new Granjero(" Avelardo ",
                            " De la Hoya", 42 , 'H');
     
        Granja granjaDePaco = new Granja ("PacoLandia", "Corea del Norte",paco );
        
        
        Mascota mascota = new Mascota("Rex", 13, "Perro");
        
        paco.setMascota(mascota);
        
        System.out.println(granjaDePaco);
        
        
        
    }
}
