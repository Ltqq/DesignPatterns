package com.just;

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}

class ShapeFactory{
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
        }
        return null;
    }
}

interface Shape{
    void draw();
}
class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw method()");
    }
}
class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw method()");
    }
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw method()");
    }
}