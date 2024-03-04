class Account{  
   String getDetails(){
      String acc_holder = "manoj";
      return "0";
      }  
   }

class Acc_Holder extends Account{  
   String getDetails(){
      return "Manoj";
      }  
   }  

class Acc_Id extends Account{  
   String getDetails(){
      return "11000321041";
      }  
   }  

class Acc_Bank extends Account{
   String getDetails(){
      return "Canara Bank"; 
      }
   }

class Acc_Branch extends Account{
   String getDetails(){
      return "Orathanadu"; 
      }
   }
class OOPSV2{ 
public static void main(String args[]){  
Acc_Holder ah = new Acc_Holder();
Acc_Id ai = new Acc_Id();
Acc_Bank ab = new Acc_Bank();
Acc_Branch abr = new Acc_Branch();
System.out.println("THE DETAILS OF AN ACCOUNT:-");
System.out.println("Account Holder Name: "+ah.getDetails());
System.out.println("Account ID: "+ai.getDetails());
System.out.println("Bank Name: "+ab.getDetails());
System.out.println(" Branch Name: "+abr.getDetails());
}
}  