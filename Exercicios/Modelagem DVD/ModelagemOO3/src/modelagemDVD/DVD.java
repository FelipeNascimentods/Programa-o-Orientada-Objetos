package modelagemDVD;

/**
 *
 * @author felip
 */
public class DVD {
    private int volume;
    private boolean ligado;
    private boolean play;
    Filme filme;
    
    public DVD(){
        this.volume = 2;
        this.ligado = false;
        this.play = false;
    }
    public boolean isLigado(){
        return this.ligado;
    }
    public void setLigaDVD(){
        if(ligado == false){
            this.ligado = true;
        }
    }
    public void setDesligaDVD(){
        if(ligado){
            this.ligado = false;
        }
    }
    public String setPlay(){
        if(ligado && this.filme!=null){
            this.play = true;
        }
        return this.filme.getNome()+" - "+this.filme.getCategoria();
    }
    public void setStop(){
        if(ligado && this.play){
            this.play = false;
        }
    }
    public int getVolume(){
        return this.volume;
    }
    public int setAlmentaVolume(int volume){
        if(ligado && this.volume<=5){
            this.volume += volume;
        }
        return this.volume;
    }
    public int setDiminuiVolume(int volume){
        if(ligado && this.volume >=1){
            this.volume -= volume;
        }
        return this.volume;
    }
    public void insereFilme(Filme filme){
        if(ligado){
            this.filme = filme;
        }
    }
}
