public class Main{
    public static void main(String[]args){
        Queue <Integer> q=new LinkedList<>();
        for(int i=0;i<5;i++){
            q.add(i);
        }
       System.out.println("returns head element"+q.element());
       System.out.println("returns remove element"+q.remove());
       System.out.println("returns size element"+q.size());
        System.out.println("returns remove element"+q.peek());
    }
}

