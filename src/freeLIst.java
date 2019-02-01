class freeList{
    private list freeListNodes;
    private int freeListSize;
    public  freeList(int size){
        freeListSize = size;
        freeListNodes = new list();
    }
    public void initializeFreeList(){
        for(int i=0;i<freeListSize;++i)
            freeListNodes.insertInFreeList((byte)(i+1));
    }
//    public static void main(String args[]){
//        System.out.println("Hello");
//        initializeFreeList();
//    }
}
