package promedio;
public class Promedio {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        int numeros[] = {2, 8, 6, 14};
        int acumulado = 0;
        double resPromedio = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            acumulado = calc.suma(acumulado, numeros[i]);
        }

        resPromedio = calc.division(acumulado, numeros.length);
        
        System.out.println("El promedio es: " + resPromedio);
    }
    
}
