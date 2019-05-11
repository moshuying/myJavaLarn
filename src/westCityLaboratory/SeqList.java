package westCityLaboratory;
interface List{
    public void insert(int i,Object obj)throws Exception;
    public Object delete(int i)throws Exception;
    public Object getData(int i)throws Exception;
    public void  print()throws Exception;
    public int size();
    public boolean isEmpty();
}
public class SeqList implements List {
    final  int defaultSize=10;
    int maxSize,size;
    Object[] listArray;
    public SeqList(){
        initiate(defaultSize);
    }
    public SeqList(int size){
        initiate(size);
    }
    private void initiate(int sz){
        maxSize=sz;
        size=0;
        listArray=new Object[sz];
    }
    public void insert(int i,Object obj)throws Exception{
        if(size==maxSize){
            throw new Exception("顺序表已满无法插入");
        }
        if(i<0||i>size){
            throw new Exception("参数错误!");
        }
        for (int j=size;j>i;j--){
            listArray[j]=listArray[j-1];
        }
        listArray[i]=obj;
        size++;
    }
    public Object delete(int i)throws Exception{
        if(size==0){
            throw new Exception("顺序表已空无法删除");
        }
        if(i<0||i>size-1){
            throw new Exception("参数错误");
        }
        Object it=listArray[i];
        for (int j=i;j<size-1;j++){
            listArray[j]=listArray[j+1];
        }
        size--;
        return it;
    }
    public Object getData(int i)throws Exception{
        Object temp=new Object();
        return temp;
    };
    public void  print()throws Exception{

    };
    public int size(){
        return 0;
    };
    public boolean isEmpty(){
        return true;
    };
}
