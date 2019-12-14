import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zapisodczytplkiu {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("C:\\Users\\Lukasz\\Desktop\\plik.txt");
        pw.println("moj wlasny tekst do pliku");
        pw.close();
    }
}
