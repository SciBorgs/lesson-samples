class Point {
    public double x;
    public double y;
    public Point(double _x, double _y) {
        this.x = _x;
        this.y = _y;
    }

    public static void main(String[] args) {
        Point first = new Point(0.0, 0.0);
        Point second = new Point(2.0, 2.0);
        System.out.println(first.distanceTo(second));
    }

    public double distanceTo(Point p) {
        return Math.sqrt( Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2) );
    }
}

