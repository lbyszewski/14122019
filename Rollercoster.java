import java.util.Scanner;

public class Rollercoster {

    public static int pobierzWzrost(){
        System.out.println("podaj wzrost ");
        Scanner skaner = new Scanner(System.in);

        return  skaner.nextInt();
    }

    public static boolean czyMozna(int wzrost) throws Exception{
        if (wzrost>160){
            return true;

        }
        else {
            throw  new Exception("jesteś za niski");
        }

    }

    public static void main(String[] args) {
        try {
            System.out.println(czyMozna(pobierzWzrost()));
        } catch (Exception e){
            e.getStackTrace();
            System.out.println("sorki ale nie pojedziesz!");
        }
    }
}
