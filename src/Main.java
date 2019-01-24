public class Main extends queue{
    public static void main(String args[]){
        queue q = new queue();
        q.enQueue(1);
        q.showQueue();

//        q.enQueue(2);
//        q.showQueue();


//        q.enQueue(3);
//        q.showQueue();



//        q.enQueue(4);
//        System.out.println("----------");
        System.out.println(q.deQueue());
//        q.showQueue();
        System.out.println(q.deQueue());
//        q.showQueue();
        System.out.println(q.deQueue());

        System.out.println(q.deQueue());

    }
}