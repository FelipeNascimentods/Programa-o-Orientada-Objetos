package modelagemDVD;

/**
 *
 * @author felip
 */
public class Teste {
    public static void main(String[] args) {
        DVD novoDVD = new DVD();
        Filme novoFilme = new Filme();
        
        novoDVD.setLigaDVD();
        novoDVD.insereFilme(novoFilme);
        novoDVD.setPlay();
        novoDVD.setAlmentaVolume(1);
        System.out.println("Volume: " + novoDVD.getVolume());
        System.out.println("Play: " + novoDVD.setPlay());

    }
