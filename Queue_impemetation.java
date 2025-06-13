import java.util.*;
public class Queue_impemetation {
    static int maxsize=100;
    static int queue[]=new int[maxsize];
    static int front=-1,rear=-1;
     static Scanner sc=new Scanner(System.in);

    public static void insert(){
        int element;
        if(rear==maxsize-1){
            System.out.println("queue is full");
        }
        else {
            if(front==-1){
                front=0;
            }
            System.out.println("enter the element");
            element=sc.nextInt();
            rear++;
            queue[rear]=element;
        }
    }
    public static void delete(){
        if(rear==front){

            System.out.println("queue is empty");
        }else{

            System.out.println(queue[front]);
            front++;

        }

    }
    public static void display(){
        if(front==rear){
            System.out.println("queue is empty");
        }
        else{
            System.out.println("queue of element:");
            for(int i=front;i<=rear;i++){
                System.out.println(queue[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n1.Insert\n2.delete\n3.display\n4.exit");
            System.out.println("enter your choice");
             choice =sc.nextInt();
            switch (choice){
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("exiting..");
                    break;
                default:
                    System.out.println("invalid choice");

            }

        }while(choice!=4);


    }
}
