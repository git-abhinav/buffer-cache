public class list {
    public bufferNode head;
    public bufferNode tail;
    public list(){
        head = null;
        tail = null;
    }
    public void insertInFreeList(byte data){
        // IN LRU manner
        bufferNode newNode = new bufferNode(data);
        if(head == null && tail == null) {
            tail = head = newNode;
            head.setFreeNext(head);
            head.setFreePrevious(head);
        }
        else{
            tail.setFreeNext(newNode);
            newNode.setFreePrevious(tail);
            newNode.setFreeNext(head);
            head.setFreePrevious(newNode);
            tail = newNode;
        }
    }
    public void printFreeList(){
        bufferNode b = head;
        while(b.getFreeNext()!=head){
            System.out.println(b.getDataBlock());
            b = b.getFreeNext();
        }
    }
    // same for hashqueue
    void insertInHashQueue(byte data){}

}
