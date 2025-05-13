package lambda.lambda4;

public class RunaableMain {

    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("RunaableMain.run");
            }
        };

        runnable1.run();

        Runnable runnable2 = () -> System.out.println("RunaableMain.run");

        runnable2.run();


    }
}
