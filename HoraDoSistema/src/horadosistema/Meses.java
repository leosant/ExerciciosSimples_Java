
package horadosistema;

public class Meses {
    
    int mes;

    public Meses() {
    
    }
            
    public String Meses(int mes) {
        String resultadoMes = null;
        this.mes = mes;
        switch(mes){
            case 1:
                resultadoMes =  "janeiro";
                break;
            case 2:
                resultadoMes = "Fevereiro";
            case 3:
                resultadoMes = "Março"; 
                break;
            case 4:
                resultadoMes = "Abril";
            case 5:
                resultadoMes = "Maio";
                break;
            case 6:
                resultadoMes = "Junho";
                break;
            case 7:
                resultadoMes = "Julho";
                break;
            case 8:
                resultadoMes = "Agosto";
                break;
            case 9:
                resultadoMes = "Setembro";
                break;
            case 10:
                resultadoMes = "Outubro";
                break;
            case 11:
                resultadoMes = "Novembro";
                break;
             case 12:
                resultadoMes = "Dezembro";
                break;               
        }
     return resultadoMes;   
                
    }
    public String teste(){
        return "outra coisa";
    }
    public int cem() {
        return 100;
}
}
