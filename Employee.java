import java.util.Scanner;
class Employee{
    public String name;
    public int yoj;
    public float sal;
    public String add;
    Scanner scan=new Scanner(System.in);

    public Employee(){ }
    
    public Employee(String name, int yoj,float sal,String add){
        this.name=name;
        this.yoj=yoj;
        this.sal=sal;
        this.add=add;
    }
    public void GetEmpData(){
          System.out.println("Enter Emp name");
          name=scan.next();
            System.out.println("Enter year of joining");
            yoj=scan.nextInt();
              System.out.println("Enter salary");
              sal=scan.nextFloat();
                System.out.println("Enter Address");
                add=scan.next();

    }

    public void PrintDetails(){
          System.out.println(name+"\t\t\t" + yoj+"\t\t\t"+sal+"\t\t\t" +add+"\t\t\t");
    }
    }