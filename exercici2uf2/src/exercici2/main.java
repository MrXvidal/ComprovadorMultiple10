
package exercici2;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner teclat = new Scanner(System.in);
        String error;
        
        try
        {
            System.out.println("Escriu un nombre sencer:");
        
            int n1 = teclat.nextInt();
            String tmp = teclat.nextLine();

            System.out.println("Escriu un altre nombre sencer:");

            int n2 = teclat.nextInt();
            String tmp1 = teclat.nextLine();
            
            
            
            int resultat = dividir(n1, n2);
            
            error = String.valueOf(resultat);
        }
        catch(ArithmeticException ex)
        {
            error = "ERROR. 0 no es divisible!!";
        }
        catch(NumberFormatException ex)
        {
            error = "El format del primer o del segon nombre es incorrecte.";
        }
        catch(Mult10Exception ex)
        {
            error = ex.getMessage();
        }
        catch(ForaIntervalException ex)
        {
            error = ex.getMessage();
        }
        
        System.out.println(error);
    }
    
    public static int dividir(int n1, int n2) throws NumberFormatException, ArithmeticException, exercici2.Mult10Exception, exercici2.ForaIntervalException
    {
        if(n1 < 1 || n2 < 1 || n1 > 100 || n2 > 100)
        {
            throw new ForaIntervalException("Ho sento, els nombres estan fora de l'interval");
        }
        else if(n1 % 10 != 0 || n2 % 10 != 0)
        {
            throw new Mult10Exception("Ho sento, els nombres no son multiples de 10");
        }
        return(n1/n2);
    }

}
