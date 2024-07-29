import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestCircle {
    double radius;
    double diameter;
    double area;
    
    public void setRadius(double setrad){
        radius = setrad;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void computeDiameter(){
        diameter = radius * 2;
    }
    public void Area (double setarea){
        area = 3.14 * radius * radius;
    }
    
    public void display(){
        String output = "";
        output += "Radius: " + radius + "\n";
        output += "Diameter: " + diameter + "\n";
        output += "Area: " + area + "\n";
        JTextArea outarea = new JTextArea (3,3);
        outarea.setText(output);
        JOptionPane.showMessageDialog(null,outarea);
    }
    public static void main (String[] args){
        TestCircle rad = new TestCircle();
        rad.setRadius(20.5);
        rad.computeDiameter();
        rad.Area(0);
        
        rad.display();
    }
}