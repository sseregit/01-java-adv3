package lambda.lambda1;

public class SamMain {

    public static void main(String[] args) {
        SamInterface samInterface = () -> {
            System.out.println("Sam");
        };
        samInterface.run();

        /*NotSamInterface notSamInterface = () -> {
            System.out.println("Not Sam");
        }
        notSamInterface.run();
        notSamInterface.go();*/
    }
}
