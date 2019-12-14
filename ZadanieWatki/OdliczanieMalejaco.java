package ZadanieWatki;

public class OdliczanieMalejaco {

    public static void main(String[] args) {
        Runnable uruchmianalna = new Runnable() {
            @Override
            public void run() {

                try {
                    for (int i = 0; i < 100; i++) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }


        };
        Thread watek1 = new Thread(uruchmianalna);
        watek1.start();
    }
}