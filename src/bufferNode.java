public class bufferNode {
    //pointers
    private bufferNode freeNext;
    private bufferNode freePrevious;
    private bufferNode hashQueueNext;
    private bufferNode hashQueuePrevious;
    //
    //status bits are to be added soon
    //
    private byte dataBlock;
    public bufferNode(byte dataBlock){
        this.freeNext = null;
        this.freePrevious = null;
        this.hashQueuePrevious = null;
        this.hashQueuePrevious = null;
        this.dataBlock = dataBlock;
    }
    public bufferNode getFreeNext(){
        return this.freeNext;
    }
    public bufferNode getFreePrevious(){
        return this.freePrevious;
    }
    public bufferNode getHashQueueNext(){
        return this.hashQueueNext;
    }
    public bufferNode getHashQueuePrevious(){
        return this.hashQueuePrevious;
    }
    public void setFreeNext(bufferNode reference){
        this.freeNext = reference;
    }
    public void setFreePrevious(bufferNode reference){
        this.freePrevious = reference;
    }
    public void setHashQueueNext(bufferNode reference){
        this.hashQueueNext = reference;
    }
    public void setHashQueuePrevious(bufferNode reference){
        this.hashQueuePrevious = reference;
    }
    public void setDataBlock(byte b){
        this.dataBlock = b;
    }
    public byte getDataBlock(){
        return  this.dataBlock;
    }
}
