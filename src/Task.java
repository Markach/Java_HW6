import java.util.HashMap;
import java.util.Iterator;
public class Task {
    /*Разработать программу, имитирующую поведение коллекции HashSet. 
    В программе содать метод add добавляющий элемент, 
    и метод позволяющий выводить эллементы коллекции в консоль. Формат данных Integer. */
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJECT = new Object();
    public static void main(String[] args) {
        add(1);
        add(5);
        add(7);
        add(2); 
        add(3);
        add(15);
        add(17);
        add(12);
        System.out.println(isEmpty());
        printTerminal();
        System.out.println();
        try {
            System.out.println(printOneElement(15));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // метод вывода всей коллекции в консоль
    private static void printTerminal(){
        Iterator<Integer> iterator = hMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }

    //метод позволяющий выводить 1 эллемент коллекции в консоль 
    private static int printOneElement(int index){
        return (Integer)hMap.keySet().toArray()[index];
    }

    //метод добавляющий элемент
    public static void add(Integer number){
        hMap.put(number, OBJECT);   
    }

    //метод возвращает true, если коллекция пустая
    private static boolean isEmpty(){
        return hMap.isEmpty();
    }
}
