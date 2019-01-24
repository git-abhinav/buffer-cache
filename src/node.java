public class node {

    private int blockNumber;
    private node next;
    private node previous;

    public node(){
        next = null;
        previous = null;
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
