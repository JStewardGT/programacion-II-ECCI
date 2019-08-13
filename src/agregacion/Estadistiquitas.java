package agregacion;

public class Estadistiquitas {

    private Numeritos numeriticos;
    
    public Estadistiquitas(Numeritos pnumeritos){
        numeriticos=pnumeritos;
    }
    
    public void imprimirNumeritos(){
        for (int numerito : numeriticos.numeritos_almacenaditos){
            System.out.println(numerito);
        }
    }
}
