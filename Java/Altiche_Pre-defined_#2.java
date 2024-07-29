import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Activity {
    public static void main(String[] args) {

        String temp, output = "";
        int base,i;
        int num[] = new int[11];
        temp = JOptionPane.showInputDialog("Enter base number");
        base = Integer.parseInt(temp);
        
        output += "Table from base "+ base + " from 0-10\n";
        output += "Power \t Result\n";
        
        for (i = 0; i < 11; i++){
            int res = (int)Math.pow(base, i);
            output += i + "\t" + res + "\n" ;
        }
        JTextArea outArea = new JTextArea (12,12);
        outArea.setText(output);

        JOptionPane.showMessageDialog(null,outArea);
         
    }
   } 