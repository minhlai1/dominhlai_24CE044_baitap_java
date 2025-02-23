package bai2_6;
public class MyPoint {
    
    private int x;
    private int y;
    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int[] getXY(){
        int[] a = new int[2];
        a[0]=x;
        a[1]=y;
        return a;
    }
    public void setXY(int x,int y){
        int[] a = new int[2];
        a[0]=x;
        a[1]=y;
    }
    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
    public double distance(int x,int y){
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
    }
    public double distance(MyPoint another){
        return Math.sqrt(Math.pow((another.x-x),2)+Math.pow((another.y-y),2));
    }
    public double distance(){
        return Math.sqrt(Math.pow((-x),2)+Math.pow((-y),2));
    }

}


