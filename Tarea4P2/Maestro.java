
/**
 * Write a description of class Maestro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maestro
{
    //Atributos
    protected String Nombre;
    protected int Edad;
    protected int Peso;
    //Constructor
    public Maestro(String nombre, int edad, int peso){
        Nombre = nombre;
        Edad   = edad;
        Peso   = peso;
    }
    
    //Metodos
    public double promedioNotas(double Nota1, double Nota2, double Nota3){
        double Nota = 0;
        
        Nota = (Nota1 + Nota2 + Nota3) / 3; 
        
        return Nota;
    }
    
    public double MaxEdadPeso(){
        double Max = 0;
        
        Max = Math.max(Edad, Peso);
        
        return Max;
    }
    
    /*
     * Hora esta en un sistema de 24 horas
     */
    public String Presentacion(double hora){
        String saludo = "";
        
        if(hora >= 6 && hora <= 12){
            saludo = "Buenos dias clase, soy su maestro "+ Nombre + " espero con ansias ver su desempeño";
        }
        if(hora >= 13 && hora <= 18){
            saludo = "Buenos tardes clase, soy su maestro "+ Nombre + " espero con ansias ver su dedicacion";
        }
        if(hora >= 19 && hora <= 24){
            saludo = "Buenos noches clase, soy su maestro "+ Nombre + " espero con ansias ver su trabajo";
        }
        if(hora >= 0 && hora <= 5){
            saludo = "Zzzzzzz";
        }
        
        return saludo;
    }
}
