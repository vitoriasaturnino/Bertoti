package facade;
import fabrica.Acessorios;
import pc.CPU ;
import pc.HD ;
import pc.Memoria ;
import pc.SO ;

public class ComputadorFacade {
    private Memoria memoria;
    private HD hd;
    private CPU cpu;
    private SO so;
    private Acessorios acessorios;

    public ComputadorFacade() {
        this.memoria = new Memoria();
        this.hd = new HD();
        this.cpu = new CPU();
        this.so = new SO();
        this.acessorios = new Acessorios();
    }

    public void montarComputador() {
        System.out.println("Montando uma nova máquina... \n");
        memoria.adicionarMemoria();
        hd.adicionarHD();
        cpu.adicionarProcessador();
        so.instalarSO();
        acessorios.adicionarTeclado();
        acessorios.adicionarMonitor();
        acessorios.adicionarMouse();
        System.out.println("\n... Tudo pronto!");
    }

}
