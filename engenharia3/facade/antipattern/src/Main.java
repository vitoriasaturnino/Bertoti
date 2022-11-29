import fabrica.Acessorios;
import pc.CPU ;
import pc.HD ;
import pc.Memoria ;
import pc.SO ;

public class Main {
    public static void main(String[] args) {
        Memoria memoria = new Memoria();
        memoria.adicionarMemoria();

        HD hd = new HD();
        hd.adicionarHD();

        CPU cpu = new CPU();
        cpu.adicionarProcessador();

        Acessorios acessorios = new Acessorios();
        acessorios.adicionarMouse();
        acessorios.adicionarTeclado();
        acessorios.adicionarMonitor();

        SO so =new SO();
        so.instalarSO();
    }
}