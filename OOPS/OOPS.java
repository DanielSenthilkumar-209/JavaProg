class College{  
   int getDepartmentCount(){
      return 0;
      }  
   }

class CSE extends College{  
   int getDepartmentCount(){
      return 125;
      }  
   }  

class ECE extends College{  
   int getDepartmentCount(){
      return 121;
      }  
   }  

class IT extends College{
   int getDepartmentCount(){
      return 63; 
      }
   }

class AIDS extends College{
   int getDepartmentCount(){
      return 61; 
      }
   }
class OOPS{ 
public static void main(String args[]){  
CSE c = new CSE();
ECE e = new ECE();
IT i = new IT();
AIDS a = new AIDS();
System.out.println("DEPARTMENT COUNT OF STUDENTS IN A COLLEGE:-");
System.out.println("Total no of students in CSE: "+c.getDepartmentCount());  
System.out.println("Total no of students in ECE: "+e.getDepartmentCount());
System.out.println("Total no of students in IT: "+i.getDepartmentCount());
System.out.println("Total no of students in AIDS: "+a.getDepartmentCount());  
}  
}  