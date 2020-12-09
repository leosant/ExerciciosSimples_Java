
package estudos;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public void ResolucaoTela() {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        System.out.println("A resolução da sua máquina é: " +d.width + " x " +d.height);
    }
}

