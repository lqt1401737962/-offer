package leetcode.Jonephus;

public class Jonephus {
    public static Node getAlivePeo(Node head,int n){
        if (head == head.next|| n<2 || head==null){
            return head;
        }

        Node last =head ;
        while (last.next !=head){
            last =last.next;
        }
        int count =0;
        while (head != last ){
            if (++count ==n){
                last.next =head.next;
            }
            else{
                head =last.next;
            }
            head =last.next;
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println("getAlivePeo(1,5) = " + getAlivePeo(new Node(55), 5));
    }
}
