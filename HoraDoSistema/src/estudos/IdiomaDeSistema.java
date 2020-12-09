
package estudos;

import java.util.Locale;

public class IdiomaDeSistema {
    
    public void IdiomaDeSistema() {
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage()); // imprime "Português"
        System.out.println (loc.getLanguage()); // imprime "pt"
    }
}
