 class singlyLinkList<User_Type>{
    private static class  Node <User_Type>{
        private User_Type Input_Data;
        private Node<User_Type> NextLink;
        public Node(User_Type Data,Node <User_Type> LINk){
            Input_Data=Data;
            NextLink=LINk;
        }
         User_Type getElement(){
                   return Input_Data;
        }
        void setNext(Node<User_Type> settingNext){
            NextLink=settingNext;
        }
    }
    public Node<User_Type> Head=null;
    public  Node<User_Type> Tail=null;
    public int counter=0;
    
    public boolean isEmpty(){
        return counter==0;
    }
    
    public void addFirst(User_Type element){
       Head= new Node<>(element,Head);
       if(isEmpty())
       Tail=Head;
       counter+=1;
    }

    public void addLast(User_Type element){
        Node<User_Type> newest = new Node<>(element,null);
        if(isEmpty()){
            Tail=Head=newest;
        }else
        Tail.setNext(newest);
        Tail=newest;
        counter+=1;
        
     }
    singlyLinkList(){}
    public void getAll(){
        for(Node<User_Type> iterator = Head;iterator!=null;iterator=iterator.NextLink){
            System.out.println(iterator.getElement());
        }
    }



}

public class singlyLinkListMain{
    public static void main(String args[]){
        singlyLinkList<String> List_1 =new singlyLinkList<>();
        List_1.addFirst("First");
        List_1.addLast("Second");
        List_1.addLast("Third");
        List_1.getAll();

        
    }                        

}