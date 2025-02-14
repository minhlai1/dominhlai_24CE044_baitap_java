public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    // Constructor
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // Getter cho x
    public float getX() {
        return x;
    }

    // Setter cho x
    public void setX(float x) {
        this.x = x;
    }

    // Getter cho y
    public float getY() {
        return y;
    }

    // Setter cho y
    public void setY(float y) {
        this.y = y;
    }

    // Getter cho radius
    public int getRadius() {
        return radius;
    }

    // Setter cho radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getter cho xDelta
    public float getXDelta() {
        return xDelta;
    }

    // Setter cho xDelta
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    // Getter cho yDelta
    public float getYDelta() {
        return yDelta;
    }

    // Setter cho yDelta
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // Phương thức move
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Phương thức reflectHorizontal
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // Phương thức reflectVertical
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "), speed=(" + xDelta + "," + yDelta + ")]";
    }
}
