// 父类：图形
abstract class Shape {
    public abstract void draw();  // 抽象方法，等待子类重写
}

// 子类：圆形
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }

    // 特有的方法，不在父类中
    public void fillColor() {
        System.out.println("填充红色");
    }
}

// 子类：矩形
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}

// 子类：三角形
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个三角形");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // 多态：父类引用指向子类对象
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();

        // 调用draw()方法时，表现出不同的行为（运行时多态）
        s1.draw();  // 输出：画一个圆形
        s2.draw();  // 输出：画一个矩形
        s3.draw();  // 输出：画一个三角形

        // 如果需要调用子类特有的方法，需进行向下转型
        if (s1 instanceof Circle) {
            Circle c = (Circle) s1;
            c.fillColor();  // 输出：填充红色
        }

        // 利用多态扩展：可以直接传入任何Shape子类
        drawShape(new Circle());
        drawShape(new Rectangle());
    }

    // 多态的好处：参数为父类型，可以接收任意子类对象
    public static void drawShape(Shape shape) {
        shape.draw();  // 具体画什么，由传入的对象类型决定
    }
}