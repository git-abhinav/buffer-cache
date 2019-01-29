public class node {

    private int blockNumber;
    private node next;
    private node previous;

    private boolean lock;
    //
    //  lock indicated that the node is
    //  either in free list or buffer cache.
    //

    public node(){
        next = null;
        previous = null;

        lock = false;
        // status 'true' means that the node
        // is free list.
    }

    public int getNodeValue(){
        return this.blockNumber;
    }
    public node(int blockNumber){
        this.blockNumber = blockNumber;
        next = this;
        previous = this;
    }

    public void storeNext(node nodeReference){
        this.next = nodeReference;
    }

    public void storePrevious(node nodeReference){
        this.previous = nodeReference;
    }

    public node getNext(){
        return this.next;
    }

    public node getPrevious(){
        return this.previous;
    }
}
