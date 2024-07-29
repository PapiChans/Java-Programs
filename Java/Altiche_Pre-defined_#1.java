import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Activity {
    
    
    public static void main(String[] args) {
    
    int num[] = new int[5],i;
    String str,output = "";
    output += "The Values are: \n";
    
    for (i = 0; i < 5; i++)
    {
        str = JOptionPane.showInputDialog("Enter 5 numbers");
        num[i] = Integer.parseInt(str);
        int min = getmin(num);
        int max = getmax(num);
        output += num[i] + " ";
    }
     
    int min = getmin(num);
    output += "\nThe Minimum value is: " + min;
    int max = getmax(num);
    output += "\nThe Maximum value is: " + max;
    
     JTextArea outArea = new JTextArea (7,7);
     outArea.setText(output);

    JOptionPane.showMessageDialog(null,outArea);
    }   
    
    public static int getmin (int[] nummin){
        int min1 = nummin[0];
        for (int i = 0; i < 5; i++)
    {
        if (nummin[i] < min1){
            min1 = nummin[i];
        }
    }
        return min1;
    }   
    
    public static int getmax (int[] nummax){
           int max1 = nummax[0];
        for (int i = 0; i < 5; i++)
    {
        if (nummax[i] > max1){
            max1 = nummax[i];
        }
    }
        return max1;
    } 
}