
/**
 * Write a description of class Estudiante3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante3 extends Maestro
{
    private boolean Discapacidad;
    
    public Estudiante3(String nombre, int edad, int peso, boolean discapacidad){
        super(nombre , edad , peso);
        Discapacidad = discapacidad;
    }
    
    public String Discapacidad(){
        String discapacidad = "";
        int Num = 0;
        if(Discapacidad == true){
            Num = (int)(Math.random() * 3);
            if(Num == 0){
                discapacidad = "Paralitico";
            }
            if(Num == 1){
                discapacidad = "Mudo";
            }
            if(Num == 2){
                discapacidad = "Sordo";
            }
        }else{
            discapacidad = "No tengo ninguna discapacidad";
        }
        
        return discapacidad;
    }
    public void setDiscapacidad(boolean discapacidad){
        Discapacidad = discapacidad;
    }
}
