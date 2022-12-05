public class Singleton {
    private static Singleton uniqueInstance;

    // método contrutor para evitar que novas instancias sejam criadas
    private Singleton() {

    }

    // método sincroniado para evitar que mais de uma thread possa acessa-lo ao mesmo tempo
    public static synchronized Singleton getInstance() {
        // se a instancia ainda não tiver sido criada ele cria a instancia
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        //se já tiver sido criado ele retorna a instancia
        return uniqueInstance;
    }


}
