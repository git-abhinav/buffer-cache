public class queue extends node{
    node head;
    node tail;
    public queue(){
        head = null;
        tail = null;
    }
    public boolean isQueueEmpty(){
        if(head == null && tail == null){
            return true;
        }
        else{
            return false;
        }
    }
    public void enQueue(int blockNumber){
        node newNode = new node(blockNumber);
        if(isQueueEmpty() == true){
            newNode.storeNext(newNode);
            newNode.storePrevious(newNode);
            head = newNode;
            tail = newNode;
        }
        else{
            tail.storeNext(newNode);
            newNode.storePrevious(tail);
            tail = newNode;
            tail.storeNext(head);
            head.storePrevious(tail);
        }
    }
    public int deQueue(){
        try{
            if(head == null && tail ==null)
                throw new Exception();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred, Under-flow");
            System.exit(1);
        }
        int blockNumber = head.getNodeValue();
        head.getPrevious().storeNext(head.getNext().getPrevious());
        head.getNext().storePrevious(head.getPrevious().getNext());
        head = head.getNext();
        if(head.getNext() == head) {
            head.storeNext(null);
            head.storePrevious(null);
            tail.storeNext(null);
            tail.storePrevious(null);
            head = tail = null;
        }
        return blockNumber;
    }
}
