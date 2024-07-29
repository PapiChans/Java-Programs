public class Circle {
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
}