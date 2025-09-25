public class DebugBox {
    private int width;
    private int length;
    private int height;

    public DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

    // Fixed constructor to correctly assign width, length, and height
    public DebugBox(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void showData() {
        System.out.println("Width: " + width + " Length: " +
            length + " Height: " + height);
    }

    // Added return type 'double' for getVolume method
    public double getVolume() {
        double vol = length * width * height;
        return vol;
    }

    // Main method to test the class (commented out)
    /*
    public static void main(String[] args) {
        DebugBox box = new DebugBox(5, 10, 3);
        box.showData();
        System.out.println("Volume: " + box.getVolume());
    }
    */
}
