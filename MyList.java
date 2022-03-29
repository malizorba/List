
import java.util.Arrays;

public class MyList<T> {
    int capacity;
    int a=10;
    int index=0;

    private T [] arr;


    public MyList(){

        this.arr=(T[]) new Object[10];
    }
    public MyList(int a){
        this.arr = (T[]) new Object[a];
    }
    public int size(){
        int count =0;
        for (int i=0;i<this.arr.length;i++){

            if (arr[i]!=null){
                count++;
            }
        }
        return count;
    }
    public int getCapacity(){
        return this.arr.length;
    }
    public void add(T data){
        if (this.index==this.arr.length){
            arr=Arrays.copyOf(this.arr,this.arr.length*2);
        }
        else {
            this.arr[this.index]=data;
            index++;
        }

    }
    public T get(int index) {
        if (index>arr.length){
            System.out.println("index that you entered might have been deleted");
        }
        return this.arr[index];

    }
    public void remove(int index){
        if (index>this.index){
            System.out.println("invalid value");
        }
        else {
                for (int i= index;i<=this.index-1;i++)
                this.arr[i]=this.arr[i+1];
                this.index--;
        }


        }

    public void set(int index,T data){
        if (index+1>arr.length){
            System.out.println("Your index is invalid");
        }
        else {
            this.arr[index]=data;
        }
    }
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        if(arr.length > 0){
            for(T item : this.arr) {
                if( item != null){
                    result.append(item).append(",");}
            }
        }
        if(result.length() > 1){
            result.deleteCharAt(result.length()-1).append("]");
        }
        else{
            result.append("]");
        }
        return result.toString();
    }
    public int indexof(T data){
        for (int i =0 ; i<arr.length;i++){
            if (arr[i]==data){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexof(T data){
        int value=-1;
        for (int i =0;i< arr.length;i++){
            if (arr[i]==data){
                value=i;
            }
        }
        return value;
    }
    public boolean isEmpty(){
        return arr.length==0;
    }
    public T [] toArray(){
        return Arrays.copyOfRange(this.arr,0,arr.length);
    }
    public void clear(){
        this.arr= (T[])new Object[10];
    }
   public MyList<T> sublist(int start,int finish){
        MyList<T> RangeList=new MyList<>(finish-start+1);
        for (int i=start;i<=finish;i++){
            RangeList.add(arr[i]);
       }
        return RangeList;
   }
   public boolean contain(T data){
        for (int i =0;i< arr.length;i++){
            if (arr[i]==data){
                return true;
            }
        }
        return false;
   }


    }


