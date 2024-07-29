import javax.swing.JOptionPane;

public class Activity {
    public static void main(String[] args) {
        
    int count=0;
    String sent = JOptionPane.showInputDialog("Enter a sentence");
    String word = ("java");
    sent = sent.toLowerCase();
    String x[] = sent.split(" ");
    
    for (int i = 0; i < x.length; i ++){
        if (word.equals(x[i])){
            count++;
        }
    }
    
    JOptionPane.showMessageDialog(null,"There are " +count + " Java word/s in a sentence.");
    }
} 