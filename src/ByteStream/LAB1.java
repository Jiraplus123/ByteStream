package ByteStream;

public class LAB1 {
    public static void main(String[] args) {
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        redCircle.draw();
        redRectangle.draw();

        Circle circle1 = new Circle();
        RedShapeDecorator circleDecorator = new RedShapeDecorator(circle1);
        circleDecorator.draw();

        Rectangle rectangle1 = new Rectangle();
        RedShapeDecorator redRectangle1 = new RedShapeDecorator(rectangle1);
        redRectangle1.draw();
    }
}
