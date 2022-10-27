


import java.util.Scanner;
import java.io.*;



class student_details
    {
        private String student_name="Arman Shaikh";
        private long student_mob_number=1234567890;
        
        public String getStudent_Name()
        {
            return student_name;
        }
        
        public long getStudent_Mob_Number()
        {
            return student_mob_number;
        }
        
}




class Country
{
    String Country_name;
    String Country_exam;
    String Country_scholarship;
    double Country_Fees;
    String Country_duration;
    String Country_appdate;
    int rank;
    
    public static void signin()
    {
        
    }
    
    public static void Details()
    {
        
    }
    
    public static void Enquirydone()
    {
        
    }
}
    



class Usa extends Country
{
    
    {
    	System.out.println("Universities you can apply In USA for MAsters Program!");
    }
}



class University extends Usa
{
    
}


class Stanford extends University
{
    
}


class Mba1 extends Stanford
{
     Mba1(String Country_name,  String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
    	this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
}
}

class Mtech1 extends Stanford
{
     Mtech1(String Country_name,  String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
    	this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
    }
}



class Msc1 extends Stanford
{
     Msc1(String Country_name,  String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
    }
}

class Ma1 extends Stanford
{
     Ma1(String Country_name,  String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
    	this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
    }
}



class Md1 extends Stanford
{
     Md1(String Country_name,  String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
    	this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
    }
}




class Harvard extends University
{
    
}


class Mba2 extends Harvard
{
    Mba2( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
       {
        this.Country_name=Country_name;
        this.Country_exam=Country_exam;
        this.Country_scholarship=Country_scholarship;
        this.Country_Fees=Country_Fees;
        this.Country_duration=Country_duration;
        this.Country_appdate=Country_appdate;
        this.rank=rank;
       }
}



class Mtech2 extends Harvard
{
    Mtech2( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
      {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}



class Massachusetts extends University
{
    
}


class Mbamit extends Massachusetts
{
    Mbamit( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
      {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}



class Mtechmit extends Massachusetts
{
    Mtechmit( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}



class California extends University
{
    
}

class Msc_cs3 extends California
{
    Msc_cs3( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}


class Msc_ds3 extends California
{
    Msc_ds3( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}



class Yale extends University
{
    Yale( String Country_name,String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}



class Russia extends Country
{
    
    {
    	System.out.println("Colleges You can apply in Russia for Masters Program!");
    }
}

class Moscow extends Russia
{
       Moscow(String Country_name,  String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
       {
        this.Country_name=Country_name;
        this.Country_exam=Country_exam;
        this.Country_scholarship=Country_scholarship;
        this.Country_Fees=Country_Fees;
        this.Country_duration=Country_duration;
        this.Country_appdate=Country_appdate;
        this.rank=rank;
        }
}



class  Saintpetersburg extends Russia
{
    Saintpetersburg( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}



class Tomsk_State  extends Russia
{
    Tomsk_State ( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}



class Germany extends Country
{
    
    {
        System.out.println("niversities you can apply in Germany for Masters Program!");

    }
}


class Berlin extends Germany
{
    
}


class Mba4 extends Berlin 
{
     Mba4( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
     {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}


class Msc4 extends Berlin 
{
     Msc4( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
     {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}


class Mtech4 extends Berlin 
{
     Mtech4( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
     {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}



class Munich extends Germany
{
    
}


class Mba5 extends Munich
{
    Mba5( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}



class Mtech5 extends Munich
{
    Mtech5( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
    {
      this.Country_name=Country_name;
      this.Country_exam=Country_exam;
      this.Country_scholarship=Country_scholarship;
      this.Country_Fees=Country_Fees;
      this.Country_duration=Country_duration;
      this.Country_appdate=Country_appdate;
      this.rank=rank;
      }
}



class Mae5 extends Munich
{
    Mae5( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
       {
       	this.Country_name=Country_name;
        this.Country_exam=Country_exam;
        this.Country_scholarship=Country_scholarship;
        this.Country_Fees=Country_Fees;
        this.Country_duration=Country_duration;
        this.Country_appdate=Country_appdate;
        this.rank=rank;
       }
}



class Bonn extends Germany
{
    
}


class Mba6 extends Bonn 
{
    Mba6( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
       {
       	this.Country_name=Country_name;
        this.Country_exam=Country_exam;
        this.Country_scholarship=Country_scholarship;
        this.Country_Fees=Country_Fees;
        this.Country_duration=Country_duration;
        this.Country_appdate=Country_appdate;
        this.rank=rank;
      } 
}



class Mtech6 extends Bonn 
{
    Mtech6( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
       {
        this.Country_name=Country_name;
        this.Country_exam=Country_exam;
        this.Country_scholarship=Country_scholarship;
        this.Country_Fees=Country_Fees;
        this.Country_duration=Country_duration;
        this.Country_appdate=Country_appdate;
        this.rank=rank;
      }
}



class Mtechae6 extends Bonn 
{
    Mtechae6( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
       {
        this.Country_name=Country_name;
        this.Country_exam=Country_exam;
        this.Country_scholarship=Country_scholarship;
        this.Country_Fees=Country_Fees;
        this.Country_duration=Country_duration;
        this.Country_appdate=Country_appdate;
        this.rank=rank;
      }
}



class Uk extends Country
{
    
    {
        System.out.println("Universities You can apply in United Kingdom for Masters Program!");

    }
}


class Phdlawoxox extends Uk
{
      Phdlawoxox( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
      {
        this.Country_name=Country_name;
        this.Country_exam=Country_exam;
        this.Country_scholarship=Country_scholarship;
        this.Country_Fees=Country_Fees;
        this.Country_duration=Country_duration;
        this.Country_appdate=Country_appdate;
        this.rank=rank;
        }
}



class Mbaox extends Uk
{
  Mbaox( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
  {
    this.Country_name=Country_name;
    this.Country_exam=Country_exam;
    this.Country_scholarship=Country_scholarship;
    this.Country_Fees=Country_Fees;
    this.Country_duration=Country_duration;
    this.Country_appdate=Country_appdate;
    this.rank=rank;
    }

}



class Phdox extends Uk
{
  Phdox( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
  {
    this.Country_name=Country_name;
    this.Country_exam=Country_exam;
    this.Country_scholarship=Country_scholarship;
    this.Country_Fees=Country_Fees;
    this.Country_duration=Country_duration;
    this.Country_appdate=Country_appdate;
    this.rank=rank;
    }

}


class Msox extends Uk
{
  Msox( String Country_name, String Country_exam, String Country_scholarship,  double Country_Fees,String Country_duration,String Country_appdate,int rank)
  {
    this.Country_name=Country_name;
    this.Country_exam=Country_exam;
    this.Country_scholarship=Country_scholarship;
    this.Country_Fees=Country_Fees;
    this.Country_duration=Country_duration;
    this.Country_appdate=Country_appdate;
    this.rank=rank;
    }

}



 class Msabroad
{
    public static void main(String[] args)
    {
     
     
     
      System.out.println("-------Register Now To Get Free Details-------");
      Scanner sc1 = new Scanner(System.in);     
      System.out.println(" ");
      System.out.println("--------------------------");
      System.out.println(" ");

      System.out.println("Enter Your Full Name:");
      String s = sc1.nextLine();
      System.out.println(" ");
      System.out.println("--------------------------");
      Scanner sc2 = new Scanner(System.in);     
      System.out.println(" ");


      System.out.println("Enter Your Phone Number:");
      Long l = sc2.nextLong();
      System.out.println(" ");
      System.out.println("--------------------------");

     
     
     
     {
     if(l==10)
     {
     	
     	System.out.println("Please Enter Valid number");
     }
     else
     {
     
     }
     
     }
     
     Scanner sc3 = new Scanner(System.in);     
     System.out.println(" ");
     System.out.println("Enter Email:");
     String e = sc3.nextLine();
     System.out.println(" ");
     System.out.println("------------------");
     if(e=="abc@12.com")
     {
     	System.out.println(" ");
     }
     else
     {
     
     }
      System.out.println(" ");
      System.out.println("check the details:");
      System.out.println(" ");
      System.out.println("Name:"+s);
      System.out.println("Number:"+l);
      System.out.println("Email id:"+e);
      System.out.println(" ");
      System.out.println("-------------------");
      System.out.println(" ");
     
      System.out.println("Enquiry Done Successfully..!!");
     
      Scanner sc4 = new Scanner(System.in);
      System.out.println(" ");
      System.out.println("!!!!!!!!!!!-------------------------------!!!!!!!!!!!! ");
      System.out.println(" ");
      System.out.println("!!!.....Welcome to ARMAN's Masters in Abroad Program.....!!!");
      System.out.println(" ");
      System.out.println("!!..Select Your Favourite Country..!! ");
      System.out.println(" ");
      System.out.println("Enter 1 For U.S.A.");
      System.out.println("Enter 2 For RUSSIA");
      System.out.println("Enter 3 For GERMANY");
      System.out.println("Enter 4 For U.K.");
      System.out.println("Enter 5 for Main Page");
      System.out.println(" ");
      int num = sc4.nextInt();
      
      while(true)
      {
      switch (num)
      {
      case 1:
     
      System.out.println(" ");
      System.out.println("!!!...Select University you would like to pursue Masters Degree...!!! ");
      System.out.println(" ");
      System.out.println("Enter 1 For Stanford Univesity");
      System.out.println("Enter 2 For Harvard Univesity" );
      System.out.println("Enter 3 For Massachusetts Institute of Technology");
      System.out.println("Enter 4 For California Institute of Technology");
      System.out.println("Enter 5 For Yale Univesity");
      System.out.println(" ");


      int num1= sc4.nextInt();
      


      //Stanford University COURSE DETAILS
     
      switch (num1)
      {
      case 1:
   
      System.out.println(" ");
      System.out.println("!!!!...Select Your Favourite Course in Stanford University...!!!!");
      System.out.println(" ");
      System.out.println("Enter 1 For MBA");
      System.out.println("Enter 2 For M.tech" );
      System.out.println("Enter 3 For M.Sc");
      System.out.println("Enter 4 For M.A.");
      System.out.println("Enter 5 For M.D.");
      System.out.println(" ");
 
      int num8= sc4.nextInt();
      
     
      switch (num8)
     {
        case 1:
        Country ref1=new Mba1("Masters of Business Administration","IELTS/GRE/TOEFL","No",79020,"2 Years","23 November 2022",3);
        System.out.println(" ");
        System.out.println("!!!!...COURSE DETAILS ...!!!!");
        System.out.println(" ");

        System.out.println("Masters Course Name: "+ref1.Country_name);
        System.out.println("Language Test Required : "+ref1.Country_exam);
        System.out.println("Scholarship Availablity : "+ref1.Country_scholarship);
        System.out.println("Course Fees in : $ "+ref1.Country_Fees);
        System.out.println("Course Duration In Years: "+ref1.Country_duration);
        System.out.println("Course Application Start date: "+ref1.Country_appdate);
        System.out.println("Global rank of University:  #"+ref1.rank);

        System.out.println(" ");
        System.out.println("Thank You For Selecting Masters of Business Administration Course.");
        System.out.println(" ");
        break;
           
        case 2:
        Country   ref2= new  Mtech1("Masters of Technology","IELTS/TOEFL/PTE GRE","Yes",56258,"2 year or 1.5 year","23 November 2022",3);
        System.out.println(" ");
        System.out.println("!!!!...COURSE DETAILS...!!!!");
        System.out.println(" ");
        
        System.out.println("Masters Course Name: "+ref2.Country_name);
        System.out.println("Language Test Required : "+ref2.Country_exam);
        System.out.println("Scholarship Availablity : "+ref2.Country_scholarship);
        System.out.println("Course Fees in : $ "+ref2.Country_Fees);
        System.out.println("Course Duration In Years: "+ref2.Country_duration);
        System.out.println("Course Application Start date: "+ref2.Country_appdate);
        System.out.println("Global rank of University:  #"+ref2.rank);

        System.out.println(" ");
        System.out.println("Thank You For Selecting M.Tech Course");
        System.out.println(" ");
           break;     
           
        case 3:
        Country   ref3   = new Msc1("Masters of Science","IELTS/GRE","Yes",35650,"1 year  or 1.5 Year","23 November 2022",3);
        System.out.println(" ");
        System.out.println("!!!!...COURSE DETAILS...!!!!");
        System.out.println(" ");
        System.out.println("Masters Course Name: "+ref3.Country_name);
        System.out.println("Language Test Required : "+ref3.Country_exam);
        System.out.println("Scholarship Availablity : "+ref3.Country_scholarship);
        System.out.println("Course Fees in : $ "+ref3.Country_Fees);
        System.out.println("Course Duration In Years: "+ref3.Country_duration);
        System.out.println("Course Application Start date: "+ref3.Country_appdate);
        System.out.println("Global rank of University:  #"+ref3.rank);

        System.out.println(" ");
        System.out.println("Thank You For Selecting MAsters of Science");
        System.out.println(" ");
           break;    
           
        case 4:
        Country  ref4   = new Ma1("Masters of Arts","GRE/TOEFL/SAT","Yes",31230,"1 year","23 November 2022",3);
        System.out.println(" ");
        System.out.println("!!!!...COURSE DETAILS ..!!!!");
        System.out.println(" ");
        System.out.println("Masters Course Name: "+ref4.Country_name);
        System.out.println("Language Test Required : "+ref4.Country_exam);
        System.out.println("Scholarship Availablity : "+ref4.Country_scholarship);
        System.out.println("Course Fees in : $ "+ref4.Country_Fees);
        System.out.println("Course Duration In Years: "+ref4.Country_duration);
        System.out.println("Course Application Start date: "+ref4.Country_appdate);
        System.out.println("Global rank of University:  #"+ref4.rank);

        System.out.println(" ");
        System.out.println("Thank You For Selecting Masters of Arts");
        System.out.println(" ");
        break;       
           
        case 5:
        Country   ref5 = new  Md1("Doctor Of Medicine","GRE/IELTS/PTE","No",125000,"2 years ","23 November 2022",3);
        System.out.println(" ");
        System.out.println("!!!!...COURSE DETAILS...!!!!");
        System.out.println(" ");
        System.out.println("Masters Course Name: "+ref5.Country_name);
        System.out.println("Language Test Required : "+ref5.Country_exam);
        System.out.println("Scholarship Availablity : "+ref5.Country_scholarship);
        System.out.println("Course Fees in : $ "+ref5.Country_Fees);
        System.out.println("Course Duration In Years: "+ref5.Country_duration);
        System.out.println("Course Application Start date: "+ref5.Country_appdate);
        System.out.println("Global rank of University:  ##"+ref5.rank);
        System.out.println(" ");
        System.out.println("Thank You For Selecting Doctor Of Medicine");
        System.out.println(" ");
           break;                                                 
           
           default: System.out.println("PLEASE Enter Valid Number");
         break;
         
  }    
  
  break;






      //Harvard University
     
      case 2:
  
        System.out.println(" ");
        System.out.println("!!!!...Selecting Your Favourite Course in Harvard University...!!!!");
        System.out.println(" ");
        System.out.println("Enter 1 For MBA");
        System.out.println("Enter 2 For M.Tech" );
        System.out.println(" ");

        int num9= sc4.nextInt();
      
     
     switch (num9)
     {
     	case 1:
      Country   ref6   = new  Mba2("Masters of Business Administrtation","SAT/IELTS/GRE/CAT","Yes",85000,"2 year and 1.5 year","30 November 2022",5);
        System.out.println(" ");
        System.out.println("!!!!...COURSE DETAILS...!!!!");
        System.out.println(" ");
        System.out.println("Masters Course Name: "+ref6.Country_name);
        System.out.println("Language Test Required : "+ref6.Country_exam);
        System.out.println("Scholarship Availablity : "+ref6.Country_scholarship);
        System.out.println("Course Fees in : $ "+ref6.Country_Fees);
        System.out.println("Course Duration In Years: "+ref6.Country_duration);
        System.out.println("Course Application Start date: "+ref6.Country_appdate);
        System.out.println("Global rank of University:  #"+ref6.rank);

        System.out.println(" ");
        System.out.println("Thank You For Selecting Masters of Business Administrtation");
        System.out.println(" ");

         break ;
         
         case 2:
        Country   ref7   = new  Mtech2("Masters of Technology","GREIELTS/TOEFL/CAT/SAT","yes",77500.00,"2 Years mandatory","30 November 2022",5);
        System.out.println(" ");
        System.out.println("!!!!...COURSE DETAILS are as follows...!!!!");
        System.out.println(" ");
        System.out.println("Masters Course Name: "+ref7.Country_name);
        System.out.println("Language Test Required : "+ref7.Country_exam);
        System.out.println("Scholarship Availablity : "+ref7.Country_scholarship);
        System.out.println("Course Fees in : $ "+ref7.Country_Fees);
        System.out.println("Course Duration In Years: "+ref7.Country_duration);
        System.out.println("Course Application Start date: "+ref7.Country_appdate);
        System.out.println("Global rank of University:  #"+ref7.rank);

        System.out.println(" ");
        System.out.println("Thank You For Selecting Masters of Technology");
        System.out.println("-------------------------------------NOTE------------------------------------- ");
        System.out.println(" ");

        System.out.println("This is the best course offered in USA (Bill Gates & Mark Zukerburg are Havard University dropouts)");
        
        System.out.println(" ");
     }
     break;






// Massachusetts Institute of Technology
  case 3:
        System.out.println(" ");
        System.out.println("!!!!...Select  Your Favourite Course in Massachusetts Institute of Technology...!!!!");
        System.out.println(" ");
        System.out.println("Enter 1 For MBA");
        System.out.println("Enter 2 For Graduate Certificate Cybersecurity" );
        System.out.println(" ");

        int num10= sc4.nextInt();
      
     
     switch (num10)
     {
     	case 1:
        Country   ref8   = new  Mbamit("Masters of Business Administration","GRE mandatory","Yes",76560,"1.5 years","29 October 2022",1);
        System.out.println(" ");
        System.out.println("!!!!...COURSE DETAILS ...!!!!");
        System.out.println(" ");
        System.out.println("Masters Course Name: "+ref8.Country_name);
        System.out.println("Language Test Required : "+ref8.Country_exam);
        System.out.println("Scholarship Availablity : "+ref8.Country_scholarship);
        System.out.println("Course Fees in : $ "+ref8.Country_Fees);
        System.out.println("Course Duration In Years: "+ref8.Country_duration);
        System.out.println("Course Application Start date: "+ref8.Country_appdate);
        System.out.println("Global rank of University:  #"+ref8.rank);

        System.out.println(" ");
        System.out.println("Thank You For Selecting Masters of Business Administration");
        System.out.println(" ");

         break ;
         
	    case 2:
 
        Country   ref9   = new  Mtechmit("Masters of Techcnology","GRE/IELTS/SAT/PLI","Only Tution fees will reduce for Scholarship",81250,"2 years","29 October 2022",1);
        System.out.println(" ");
        System.out.println("!!!!...COURSE DETAILS ...!!!!");
        System.out.println(" ");
        System.out.println("Masters Course Name: "+ref9.Country_name);
        System.out.println("Language Test Required : "+ref9.Country_exam);
        System.out.println("Scholarship Availablity : "+ref9.Country_scholarship);
        System.out.println("Course Fees in : $ "+ref9.Country_Fees);
        System.out.println("Course Duration In Years: "+ref9.Country_duration);
        System.out.println("Course Application Start date: "+ref9.Country_appdate);
        System.out.println("Global rank of University:  #"+ref9.rank);

        System.out.println(" ");
        System.out.println("Thank You For Selecting Masters of Technology");
        System.out.println(" ");

         break ;
     }
     break;
         




     // California univeristy
     case 4:
        System.out.println(" ");
        System.out.println("!!!!...Select Your Favourite Course in University Of California...!!!!");
        System.out.println(" ");
        System.out.println("Enter 1 For University of Msc CS");
        System.out.println("Enter 2 For University of Msc CS&AIDS" );
        System.out.println(" ");

        int num11= sc4.nextInt();
      
     
     switch (num11)
     {
     	case 1:
          Country   ref10   = new  Msc_cs3("Masters of Computer Science","GRE","yes",62640,"2 years ","14 November 2022",44);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS ...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref10.Country_name);
          System.out.println("Language Test Required : "+ref10.Country_exam);
          System.out.println("Scholarship Availablity : "+ref10.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref10.Country_Fees);
          System.out.println("Course Duration In Years: "+ref10.Country_duration);
          System.out.println("Course Application Start date: "+ref10.Country_appdate);
        System.out.println("Global rank of University:  #"+ref10.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Masters of Computer Science");
          System.out.println(" ");

         break ;
         
   	case 2:
          Country   ref11   = new  Msc_ds3("Masters of Data Science & Artificial Intelligence","GRE","No",48920,"2 years & 1.5 years","14 November 2022",44);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref11.Country_name);
          System.out.println("Language Test Required : "+ref11.Country_exam);
          System.out.println("Scholarship Availablity : "+ref11.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref11.Country_Fees);
          System.out.println("Course Duration In Years: "+ref11.Country_duration);
          System.out.println("Course Application Start date: "+ref11.Country_appdate);
          System.out.println("Global rank of University:  #"+ref11.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Masters of Data Science & Artificial Intelligence");
          System.out.println(" ");

         break ;
     }
     break;


     //Yale univeristy
         
          case 5:
              Yale   ref12  = new  Yale("Master of Science Advanced Management","IELTS/GRE","No-(Private Intitute)",49000,"2 years","05 December 2022",18);
              System.out.println(" ");
              System.out.println("!!!!...Yale University offers only one course...!!!!");
              System.out.println("----------------------------------------------------");
              System.out.println(" ");

              System.out.println("!!!!...Master of Science Advanced Management...!!!!");

              System.out.println(" ");
              System.out.println("Masters Course Name: "+ref12.Country_name);
              System.out.println("Language Test Required : "+ref12.Country_exam);
              System.out.println("Scholarship Availablity : "+ref12.Country_scholarship);
              System.out.println("Course Fees in : $ "+ref12.Country_Fees);
              System.out.println("Course Duration In Years: "+ref12.Country_duration);
              System.out.println("Course Application Start date: "+ref12.Country_appdate);
              System.out.println("Global rank of University:  #"+ref12.rank);
              System.out.println("Thank You For Selecting This Course");

              System.out.println(" ");
              System.out.println("Thank You For Selecting Master of Science Advanced Management in Yale university");
              System.out.println(" ");

         break ;
           
         default: System.out.println("Please Enter Valid Number");
         break;
     
     }
       
    Scanner sc5 = new Scanner(System.in);
    System.out.println(" ");
    break;
  
    



//For Russia country


  case 2:
   
      System.out.println(" ");
      System.out.println("!!!!...Selecting Your Favourite University in Russia...!!!!");
      System.out.println(" ");
      System.out.println("Enter 1 For University of Moscow");
      System.out.println("Enter 2 For University of Saint Petersburg" );
      System.out.println("Enter 3 For University of Tomsk State ");
      System.out.println(" ");

 int num2= sc4.nextInt();
     
       
switch(num2)
{
 //Moscow 
           
         case 1:
      
         Country   ref14   = new  Moscow("Masters of Business Administration","GRE/TOEFL","Yes",27000,"1.5 year or 2 year","Will be Available soon",324);
         System.out.println(" ");
         System.out.println("!!!!...Details MBA details in University of Moscow...!!!!");
         System.out.println(" ");
         System.out.println("Masters Course Name: "+ref14.Country_name);
         System.out.println("Language Test Required : "+ref14.Country_exam);
         System.out.println("Scholarship Availablity : "+ref14.Country_scholarship);
         System.out.println("Course Fees in : $ "+ref14.Country_Fees);
         System.out.println("Course Duration In Years: "+ref14.Country_duration);
         System.out.println("Course Application Start date: "+ref14.Country_appdate);
              System.out.println("Global rank of University:  #"+ref14.rank);
         System.out.println(" ");
         System.out.println("Thank You for choosing MBA in  University of Moscow");
         System.out.println(" ");

         break;
         
           //Saint Petersburg
         case 2:
      
         Country   ref15   = new  Saintpetersburg("Masters of Technology","GRE/TOEFL","Yes",42000,"2 years","Will be Available soon",339);
         System.out.println(" ");
         System.out.println("!!!!...Details of  M.tech details in University of Saint Petersburg...!!!!");
         System.out.println(" ");
         System.out.println("Masters Course Name: "+ref15.Country_name);
         System.out.println("Language Test Required : "+ref15.Country_exam);
         System.out.println("Scholarship Availablity : "+ref15.Country_scholarship);
         System.out.println("Course Fees in : $ "+ref15.Country_Fees);
         System.out.println("Course Duration In Years: "+ref15.Country_duration);
         System.out.println("Course Application Start date: "+ref15.Country_appdate);
         System.out.println("Global rank of University:  #"+ref15.rank);
         System.out.println(" ");
         System.out.println("Thank Yor for choosing M.tech in  University of Saint Petersburg");
         System.out.println(" ");

break;


//Tomsk_State 
 case 3:
         Country   ref16 = new  Tomsk_State ("Bachelors of Computer Science in Data Science","GRE/TOEFL","Yes",33000,"1.5 years","04 jan 2023",458);
         System.out.println(" ");
         System.out.println("!!!!...Details of Bachelors of Computer Science in Data Science...!!!!");
         System.out.println(" ");
         System.out.println("Masters Course Name: "+ref16.Country_name);
         System.out.println("Language Test Required : "+ref16.Country_exam);
         System.out.println("Scholarship Availablity : "+ref16.Country_scholarship);
         System.out.println("Course Fees in : $ "+ref16.Country_Fees);
         System.out.println("Course Duration In Years: "+ref16.Country_duration);
         System.out.println("Course Application Start date: "+ref16.Country_appdate);
         System.out.println("Global rank of University:  #"+ref16.rank);
         System.out.println(" ");
         System.out.println("Thank You for choosing B.SC in DS in University of Tomsk State ");
         System.out.println(" ");

         break;

         default: System.out.println("PLEASE Enter Valid Number");
         break;
}
     
Scanner sc6 = new Scanner(System.in);
    System.out.println(" ");
    break;
    






// Germany   
  case 3:
   
System.out.println(" ");
System.out.println("!!!!...Select University in Germany...!!!!");
System.out.println(" ");
System.out.println("Enter 1 For Univerity of Berlin");
System.out.println("Enter 2 For Univerity of Munich " );
System.out.println("Enter 3 For Univerity of Bonn");
System.out.println(" ");

 int num3= sc4.nextInt();
     
       
 
switch(num3)
{
         //Berlin
   case 1:
   System.out.println(" ");
   System.out.println("!!!!...Select course you want to pursue in UNIVERSITY OF BERLIN...!!!!");
   System.out.println(" ");
   System.out.println("Enter 1 For MBA");
System.out.println("Enter 2 For Msc " );
System.out.println("Enter 3 For Mtech");
System.out.println(" ");

      
    int num4= sc4.nextInt();
     
       
 
switch(num4)  
{
      case 1 :
          Country   ref17  = new  Mba4("Masters of Business Administartion","IELTS/German Language","No",15000,"Experince 2yrs , Duration 2yrs","16 February 2023",118);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref17.Country_name);
          System.out.println("Language Test Required : "+ref17.Country_exam);
          System.out.println("Scholarship Availablity : "+ref17.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref17.Country_Fees);  
          System.out.println("Course Duration In Years: "+ref17.Country_duration);
          System.out.println("Course Application Start date: "+ref17.Country_appdate);
          System.out.println("Global rank of University:  #"+ref17.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Masters of Business Administartion");
          System.out.println(" ");
         break;
         
         case 2 :
          Country   ref18  = new  Msc4("Masters of Science","IELTS/German Language","Yes",12000,"1.5 yr","16 February 2023",118);
          System.out.println(" ");
          System.out.println("!!!!... COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref18.Country_name);
          System.out.println("Language Test Required : "+ref18.Country_exam);
          System.out.println("Scholarship Availablity : "+ref18.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref18.Country_Fees);
          System.out.println("Course Duration In Years: "+ref18.Country_duration);
          System.out.println("Course Application Start date: "+ref18.Country_appdate);
          System.out.println("Global rank of University:  #"+ref18.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Masters of Science");
          System.out.println(" ");
         break;
         
           case 3 :
          Country   ref19  = new  Mtech4("Masters of Technology","IELTS/German Language","Yes- Only for Mechanical Engineering",20000,"2 yr","16 February 2023",118);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref19.Country_name);
          System.out.println("Language Test Required : "+ref19.Country_exam);
          System.out.println("Scholarship Availablity : "+ref19.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref19.Country_Fees);
          System.out.println("Course Duration In Years: "+ref19.Country_duration);
          System.out.println("Course Application Start date: "+ref19.Country_appdate);
          System.out.println("Global rank of University:  #"+ref19.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Masters of Technology");
          System.out.println(" ");
         break;
         
          default: System.out.println("PLEASE Enter Valid Number");
         break;
}

          Scanner sc7 = new Scanner(System.in);
          System.out.println(" ");
    break;
    

    //University of Munich
  case 2:
   
System.out.println(" ");
System.out.println("!!!!...Selecting Your Favourite Course...!!!!");
System.out.println(" ");
System.out.println("Enter 1 For Mba");
System.out.println("Enter 2 For Mtech " );
System.out.println("Enter 3 For Msc");
System.out.println(" ");

 int num5= sc4.nextInt();
     
       
 
switch(num5)
{
      case 1:
          Country   ref20  = new  Mba5("Master of Business Administrtaion","IELTS/German Language/GRE","No",35000,"2 yr","22 January 2023",49);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref20.Country_name);
          System.out.println("Language Test Required : "+ref20.Country_exam);
          System.out.println("Scholarship Availablity : "+ref20.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref20.Country_Fees);
          System.out.println("Course Duration In Years: "+ref20.Country_duration);
          System.out.println("Course Application Start date: "+ref20.Country_appdate);
          System.out.println("Global rank of University:  #"+ref20.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Masters of Business Administration Country");
          System.out.println(" ");
         break;
         
           case 2 :
            Country   ref21  = new Mtech5("Masters of Technology","IELTS/German Language/GRE","Yes-If speaks German",21000,"2 yr","22 January 2023",49);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref21.Country_name);
          System.out.println("Language Test Required : "+ref21.Country_exam);
          System.out.println("Scholarship Availablity : "+ref21.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref21.Country_Fees);
          System.out.println("Course Duration In Years: "+ref21.Country_duration);
          System.out.println("Course Application Start date: "+ref21.Country_appdate);
          System.out.println("Global rank of University:  #"+ref21.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Masters of Technology");
          System.out.println(" ");
         break;
         
           case 3 :
          Country   ref22  = new  Mae5("Masters of Automobile Engineering","IELTS/German Language/GRE","Yes-If speaks German",22000,"2 yr","22 January 2023",49);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref22.Country_name);
          System.out.println("Language Test Required : "+ref22.Country_exam);
          System.out.println("Scholarship Availablity : "+ref22.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref22.Country_Fees);
          System.out.println("Course Duration In Years: "+ref22.Country_duration);
          System.out.println("Course Application Start date: "+ref22.Country_appdate);
          System.out.println("Global rank of University:  #"+ref22.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Masters of Automobile Engineering");
          System.out.println(" ");
          break;
         
          default: System.out.println("PLEASE Enter Valid Number");
         break;
}
       
       
        Scanner sc8= new Scanner(System.in);
    System.out.println(" ");
    break;
    


    //university of bonn
case 3:
     
      System.out.println(" ");
      System.out.println("!!!!...Select Your Favourite Course...!!!!");
      System.out.println(" ");
      System.out.println("Enter 1 For MBA");
      System.out.println("Enter 2 For Mtech " );
      System.out.println("Enter 3 For Mtech in Automobile Engineering");
      System.out.println(" ");

      int num6= sc4.nextInt();
     
       
 
switch(num6)
{
      case 1:
          Country   ref23  = new  Mba6("Masters of Business Administration","GRE/IELTS/TOEFL","No",22000,"2 yrs","12 January 2023",76);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref23.Country_name);
          System.out.println("Language Test Required : "+ref23.Country_exam);
          System.out.println("Scholarship Availablity : "+ref23.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref23.Country_Fees);
          System.out.println("Course Duration In Years: "+ref23.Country_duration);
          System.out.println("Course Application Start date: "+ref23.Country_appdate);
          System.out.println("Global rank of University:  #"+ref23.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Masters of Business Administration");
          System.out.println(" ");
         break;
         
           case 2 :
            Country   ref24 = new Mtech6("Masters of Technology","GRE/IELTS","Yes-If speaks german",22000,"2 yrs","12 January 2023",76);
            System.out.println(" ");
            System.out.println("!!!!...COURSE DETAILS...!!!!");
            System.out.println(" ");
            System.out.println("Masters Course Name: "+ref24.Country_name);
            System.out.println("Language Test Required : "+ref24.Country_exam);
            System.out.println("Scholarship Availablity : "+ref24.Country_scholarship);
            System.out.println("Course Fees in : $ "+ref24.Country_Fees);
            System.out.println("Course Duration In Years: "+ref24.Country_duration);
            System.out.println("Course Application Start date: "+ref24.Country_appdate);
            System.out.println("Global rank of University:  #"+ref24.rank);

            System.out.println(" ");
            System.out.println("Thank You For Selecting Masters of Technology");
            System.out.println(" ");
            break;
         
           case 3 :
          Country   ref25  = new  Mtechae6("Masters of Technology in Automobile Engineering","IELTS/GRE","Yes",27000,"2 yrs with Intership","12 January 2023",76);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref25.Country_name);
          System.out.println("Language Test Required : "+ref25.Country_exam);
          System.out.println("Scholarship Availablity : "+ref25.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref25.Country_Fees);
          System.out.println("Course Duration In Years: "+ref25.Country_duration);
          System.out.println("Course Application Start date: "+ref25.Country_appdate);
          System.out.println("Global rank of University:  #"+ref25.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Masters of Technology in Automobile Engineering");
          System.out.println(" ");
          break;
         
           default: System.out.println("PLEASE Enter Valid Number");
         break;
}
}
        
        Scanner sc9= new Scanner(System.in);
    System.out.println(" ");
    break;
  
    



    //United Kingdom
      case 4:
 
          System.out.println(" ");
          System.out.println("!!!!...Only Details of Courses Available in University of Oxford...!!!!");
          System.out.println(" ");
   
          System.out.println("!!!!...Select Yor Favourite Coure in University of Oxford...!!!!");
          System.out.println(" ");
          System.out.println("Enter 1 For PHD-law");
          System.out.println("Enter 2 For MBA " );
          System.out.println("Enter 3 For PHD");
          System.out.println("Enter 4 For MS");
          System.out.println(" ");

          int num7= sc4.nextInt();
     
       
 
switch(num7)
{
          case 1:
          Country   ref26   = new  Phdlawoxox("Doctor of Philosophy in LAW","TOEFL/IELTS/GRE","No",2600000,"brown","15 October 2022",5);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref26.Country_name);
          System.out.println("Language Test Required : "+ref26.Country_exam);
          System.out.println("Scholarship Availablity : "+ref26.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref26.Country_Fees);
          System.out.println("Course Duration In Years: "+ref26.Country_duration);
          System.out.println("Course Application Start date: "+ref26.Country_appdate);
          System.out.println("Global rank of University:  #"+ref26.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Doctor of Philosophy in LAW in Oxford University");
          System.out.println(" ");
          break;
        


          case 2 :
          Country   ref27  = new Mbaox("Master of Business Administrtation","TOEFL/IELTS/GRE","Yes ",2900000,"grey-brown","15 October 2022",5);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref27.Country_name);
          System.out.println("Language Test Required : "+ref27.Country_exam);
          System.out.println("Scholarship Availablity : "+ref27.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref27.Country_Fees);
          System.out.println("Course Duration In Years: "+ref27.Country_duration);
          System.out.println("Course Application Start date: "+ref27.Country_appdate);
          System.out.println("Global rank of University: #"+ref27.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Master of Business Administrtation in Oxford University");
          System.out.println(" ");
         break;
         


           case 3 :
          Country   ref28  = new Phdox("Doctor of Philosophy","TOEFL/IELTS/GRE","No",2900000,"brown","15 October 2022",5);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref28.Country_name);
          System.out.println("Language Test Required : "+ref28.Country_exam);
          System.out.println("Scholarship Availablity : "+ref28.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref28.Country_Fees);
          System.out.println("Course Duration In Years: "+ref28.Country_duration);
          System.out.println("Course Application Start date: "+ref28.Country_appdate);
          System.out.println("Global rank of University:  #"+ref28.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Doctor of Philosphy in Oxford University");
          System.out.println(" ");
          break;


         
        case 4 :
          Country   ref29  = new Msox("Master of Science","TOEFL/IELTS/GRE","Yes",44000,"2-4 yrs","15 October 2022",5);
          System.out.println(" ");
          System.out.println("!!!!...COURSE DETAILS...!!!!");
          System.out.println(" ");
          System.out.println("Masters Course Name: "+ref29.Country_name);
          System.out.println("Language Test Required : "+ref29.Country_exam);
          System.out.println("Scholarship Availablity : "+ref29.Country_scholarship);
          System.out.println("Course Fees in : $ "+ref29.Country_Fees);
          System.out.println("Course Duration In Years: "+ref29.Country_duration);
          System.out.println("Course Application Start date: "+ref29.Country_appdate);
          System.out.println("Global rank of University:  #"+ref29.rank);

          System.out.println(" ");
          System.out.println("Thank You For Selecting Master of Science in Oxford University");
          System.out.println(" ");
         break;
         
        default: System.out.println("Enter Valid Number");
         break;
}

        break;
        
      case 5: 
      System.out.println(" ");
      System.out.println("Home Page");
      System.out.println(" ");
      break;
        
      default: System.out.println("PLEASE enter valid number");
      break;
     }
     




          System.out.println(" ");
          System.out.println("Press 1)Exit 2)Home Page");
          System.out.println(" ");
          int n2 = sc4.nextInt();
          if(n2==2)
          {
     	    System.out.println(" ");
          System.out.println("Enter 1 for U.S.A.");
          System.out.println("Enter 2 for RUSSIA");
          System.out.println("Enter 3 for  GERMANY");
          System.out.println("Enter 4 for  U.K.");
          System.out.println("Enter 5 for MAIN PAGE");
          System.out.println(" ");
          num = sc4.nextInt();
     }
     else if(n2==1)
     {
     	System.out.println("-------------Thank you for visiting our Masters Program Page------------------");
       

     	break;
     }
          
     
     }
    }
} 

