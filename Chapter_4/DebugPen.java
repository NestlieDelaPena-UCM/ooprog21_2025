public class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        color = "black";
        point = "fine";
    }

    public DebugPen(String color, String point) {
        this.color = color;   
        this.point = point;
    }

    
    public String getColor() {
        return color;
    }

    
    public String getPoint() {
        return point;
    }

    
    public void displayInfo() {
        System.out.println("Pen Color: " + color);
        System.out.println("Pen Point: " + point);
    }

    
    public static void main(String[] args) {
        DebugPen defaultPen = new DebugPen(); 
        DebugPen customPen = new DebugPen("blue", "medium"); 

        System.out.println("Default Pen:");
        defaultPen.displayInfo();

        System.out.println("\nCustom Pen:");
        customPen.displayInfo();
    }
}
