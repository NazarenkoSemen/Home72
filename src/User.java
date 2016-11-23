
public class User {
    public static void main(String args[]) {
        Point point=new Point(5);
        Vector vector=new Vector(0,10);
        System.out.println("Point="+point.getPoint());
        System.out.println("Vector b="+vector.getVector_b());
        System.out.println("Vector c="+vector.getVector_c());
        if(point.getPoint()>=vector.getVector_b() && point.getPoint()<=vector.getVector_c()){
            System.out.println("Точка входит в отрезок");
        }else{
            System.out.println("Точка не входит в отрезок");
        }
    }
}
