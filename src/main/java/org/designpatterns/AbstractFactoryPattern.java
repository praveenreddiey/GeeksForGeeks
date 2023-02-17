package org.designpatterns;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        ShapeFactoryInstance sfi = new ShapeFactoryInstance();
        ShapeFactory shapeFactoryInstance = sfi.getShapeFactoryInstance(false);
        Shape square = shapeFactoryInstance.shapeFactory("rectangle");
        square.printShape();
    }
}
interface Shape{
    void printShape();
}
class Rectangle implements Shape{
    @Override
    public void printShape() {
        System.out.println("rectangle");
    }
}
class RoundedRectangle implements Shape{
    @Override
    public void printShape() {
        System.out.println("rounded rectangle");
    }
}
class RoundedSquare implements Shape{
    @Override
    public void printShape() {
        System.out.println("rounded square");
    }
}
class Square implements Shape{
    @Override
    public void printShape() {
        System.out.println("square");
    }
}
abstract class ShapeFactory{
    public abstract Shape shapeFactory(String shape);
}
class NormalShape extends ShapeFactory{
    @Override
    public Shape shapeFactory(String shape) {
        if(shape == null || shape.isEmpty())
            return null;
        switch (shape){
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                throw new RuntimeException("no such found");
        }
    }
}
class RoundedShape extends ShapeFactory{
    @Override
    public Shape shapeFactory(String shape) {
        if(shape == null || shape.isEmpty())
            return null;
        switch (shape){
            case "square":
                return new RoundedSquare();
            case "rectangle":
                return new RoundedRectangle();
            default:
                throw new RuntimeException("no such found");
        }
    }
}
class ShapeFactoryInstance {
    public ShapeFactory getShapeFactoryInstance(boolean round){
        if(round)
            return new RoundedShape();
        else
            return new NormalShape();
    }
}