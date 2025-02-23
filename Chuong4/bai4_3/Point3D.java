package bai4_3;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    
    public Point3D() {
        super();
        this.z = 0.0f;
    }

    
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

   
    public float getZ() {
        return z;
    }

    
    public void setZ(float z) {
        this.z = z;
    }

    
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    
    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    
    
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}