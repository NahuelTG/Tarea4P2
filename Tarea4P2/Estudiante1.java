
/**
 * Write a description of class Estudiante1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante1 extends Maestro
{
    private int Altura;
    
    public Estudiante1(String nombre, int edad, int peso, int altura){
        super(nombre , edad , peso);
        Altura = altura;
    }
    
    public double MinEdadPesoconMitadAltura(){
        double Min = 0;
        
        Min = Math.min(Edad + Peso, Altura/2);
        
        return Min;
    }
}
