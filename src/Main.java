public class Main extends queue{
    public static void main(String args[]){
        queue q = new queue();
//        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

    }
}