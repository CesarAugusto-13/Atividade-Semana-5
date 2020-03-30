import javax.swing.JOptionPane;
public class MediaDeNumerosInteirosPositivos
{
    public static void main (String [] args)
    {
        double x = 0;
        double aux = 0;
        int total = 0;
        
        while(x != -1)
        {
            x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
            if(x>0)
            {
                aux = aux + x;
                total = total + 1;
            }
        }
           
           double media = aux / total;
           
           JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
}