package horadosistema;

import estudos.IdiomaDeSistema;
import estudos.ResolucaoTela;
import java.util.Date;

public class HoraDoSistema {

    public static void main(String[] args) {
        Date data = new Date();
        int c = data.getMonth()+1;
        Meses m = new Meses();
        ResolucaoTela tela = new ResolucaoTela();
        IdiomaDeSistema id = new IdiomaDeSistema();
        //Testando classes
        System.out.println("Hora do sistema é");
        System.out.println(data.toString());
        System.out.println("Mes do sistema é "+m.Meses(c));
        System.out.println("\nTestando idioma");
        id.IdiomaDeSistema();
        System.out.println("\nTestando Tela: ");
        tela.ResolucaoTela();

    }
    
    
}
