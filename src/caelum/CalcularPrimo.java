package caelum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vanessa on 29/04/2015.
 */
public class CalcularPrimo {
    List<String> listaAlfabeto = new ArrayList<String>();

    public CalcularPrimo() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            listaAlfabeto.add(String.valueOf(ch));
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            listaAlfabeto.add(String.valueOf(ch));
        }
    }

    public boolean isPrime(String nome) {
        int valor = somaValorNome(nome);
        int div = 0;
        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0)
                div++;
        }
        if (div == 2)
            return true;
        return false;
    }

    public int somaValorNome(String nome) {
        int total = 0;
        int k;
        char[] letraC = nome.toCharArray();
        for (int i = 0; i < nome.length(); i++) {
            String letraS[] = new String[nome.length()];
            letraS[i] = Character.toString(letraC[i]);
            for (k = 0; k < listaAlfabeto.size(); k++) {
                if (letraS[i].equals(listaAlfabeto.get(k))) {
                    total += (k + 1);
                }
            }

        }

        return total;
    }


}
