import javax.swing.JOptionPane;
public class QuantosNumerosHaEntre100E200
{
    public static void main(String [] args)
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int n = 0;
        
        while(x != 0)
        {
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            
            if((x > 100)&&(x < 200))
            {
                n++;
            }
        }
        
        JOptionPane.showMessageDialog(null, n + " numeros entre 100 e 200");
    }
}