
/**
 * Write a description of class Test0050 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test0050
{
    /**
     * sumatoria un numero "b" un numero "a" de veces  
     */
    private int sumatoria(int a, int b)
    {
        //resultado final
        int  sumatoria = 0;
       
        for (int i = 0; i < a ; i++ )
        {
            sumatoria = sumatoria + b;
        }
        return sumatoria;
    }

    /**
     * realiza multiplicaciones dos números enteros positivos
     */
    public int producto(int operador1, int operador2)
    {
        int producto = 0;
        //si ninguno de los operandos es cero
        if ( operador1 != 0 && operador2 != 0)
        {
            //asegurar que el valor de operando1 es el menor de los dos
            if (operador1 > operador2)
            {
                int aux;
                aux = operador1;
                operador1 = operador2;
                operador2 = aux;
            }

            //ningun operador es negativo
            if ( operador1 > 0)
            {
                producto = sumatoria(operador1, operador2);
            }
            
            //solo un operador es negativo
            else if (operador2 > 0)
            {
                producto = (-sumatoria(-operador1, operador2 ) );
            }
            
            //ambos operandos son negativos
            else 
            {
                producto = sumatoria (-operador1, -operador2);
            }
            
        }
        return producto;
    }
}
