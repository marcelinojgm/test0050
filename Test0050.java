
/**
 * Write a description of class Test0050 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test0050
{
    /**
     * realiza multiplicaciones dos números enteros positivos
     */
    public int multiplicar(int operador1, int operador2)
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

            int mod1 = modulo(operador1);
            int mod2 = modulo(operador2);

            for (int i = 0; i < mod1 ; i++ )
            {
                producto = producto + mod2;
            }

            //ningun operador1 es negativo
            if ( operador1 > 0)
            {
                producto = (-producto);
            }

            //solo un operador2 es negativo
            if (operador2 > 0)
            {
                producto = (-producto);
            }

        }
        return producto;

    }

    /**
     * realiza divisiones enteras
     */
    public int dividir(int dividendo, int divisor)
    {
        int cociente = 0;

        if(dividendo != 0 && divisor !=0)   
        {
            int mod1 = modulo(dividendo);
            int mod2 = modulo(divisor);

            while (mod1 >= mod2)
            {
                mod1 = mod1 - mod2 ;
                cociente++;
            }

            if(divisor < 0)
            {
                cociente = (-cociente);
            }

            if (divisor < 0)
            {
                cociente =(-cociente);
            }
        }
        return cociente;
    }

    /**
     * retorna el modulo del numero introducido
     */
    public int modulo(int num)
    {
        if (num < 0)
        {
            num = (-num);
        }
        return num;
    }

    /**
     * calcula la potencia dada la base y el exponente(siempre positivo)
     */
    public int potencia(int base, int exponente)
    {
        int potencia = 0;
        if (base != 0)
        {
            potencia = 1;
            for(int i = 0; i < exponente; i++)
            {
                potencia = multiplicar(potencia,base);
            }
        }
        return potencia;
    }

    /**
     * realiza raices cuadradas enteras, si la raiz cuadrada no es exacta devuelve -1 e imprime un mensaje de error
     */
    public int raiz (int radicando)
    {
        int raiz = (-1);
        if(radicando >= 0)
        {
            int num = 0;

            while( ( potencia(num, 2) < radicando ) && (num < radicando)  )
            { 
                num++;
            }

            if (potencia(num, 2) == radicando)
            {
                raiz = num;
            }
        }

        if(raiz == (-1))
        {
            System.out.println("error");
        }

        return raiz;
    }
}
