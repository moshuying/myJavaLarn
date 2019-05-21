package westCityLaboratory;

public class TwoFor0521 {
    public static void main(String[] args) {
        SeqStack myStack=new SeqStack();
        int test[]={1,2,6,4,5};
        int n=5;
        try{
            for(int i=0;i<n;i++){
                myStack.push(test[i]);
            }
            while (myStack.notEmpty()){
                System.out.print(myStack.pop()+" ");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
