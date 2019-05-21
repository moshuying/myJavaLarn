package westCityLaboratory;
public interface Stack{
    public void push(Object obj)throws Exception;
    public Object pop() throws Exception;
    public Object getPop() throws Exception;
    public boolean notEmpty();
}
class SeqStack implements Stack{
    final int defaultSize=10;//默认长度
    int top;//栈顶指示
    Object[] stack;//数组对象
    int maxStackSize;
    //默认构造函数
    public SeqStack(){
        initiate(defaultSize);
    }
    public SeqStack(int sz){
        initiate(sz);
    }
    //初始化方法
    private void initiate(int sz){
        maxStackSize=sz;
        top=0;
        stack=new Object[sz];
    }
    public void push(Object obj)throws Exception{
        if(top==maxStackSize){
            throw new Exception("堆栈已满");
        }
        stack[top]=obj;
        top++;
    }
    public Object pop() throws Exception{
        if (top==0){
            throw new Exception("堆栈已空");
        }
        top--;
        return stack[top];
    }
    public Object getPop() throws Exception{
        if (top==0){
            throw new Exception("堆栈已空");
        }
        return stack[top-1];
    }
    public boolean notEmpty(){
        return (top>0);//top大于0代表堆栈内还有元素
    }

}