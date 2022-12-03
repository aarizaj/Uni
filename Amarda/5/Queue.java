import java.util.ArrayList;

public class Queue {
    public int i=0;
    private String[] elements;
    private int size;

    public int getSize(){
        return size;
    }


    public Queue(){
        size=8;
        elements=new String[size];
    }

    public void enqueue(String v){

        if(i== elements.length) {
            size = (size * 2);
            String[] temp = new String[size];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[i]=v;
        i++;
    }
    public String dequeue(){
        String str = elements[0];
        for(int j=0;j<size-1;j++){
            elements[j]=elements[j+1];
        }
        i--;
        return str;
    }

    public boolean empty(){
        if(i==0)
            return true;
        else
            return false;
    }
}
