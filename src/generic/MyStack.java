package generic;
import java.util.HashMap;
import java.util.LinkedList;
import charactor.Hero;
import property.Item;
public class MyStack<T> {
    LinkedList<T> values = new LinkedList<T>();
    public void push(T t){
      values.addLast(t);
    }
    public T pull(){
        return values.removeLast();
    }
    public T peek(){
        return values.getLast();
    }
    public static void main(String[] args){
        MyStack<Hero> heroStack = new MyStack<>();
        heroStack.push(new Hero());
       // heroStack.push(new Item());
        
    }
}
