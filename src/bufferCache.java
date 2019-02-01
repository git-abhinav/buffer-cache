public class bufferCache {

    private hashTable hashTableNodes;
    private int bufferCacheSize;
    private freeList freeListNoes;

    public bufferCache() {
        lists = new queue[5];
        bufferCacheSize = 4;
        // do something with free buffers initially.
    }

    public void initializeFreeList(){
        
    }




    private int getHashValue(int blockNumber){
        return (blockNumber % bufferCacheSize);
    }

    public void insertInCache(int blockNumber, char data){
        // which queue
        lists[getHashValue(blockNumber)].enQueue(data);
    }

}
