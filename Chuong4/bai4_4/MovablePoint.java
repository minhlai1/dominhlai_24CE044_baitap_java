package bai4_4;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    
    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

   
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

  
    public float getXSpeed() {
        return xSpeed;
    }

 
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

   
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

  
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

   
    public MovablePoint move() {
        setXY(getX() + xSpeed, getY() + ySpeed);
        return this;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }
}


