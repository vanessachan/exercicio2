package caelum;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vanessa on 29/04/2015.
 */
public class LerArquivo {
    List<String> listaNomes = new ArrayList<String>();

    public LerArquivo() throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileReader("arquivo.txt")).useDelimiter(System.getProperty("line.separator"));
        while (scanner.hasNext()) {
            String nome = scanner.next();
            listaNomes.add(nome);
        }
        scanner.close();
    }

    public List<String> getListaNomes() {
        return listaNomes;
    }


}
