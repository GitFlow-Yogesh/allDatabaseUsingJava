import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
class Main{
        //Array list functions r here
        public static void arraylist(){
            ArrayList<Integer> al=new ArrayList<>();
            boolean value=true;
            while(value){
            System.out.println(" ");
            System.out.println("Press 1 to add integer ");
            System.out.println("Press 2 to show all data ");
            System.out.println("Press 3 to get any data at any index ");
            System.out.println("Press 4 to clear all data ");
            System.out.println("Press 5 to check size of arraylist ");
            System.out.println("Press 6 to check if its empty or not ! ");
            System.out.println("Press 7 to exit from arraylist database. ");
            System.out.println(" ");
            System.out.print("Enter choice : ");
            Scanner gscan=new Scanner(System.in);
            int alchoice=gscan.nextInt();
            gscan.nextLine();
            switch(alchoice){
                case 1:
                    System.out.print("Enter element : ");
                    int element=gscan.nextInt();
                    gscan.nextLine();
                    al.add(element);
                    System.out.println("Element "+element+" added successfully");
                    break;  
                case 2:
                    if(al.size()==0){
                        System.out.println("Its Empty");
                    }else{
                    System.out.println("All Elements are :"+ al);
                    }
                    break;
                case 3:
                    System.out.print("Enter index number : ");
                    int indexelement=gscan.nextInt();
                    gscan.nextLine();
                    System.out.println("At given index, element is : "+al.get(indexelement));
                    break;
                case 4:
                    al.clear();
                    System.out.println("All data cleared successfully ");
                    break;  
                case 5:
                    System.out.println("Size of the array list is : "+al.size());
                    break;
                case 6:
                    if(al.size()==0){
                        System.out.println("Its Empty ");
                    }else{
                         System.out.println("No, its not empty ");
                    }
                    break;
                case 7:
                    System.out.println("Exit Successfully ");
                    value =false;
                    break;
                default :
                    System.out.println("Enter valid option only ");
                    break;
                    
                }
            }
            
        }//finished everything;
        //Linked list functions r here
        public static void linkedlist(){
            LinkedList<String> ll=new LinkedList<>();
            boolean value=true;
            while(value){
            System.out.println(" ");
            System.out.println("Press 1 to add String  ");
            System.out.println("Press 2 to show all data ");
            System.out.println("Press 3 to set any data at any index ");
            System.out.println("Press 4 to clear all data ");
            System.out.println("Press 5 to check size of linked list ");
            System.out.println("Press 6 to check if its empty or not ! ");
            System.out.println("Press 7 to exit from linked list database. ");
            System.out.println(" ");
            System.out.print("Enter choice : ");
            Scanner gscan=new Scanner(System.in);
            int llchoice=gscan.nextInt();
            gscan.nextLine();
            switch(llchoice){
                case 1:
                    System.out.print("Enter String : ");
                    String element=gscan.nextLine();
                    ll.add(element);
                    System.out.println("Element "+element+" added successfully");
                    break;  
                case 2:
                    if(ll.size()==0){
                        System.out.println("Its Empty");
                    }else{
                    System.out.println("List Elements are :"+ ll);
                    }
                    break;
                case 3:
                    System.out.print("Enter index number : ");
                    int index=gscan.nextInt();
                    gscan.nextLine();
                    System.out.print("Enter String to set : ");
                    String str=gscan.nextLine();
                    ll.set(index,str);
                    System.out.println("At given index, string set successfully");
                    break;
                case 4:
                    ll.clear();
                    System.out.println("All data cleared successfully ");
                    break;  
                case 5:
                    System.out.println("Size of the array list is : "+ll.size());
                    break;
                case 6:
                    if(ll.size()==0){
                        System.out.println("Its Empty ");
                    }else{
                         System.out.println("No, its not empty ");
                    }
                    break;
                case 7:
                    System.out.println("Exit Successfully ");
                    value =false;
                    break;
                default :
                    System.out.println("Enter valid option only ");
                    break;
            }
            }
        }
        //vector  functions r here
        public static void defaultvector(){
             Vector v = new Vector(); //default vector
            boolean value=true;
            while(value){
            System.out.println(" ");
            System.out.println("Press 1 to add String or integer  ");
            System.out.println("Press 2 to show all data ");
            System.out.println("Press 3 to set data ");
            System.out.println("Press 4 to clear all data ");
            System.out.println("Press 5 to check size of Vector");
            System.out.println("Press 6 to check if its empty or not ! ");
            System.out.println("Press 7 to exit from Vector database. ");
            System.out.println(" ");
            System.out.print("Enter choice : ");
            Scanner gscan=new Scanner(System.in);
            int vchoice=gscan.nextInt();
            gscan.nextLine();
            switch(vchoice){
                case 1:
                    System.out.print("Enter String : ");
                    String element=gscan.nextLine();
                    v.add(element);
                    System.out.println("Element "+element+" added successfully");
                    break;  
                case 2:
                    if(v.size()==0){
                        System.out.println("Its Empty");
                    }else{
                    System.out.println("List Elements are :"+ v);
                    }
                    break;
                case 3:
                    System.out.print("Enter index number : ");
                    int index=gscan.nextInt();
                    gscan.nextLine();
                    System.out.print("Enter String to set : ");
                    String str=gscan.nextLine();
                    v.set(index,str);
                    System.out.println("At given index, string set successfully");
                    break;
                case 4:
                    v.clear();
                    System.out.println("All data cleared successfully ");
                    break;  
                case 5:
                    System.out.println("Size of the array list is : "+v.size());
                    break;
                case 6:
                    if(v.size()==0){
                        System.out.println("Its Empty ");
                    }else{
                         System.out.println("No, its not empty ");
                    }
                    break;
                case 7:
                    System.out.println("Exit Successfully ");
                    value =false;
                    break;
                default :
                    System.out.println("Enter valid option only ");
                    break;}
            }
            }
        public static void genericvector(){
            System.out.println(" This is generic vector");
            Vector<Integer> gv = new Vector<Integer>(); 
            //generic
            boolean value=true;
            while(value){
            System.out.println(" ");
            System.out.println("Press 1 to add only integer  ");
            System.out.println("Press 2 to show all data ");
            System.out.println("Press 3 to set data ");
            System.out.println("Press 4 to clear all data ");
            System.out.println("Press 5 to check size of Vector");
            System.out.println("Press 6 to check if its empty or not ! ");
            System.out.println("Press 7 to exit from Vector database. ");
            System.out.println(" ");
            System.out.print("Enter choice : ");
            Scanner gscan=new Scanner(System.in);
            int gchoice=gscan.nextInt();
            gscan.nextLine();
            switch(gchoice){
                case 1:
                    System.out.print("Enter String : ");
                    int element=gscan.nextInt();
                    gv.add(element);
                    System.out.println("Element "+element+" added successfully");
                    break;  
                case 2:
                    if(gv.size()==0){
                        System.out.println("Its Empty");
                    }else{
                    System.out.println("List Elements are :"+ gv);
                    }
                    break;
                case 3:
                    System.out.print("Enter index number : ");
                    int index=gscan.nextInt();
                    gscan.nextLine();
                    System.out.print("Enter String to set : ");
                    int str=gscan.nextInt();
                    gv.set(index,str);
                    System.out.println("At given index, string set successfully");
                    break;
                case 4:
                    gv.clear();
                    System.out.println("All data cleared successfully ");
                    break;  
                case 5:
                    System.out.println("Size of the array list is : "+gv.size());
                    break;
                case 6:
                    if(gv.size()==0){
                        System.out.println("Its Empty ");
                    }else{
                         System.out.println("No, its not empty ");
                    }
                    break;
                case 7:
                    System.out.println("Exit Successfully ");
                    value =false;
                    break;
                default :
                    System.out.println("Enter valid option only ");
                    break;}}
            }
        public static void vector(){
            System.out.println(" ");
            System.out.println("Press 1 to use Default Vector");
            System.out.println("Press 2 to use Generic Vector");
            System.out.println("Press 3 to exit to main loop ");
            System.out.println(" ");
            Scanner vtsc=new Scanner(System.in);
            System.out.print("Enter Your choice:  ");
            int vchoice=vtsc.nextInt();
            switch(vchoice){
                case 1:
                    defaultvector();
                    break;
                case 2:
                    genericvector();
                    break;
                case 3:
                    break;
                default :
                    System.out.println("Enter valid choice");
                    break;
            }
        }
        //stack  functions r here
        public static void stack(){
            Stack<String> s = new Stack<String>();
            boolean value=true;
            while(value){
            System.out.println(" ");
            System.out.println("Press 1 to add String or integer  ");
            System.out.println("Press 2 to show all data ");
            System.out.println("Press 3 to pop out last data set ");
            System.out.println("Press 4 to clear all data ");
            System.out.println("Press 5 to check size of Stack");
            System.out.println("Press 6 to check if its empty or not ! ");
            System.out.println("Press 7 to check the top element");
            System.out.println("Press 8 to exit from stack database. ");
            System.out.println(" ");
            System.out.print("Enter choice : ");
            Scanner gscan=new Scanner(System.in);
            int schoice=gscan.nextInt();
            gscan.nextLine();
            switch(schoice){
                case 1:
                    System.out.print("Enter String or number : ");
                    String element=gscan.nextLine();
                    s.push(element);
                    System.out.println("Element "+element+" added successfully");
                    break;  
                case 2:
                    if(s.size()==0){
                        System.out.println("Its Empty");
                    }else{
                    System.out.println("List Elements are :"+ s);
                    }
                    break;
                case 3:
                    System.out.println("Last element popped out :"+ s.peek());
                    s.pop();
                    break;
                case 4:
                    s.clear();
                    System.out.println("All data cleared successfully ");
                    break;  
                case 5:
                    System.out.println("Size of the array list is : "+s.size());
                    break;
                case 6:
                    if(s.size()==0){
                        System.out.println("Its Empty ");
                    }else{
                         System.out.println("No, its not empty ");
                    }
                    break;
                case 7:
                    System.out.println("Top element is this : "+s.peek());
                    break;
                case 8:
                    System.out.println("Exit Successfully ");
                    value =false;
                    break;
                default :
                    System.out.println("Enter valid option only ");
                    break;}}
        }
        //queue  functions r here
        public static void defaultqueue(){
             Queue<String> q = new LinkedList<>();
            // System.out.println("Default que");
            boolean value=true;
            while(value){
            System.out.println(" ");
            System.out.println("Press 1 to add String ");
            System.out.println("Press 2 to show all data ");
            System.out.println("Press 3 to check about front element ");
            System.out.println("Press 4 to clear all data ");
            System.out.println("Press 5 to check size of Vector");
            System.out.println("Press 6 to check if its empty or not ! ");
            System.out.println("Press 7 to remove head of queue");
            System.out.println("Press 8 to exit from Vector database. ");
            System.out.println(" ");
            System.out.print("Enter choice : ");
            Scanner gscan=new Scanner(System.in);
            int qchoice=gscan.nextInt();
            gscan.nextLine();
            switch(qchoice){
                case 1:
                    System.out.print("Enter String : ");
                    String element=gscan.nextLine();
                    q.add(element);
                    System.out.println("Element "+element+" added successfully");
                    break;  
                case 2:
                    if(q.size()==0){
                        System.out.println("Its Empty");
                    }else{
                    System.out.println("Queue Elements are :"+ q);
                    }
                    break;
                case 3:
                   
                    System.out.println("first element is "+ q.peek());
                    break;
                case 4:
                    q.clear();
                    System.out.println("All data cleared successfully ");
                    break;  
                case 5:
                    System.out.println("Size of the array list is : "+q.size());
                    break;
                case 6:
                    if(q.size()==0){
                        System.out.println("Its Empty ");
                    }else{
                         System.out.println("No, its not empty ");
                    }
                    break;
                case 7:
                    System.out.println("head element  "+q.remove() + " removed successfully ");
                    break;
                case 8:
                    System.out.println("Exit Successfully ");
                    value =false;
                    break;
                default :
                    System.out.println("Enter valid option only ");
                    break;}}
        }
        public static void priorityqueue(){
            Queue<String> pq = new PriorityQueue<>();
            System.out.println("Priority que");
            boolean value=true;
            while(value){
            System.out.println(" ");
            System.out.println("Press 1 to add String ");
            System.out.println("Press 2 to show all data ");
            System.out.println("Press 3 to check about front element ");
            System.out.println("Press 4 to clear all data ");
            System.out.println("Press 5 to check size of Vector");
            System.out.println("Press 6 to check if its empty or not ! ");
            System.out.println("Press 7 to remove head of queue");
            System.out.println("Press 8 to exit from Vector database. ");
            System.out.println(" ");
            System.out.print("Enter choice : ");
            Scanner gscan=new Scanner(System.in);
            int pqchoice=gscan.nextInt();
            gscan.nextLine();
            switch(pqchoice){
                case 1:
                    System.out.print("Enter String : ");
                    String element=gscan.nextLine();
                    pq.add(element);
                    System.out.println("Element "+element+" added successfully");
                    break;  
                case 2:
                    if(pq.size()==0){
                        System.out.println("Its Empty");
                    }else{
                    System.out.println("Queue Elements are :"+ pq);
                    }
                    break;
                case 3:
                   
                    System.out.println("first element is "+ pq.peek());
                    break;
                case 4:
                    pq.clear();
                    System.out.println("All data cleared successfully ");
                    break;  
                case 5:
                    System.out.println("Size of the array list is : "+pq.size());
                    break;
                case 6:
                    if(pq.size()==0){
                        System.out.println("Its Empty ");
                    }else{
                         System.out.println("No, its not empty ");
                    }
                    break;
                case 7:
                    System.out.println("head element  "+pq.remove() + " removed successfully ");
                    break;
                case 8:
                    System.out.println("Exit Successfully ");
                    value =false;
                    break;
                default :
                    System.out.println("Enter valid option only ");
                    break;}}
        }
        public static void priorityblockingqueue(){
            System.out.println("Priority blocking que");
            Queue<String> pbq = new PriorityBlockingQueue<String>();
            boolean value=true;
            while(value){
            System.out.println(" ");
            System.out.println("Press 1 to add String ");
            System.out.println("Press 2 to show all data ");
            System.out.println("Press 3 to check about front element ");
            System.out.println("Press 4 to clear all data ");
            System.out.println("Press 5 to check size of Vector");
            System.out.println("Press 6 to check if its empty or not ! ");
            System.out.println("Press 7 to remove head of queue");
            System.out.println("Press 8 to exit from Vector database. ");
            System.out.println(" ");
            System.out.print("Enter choice : ");
            Scanner gscan=new Scanner(System.in);
            int pbqchoice=gscan.nextInt();
            gscan.nextLine();
            switch(pbqchoice){
                case 1:
                    System.out.print("Enter String : ");
                    String element=gscan.nextLine();
                    pbq.add(element);
                    System.out.println("Element "+element+" added successfully");
                    break;  
                case 2:
                    if(pbq.size()==0){
                        System.out.println("Its Empty");
                    }else{
                    System.out.println("Queue Elements are :"+ pbq);
                    }
                    break;
                case 3:
                   
                    System.out.println("first element is "+ pbq.peek());
                    break;
                case 4:
                    pbq.clear();
                    System.out.println("All data cleared successfully ");
                    break;  
                case 5:
                    System.out.println("Size of the array list is : "+pbq.size());
                    break;
                case 6:
                    if(pbq.size()==0){
                        System.out.println("Its Empty ");
                    }else{
                         System.out.println("No, its not empty ");
                    }
                    break;
                case 7:
                    System.out.println("head element  "+pbq.remove() + " removed successfully ");
                    break;
                case 8:
                    System.out.println("Exit Successfully ");
                    value =false;
                    break;
                default :
                    System.out.println("Enter valid option only ");
                    break;}}
        }
        public static void Queue(){
            System.out.println(" ");
            System.out.println("Press 1 to use Default Queue");
            System.out.println("Press 2 to use Priority Queue");
            System.out.println("Press 3 to use Priority Blocking Queue");
            System.out.println("Press 4 to exit to main loop ");
            System.out.println(" ");
            Scanner qtsc=new Scanner(System.in);
            System.out.print("Enter Your choice:  ");
            int qchoice=qtsc.nextInt();
            switch(qchoice){
                case 1:
                    defaultqueue();
                    break;
                case 2:
                    priorityqueue();
                    break;
                case 3:
                    priorityblockingqueue();
                    break;
                case 4:
                    break;
                default :
                    System.out.println("Enter valid choice");
                    break;
            }
        }
    //main function         
    public static void main(String args[]){
        System.out.println("Jai Bajrang Bali");
        System.out.println("Select DataBase U want to use:");
        System.out.println(" ");
        //Scanner for main function
        Scanner scan=new Scanner(System.in);
        while(true){
            
            System.out.println("Press 1 For Array List");
            System.out.println("Press 2 For Linked List");
            System.out.println("Press 3 For Vector");
            System.out.println("Press 4 For Stack"); 
            System.out.println("Press 5 For Queue");
            System.out.println("Press 6 For Exit");
            System.out.println(" ");
             System.out.print("Enter Your Choice : ");
           int dbchoice =scan.nextInt();
           switch(dbchoice){
               case 1:
                   System.out.println("We r working with Array List  ");
                   arraylist();
                   System.out.println(" ");
                   break;
                case 2:
                   System.out.println("We r working with Linked List  ");
                   linkedlist();
                   System.out.println(" ");
                   break;
                case 3:
                   System.out.println("We r working with Vector ");
                   vector();
                   System.out.println(" ");
                   break;
                case 4:
                   System.out.println("We r working with Stack ");
                   stack();
                   System.out.println(" ");
                   break;
                case 5:
                   System.out.println("We r working with queue");
                   Queue();
                   System.out.println(" ");
                   break;
                   case 6:
                   System.out.println("Exiting.....");
                    System.exit(0);
                   System.out.println(" ");
                   break;
                default :
                   System.out.println("Invalid choice ,Try Again");
                   System.out.println(" ");
                   break;
           }
        }
    }    
}