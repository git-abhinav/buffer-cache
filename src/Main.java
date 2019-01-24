public class Main extends queue{
    public static void main(String args[]){
        queue q = new queue();
        q.enQueue(1);
        q.showQueue();
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

    }
}