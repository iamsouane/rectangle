package rectangle;

public class Rectangle {
    public static void main(String[] args) {
        SurfPer rectangle = new  SurfPer(4, 5);

        System.out.println("surface rectangle(" + rectangle.getLongueur() + ", " + rectangle.getLargeur() + ") = " + rectangle.surface());

        System.out.println("perimetre rectangle(" + rectangle.getLongueur() + ", " + rectangle.getLargeur() + ") = " + rectangle.perimetre());
    }
}
