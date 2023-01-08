    import java.util.Scanner;
    public class Employee_Question_Statement3 {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter number of employees : ");

            int len = inp.nextInt();
            int[] regno = new int[len];
            String[] empName = new String[len];
            double[] sal = new double[len];
            for(int i = 0; i < len; i++){

                System.out.println("Enter employee id: ");
                regno[i] = inp.nextInt();
                System.out.println("Enter employee name: ");
                empName[i] = inp.next();
                System.out.println("Enter employee salary: ");
                sal[i] = inp.nextDouble();

            }
            System.out.println("Enter name to search from available data: ");
            String name = inp.next();
            display(name, regno, empName, sal);
        }

        public static void display(String name,int regno[],String Empname[],double salary[]){
            //loop to search iteam
            for(int i = 0; i < Empname.length; i++){
                if(name.equalsIgnoreCase(Empname[i])){
                    System.out.println("ID \t Name \t Salary");
                    System.out.println("ID "+regno[i]+"\t "+Empname[i]+" \t"+salary[i]);
                    break;
                }
            }
        }
    }

