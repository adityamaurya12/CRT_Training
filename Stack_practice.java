import java.util.*;

public class Stack_practice {
    static Scanner sc=new Scanner(System.in);
    static Stack<Integer> s = new Stack<>();


    public static void insert(){
        System.out.println("Enter the value:");
        int a=sc.nextInt();
        s.push(a);
        System.out.println(a);


    }
    public static void pop_stack(){
        if(s.isEmpty()){
            System.out.println("nothing to pop");
        }
        else {

            System.out.println(s.pop());

        }
    }
    public static void peak_stack(){
        if (s.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + s.peek());
        }
    }
    public static void is_empty(){
        System.out.println("Is stack empty? " + s.isEmpty());
    }
    public static void size_stack(){
        System.out.println(s.size());
    }
    public static void display(){
        if(s.isEmpty()) {
            System.out.println("nothing to print");
        }
        else{
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("\n--- Stack Operations Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek (Top element)");
            System.out.println("4. Is Empty?");
            System.out.println("5. Size of Stack");
            System.out.println("6. Display Stack");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    insert();
                    break;
                case 2:
                    pop_stack();
                    break;
                case 3:
                    peak_stack();
                    break;
                case 4:
                    is_empty();
                    break;
                case 5:
                    size_stack();
                    break;
                case 6:
                    display();
                    break;

                case 7:
                    System.out.println("print exit");
                    break;
                    default:
                        System.out.println("Invalid choice");



            }




        }
    }
}
