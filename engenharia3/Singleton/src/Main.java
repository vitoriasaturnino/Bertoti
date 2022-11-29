public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        // o mesmo endereço de memória será exibido
        System.out.println(singleton);
        System.out.println(Singleton.getInstance());
    }
}