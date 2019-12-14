import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Listadozapisupliku {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("F:\\listalinizapisanych.txt");
        List<String> listaSlow = new ArrayList<>();
        listaSlow.add("123");
        listaSlow.add("444");
        listaSlow.add("123");
        listaSlow.add("444");
        listaSlow.add("123");
        listaSlow.add("444");
        listaSlow.add("123");
        listaSlow.add("444");

        for (String a : listaSlow) {
            zapis.append(a + "\n");
        }
        zapis.close();




    }
}
