public class MainOOPShape {
    public static void main(String[] args) {
        OOPShape_Genio circle = new Circle(5);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        OOPShape_Genio rectangle = new Rectangle(4, 6);
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        OOPShape_Genio triangle = new Triangle(3, 4, 5);
        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
