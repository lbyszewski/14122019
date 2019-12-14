import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odczytzpliku {
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("F:\\14122019\\plik.txt");
        Scanner wejscie = new Scanner(plik);

        String linia = wejscie.nextLine();
        List<String> lista = new ArrayList<String>();
        while (wejscie.hasNextLine()){
            lista.add(wejscie.nextLine());
        }
        System.out.println(lista);








    }
}
