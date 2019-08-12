package promedio;
public class Promedio {

    public static void main(String[] args) {
        
        Calculadora promedio = new Calculadora();
        int numeros[] = {2, 8, 6, 14};
        
        int acumulado = 0;
        double resPromedio = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            acumulado = promedio.suma(acumulado, numeros[i]);
            System.out.println(acumulado);
        }
        System.out.println(numeros.length);
        
        resPromedio = promedio.division(acumulado, numeros.length);
        
        System.out.println("El promedio es: " + resPromedio);
    }
    
}
