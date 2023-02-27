package singleton;

public class Application {
    private static Application application;

    boolean thisOn = false;

    private Application() {}

    public static Application getInstance() {
        if(application == null) {
            application = new Application();
        }
        return application;
    }

    public void lightApp(){
        if(!thisOn) {
            System.out.println("Encendida");
            thisOn = true;
        }else {
            System.out.println("Ya esta ensendida");
        }
    }

}
