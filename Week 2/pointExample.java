class pointExample {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        Point q = new Point(1, 1);
        System.out.println(p.distanceTo(q));
    }
}
class Point {
    public int x;
    public int y;
    
    Point(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }

    public double distanceTo(Point p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }
}