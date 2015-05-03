import caelum.CalcularPrimo;
import caelum.LerArquivo;

import java.io.FileNotFoundException;

/**
 * Created by vanessa on 29/04/2015.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        LerArquivo arq = new LerArquivo();
        CalcularPrimo calc = new CalcularPrimo();
        for (String nome : arq.getListaNomes()) {
            if (calc.isPrime(nome)) {
                System.out.println("It is a prime word.");
            } else {
                System.out.println("It is not a prime word.");
            }
        }

    }
}
