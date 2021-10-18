package LessonTest.StatikBlock;

public class TestClass {

    private String helloWorld;
    public static String evrika = "Это интересно...";

    static {
        System.out.println("Результат выполнения статического блока");
    }

    public TestClass(String privetctvie) {
        this.helloWorld = privetctvie;
    }

    public String getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(String helloWorld) {
        this.helloWorld = helloWorld;
    }
}
