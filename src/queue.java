public class queue extends node{

    node head;
    node tail;

    public queue(){
        head = tail = null;
    }

    public boolean isQueueEmpty(){
        if(head == null && tail == null)
            return true;
        else
            return false;
    }


    public void enQueue(int blockNumber){
        node newNode = new node(blockNumber);
        if(isQueueEmpty() == true){
            head = tail = newNode;
            head.storeNext(head);
            head.storePrevious(head);
        }
        else
        {
            tail.storeNext(newNode);
            newNode.storePrevious(tail);
            newNode.storeNext(head);
            head.storePrevious(newNode);
            tail = newNode;
        }
    }

    public void showQueue(){
        if(isQueueEmpty() == true) {
            System.out.println("Queue Empty");
        }
        else{
            node tempNode = head;
            do{
                System.out.print(tempNode.getNodeValue());
                tempNode = tempNode.getNext();
            }while(tempNode!=head);
        }
        System.out.println("");
    }

    private int countElementInQueue(){
        int count = 0;
        if(isQueueEmpty()==false){
            node tempNode = head;
            do{
                tempNode = tempNode.getNext();
                count+=1;
            }while(tempNode!=head);
        }
        return count;
    }

    public int deQueue(){
        int value=-1;
        if(isQueueEmpty()==true){
            try{
                throw new Exception("");
            }
            catch (Exception e){
                System.out.println("Under-flow");
                System.exit(1);
            }
        }
        else if (countElementInQueue() == 1){
            value = head.getNodeValue();
            head = tail = null;
        }
        else{
            value = head.getNodeValue();
            tail.storeNext(head.getNext());
            head.getNext().storePrevious(tail);
            head = head.getNext();
        }
        return value;
    }
}

