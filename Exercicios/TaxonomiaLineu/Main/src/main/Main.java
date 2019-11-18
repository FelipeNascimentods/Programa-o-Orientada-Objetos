package main;
import Classes.Animalia;
import Classes.Arthropoda;
import Classes.Canidae;
import Classes.Canis;
import Classes.CanisFamiliaris;
import Classes.Carnivora;
import Classes.Chordata;
import Classes.Díptera;
import Classes.Hominidae;
import Classes.Homo;
import Classes.HomoSapiens;
import Classes.Insecta;
import Classes.Mammalia;
import Classes.Musca;
import Classes.MuscaDomestica;
import Classes.Muscidae;
import Classes.Primata;

public class Main {

    public static void main(String[] args) {
        HomoSapiens h = new HomoSapiens();
        
        System.out.println(h.obterDescricao());
    }
    
}
