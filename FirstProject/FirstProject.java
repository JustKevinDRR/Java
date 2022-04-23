package FirstProject;
// The program is really just a test of the most basic java functionalities, i will update it every time I learn something new.
import java.util.*;   

public class FirstProject{
    public static void main(String[] args){
        
        List<Integer> list = new ArrayList<> ();
        Scanner sc = new Scanner(System.in);
        String name = "";
        int lop = 0, selection = 0, x= 0, z=0, y=0, num=0, result = 0;
        

        System.out.println("Please, Enter your name");
        name = sc.nextLine();
        
        do{

            System.out.println("hello "+name+", what you want to do now?(write de number of you selection)\n1.List of prime numbers\n2.number classifier\n3.Numbers sum");
            selection = sc.nextInt();

            if(selection == 1){
                System.out.println("Until what number do you want to create the list?");
                x= sc.nextInt();

                for(int i=1; i<=x;i=i+1){

                    if(i==1){
                    }else if (i==2){
                        list.add(i);
                    }else if (i==3|i==5|i==7){
                        list.add(i);
                    }else if (i % 2 != 0 ){        
                        if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
                        list.add(i);}
                    }
                    }
                System.out.println("List:"+list);

            }else if (selection == 2){
                System.out.println("Enter a number");
                z= sc.nextInt();

                if (z == 1){    
                        System.out.println(z+" Is odd");
                }else if (z==2){
                        System.out.println(z+" is even and prime");
                }else if (z==3|z==5|z==7){
                        System.out.println(z+" is odd and prime");
                }else  if (z % 2 != 0 ){        
                    if (z % 3 != 0 && z % 5 != 0 && z % 7 != 0){
                        System.out.println(z+" is odd and prime");
                    }else {System.out.println(z+" is odd");}
                }else {System.out.println(z+" is even");}

            }else if (selection == 3){
                System.out.println("How many numbers do you want to sum?");
                y=sc.nextInt();

                for (int i=1;i<=y;i=i+1){
                    System.out.println("Enter the number "+i);
                    num=sc.nextInt();
                    result= result + num;
                }
                System.out.println("Result: " + result);
            } else{
                System.out.println("Error, enter a valid number");
            }

            System.out.println("You wanna continue?(enter the number)\n1.yes\n2.no");
            lop = sc.nextInt();

        }while(lop == 1);
        
        sc.close();
    }
}

//KevinDRR