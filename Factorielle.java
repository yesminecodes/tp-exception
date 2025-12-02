class Factorielle{
public static void main (String[] args)
{
    int i, nbEntiers=0, factorielle=1;
    int ancien;
    try {
        nbEntiers = Integer.parseInt(args[0]);
        if (nbEntiers < 1) {
            throw new NumberFormatException("NEGATIF");
        } else if (nbEntiers > 20) {
            throw new Fact2(" la factorielle ne doit pas etre superieure a 20");
        }
    }
    catch (NumberFormatException e) {
        if (e.getMessage().equals("NEGATIF")) {
            System.out.println("la factorielle d'un nombre négatif n'est pas définie");
            return;
        }
        else {
            System.out.print(" La base de la factorielle doit être ENTIERE");
            return;
        }
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(" Donnez en paramètre la base de la factorielle");
        return;
    }
    catch (Fact2 e) {
        System.out.print("Erreur !!!!"+e.getMessage());
        return;
    }
    for (i=2;i<= nbEntiers;i++)
    {
        ancien=factorielle;
        factorielle *= i;
    }
    System.out.println(" Voila la factorielle des "+ nbEntiers + " premiers entiers : "+ factorielle );
}
}
