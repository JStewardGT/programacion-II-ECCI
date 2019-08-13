package agregacion;

public class Probadorsito {

    public static void main(String[] args) {
        Numeritos num=new Numeritos();
        num.numeritos_almacenaditos=new int[5];
        num.numeritos_almacenaditos[0]=3;
        num.numeritos_almacenaditos[1]=4;
        num.numeritos_almacenaditos[2]=1;
        num.numeritos_almacenaditos[3]=4;
        num.numeritos_almacenaditos[4]=2;
        Estadistiquitas est=new Estadistiquitas(num);
        
        est.imprimirNumeritos();
    }
    
}
