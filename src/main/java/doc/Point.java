package doc;

class Point  {
    int x;
    boolean y;
    void output(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        Point point =new Point();
        point.output();
    }  }
