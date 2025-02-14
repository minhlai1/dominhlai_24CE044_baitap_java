public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    // Constructor mặc định
    public Rectangle() {
    }

    // Constructor với tham số
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getter cho length
    public float getLength() {
        return length;
    }

    // Setter cho length
    public void setLength(float length) {
        this.length = length;
    }

    // Getter cho width
    public float getWidth() {
        return width;
    }

    // Setter cho width
    public void setWidth(float width) {
        this.width = width;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return length * width;
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}
