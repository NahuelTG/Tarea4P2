
/**
 * Write a description of class Estudiante2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante2 extends Maestro
{
    private boolean Soltero;
    
    public Estudiante2(String nombre, int edad, int peso, boolean soltero){
        super(nombre , edad , peso);
        Soltero = soltero;
    }
    
    public String PresentarPareja(){
        String Presentar = "";
        
        if(Soltero == true){
            Presentar = "";
        }else{
            Presentar = "Ella es mi pareja";
        }
        
        return Presentar;
    }
    public void setSoltero(boolean soltero){
        Soltero = soltero;
    }
}
