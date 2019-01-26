public class bufferCache {
    private queue lists[];
    private int bufferCacheSize;
    public bufferCache() {
        lists = new queue[5];
        bufferCacheSize = 4;
    }
    private int getHashValue(int blockNumber){
        return (blockNumber % bufferCacheSize);
    }
    public void insertInCache(int blockNumber){
        
    }

}
