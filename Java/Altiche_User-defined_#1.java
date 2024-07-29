import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Commission{

double sales, commrate;
int commirate;


public static double computeCommission(double sales, double rate)
{

    double result = sales * rate;
    return result;
}

public static double computeCommission(double sales, int commirate)
{

    double num = commirate/100.0;
    double result = num * sales;
    return result;
}
public static void main(String[] args)
{
    String output = "";
    int cmsn = (int) (computeCommission(500,500));
    
    output += "Commision: " + cmsn;
    JTextArea outarea = new JTextArea (1,1);
    outarea.setText(output);
    JOptionPane.showMessageDialog(null,outarea);
}

}