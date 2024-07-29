import javax.swing.JOptionPane;

public class Activity {
    public static void main(String[] args) {
        
    int index=0, wordlen=0,nofchar=0;
    String sentence ="", word="",sent="";
    sentence = JOptionPane.showInputDialog("Enter a sentence");
    nofchar = sentence.length();
    
    while (index < nofchar)
    { while (index < nofchar && sentence.charAt(index) == ' ')
    { index ++;
    word="";
    }
    
    while (index < nofchar && sentence.charAt(index) != ' ')
    { word+=sentence.charAt(index);
    index ++;
    }
    
    wordlen = word.length();
    sent+= word.substring(0,wordlen / 2) + word.charAt(wordlen-1) + word.substring(wordlen / 2,wordlen-1) + "AVA" +" ";
    }
    
    JOptionPane.showMessageDialog(null, sent);

    }
   } 