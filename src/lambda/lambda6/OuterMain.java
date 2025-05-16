package lambda.lambda6;

public class OuterMain {

    private final String message = "외부 클래스";

    public static void main(String[] args) {
        OuterMain outer = new OuterMain();
        System.out.println("[외부 클래스]: " + outer);
        System.out.println("---------------------------------");
        outer.execute();
    }

    public void execute() {

        Runnable anoymous = new Runnable() {

            private final String message = "익명 클래스";

            @Override
            public void run() {
                System.out.println("[익명 클래스] this: " + this);
                System.out.println("[익명 클래스] this.class: " + this.getClass());
                System.out.println("[익명 클래스] this.meessage: " + this.message);
            }
        };

        anoymous.run();
        System.out.println("---------------------------------");
        Runnable lambda = () -> {
            System.out.println("[람다] this: " + this);
            System.out.println("[람다] this.class: " + this.getClass());
            System.out.println("[람다] this.meessage: " + this.message);
        };
        lambda.run();
    }
}
