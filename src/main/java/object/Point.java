package object;

//import java.util.Objects;

/**
 * 使用当前类测试经常会被子类重写的Object中定义的方法
 * 了解这些方法重写的意义
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ')';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(x, y);
//    }
}







