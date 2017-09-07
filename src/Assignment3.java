abstract class Employee{
	int empid;
	String empName;
	int total_leaves;
	double total_salary;
	abstract void calculate_balance_leave();
	abstract boolean avail_leave(int no_of_leaves,char type_of_leave);
	abstract void claculate_salary();
}

class PermanenetEmp extends Employee{
	int empid=101;
	String empName="Sourav Majumdar";
	char p,s,c;
	int total_leaves=23,paid_leave=15,sick_leave=5,casual_leave=3;
	int paid_leave_taken=10;
	int sick_leave_taken=1;
	int casual_leave_taken=3;
	int paid_leave_left,sick_leave_left,casual_leave_left,total_leave_left;
	
	double total_salary,basic=15000,hra=4500.50,pf;
	public void emp_info(){
		System.out.println("Details of Permanent employee is following :");
		System.out.println("Name :"+empName +"  Employee_id :"+empid);
	}
	public void print_leave_details(){
		System.out.println("Leave Details");
		System.out.println("Toatal leaves :"+total_leaves);
		System.out.println("paid_leave :"+paid_leave+"  sick_leave : "+sick_leave+"  casual_leave :"+ casual_leave);
	}
	public void calculate_balance_leave(){
		paid_leave_left=paid_leave-paid_leave_taken;
		System.out.println("Paid leave left :"+paid_leave_left);
		sick_leave_left=sick_leave-sick_leave_taken;
		System.out.println("Sick leave left :"+sick_leave_left);
		casual_leave_left=casual_leave-casual_leave_taken;
		System.out.println("Casual leave left :"+casual_leave_left);
		total_leave_left=total_leaves-(paid_leave_taken+sick_leave_taken+casual_leave_taken);
		System.out.println("Total leave left :"+total_leave_left);
	}
	public boolean avail_leave(int no_of_leaves,char type_of_leave){
		if(type_of_leave==p && no_of_leaves>paid_leave_left){
			return false;
		}
		else if(type_of_leave==p && no_of_leaves<paid_leave_left){
		return true;
	    }
		else if(type_of_leave==s && no_of_leaves>sick_leave_left){
			return false;
		    }
		else if(type_of_leave==s && no_of_leaves<sick_leave_left){
			return true;
		    }
		else if(type_of_leave==c && no_of_leaves>paid_leave_left){
			return false;
		    }
		else if(type_of_leave==c && no_of_leaves<paid_leave_left){
			return true;
		    }
		else
	     return false;
	}
	public void claculate_salary(){
		pf=.5*basic;
		total_salary=basic+hra-pf;
		System.out.println("Total Salary :"+total_salary);
	  }
}
	
	
	class TemporayEmp extends Employee{
		int empid=102;
		String empName="Arup Nandi";
		char pl='p',sl='s',cl='c';
		int total_leaves=23,paid_leave=15,sick_leave=5,casual_leave=3;
		int paid_leave_taken=10;
		int sick_leave_taken=1;
		int casual_leave_taken=3;
		int paid_leave_left,sick_leave_left,casual_leave_left,total_leave_left;
		
		double total_salary,basic=13000,hra=2500.50,pf;
		public void emp_info(){
			System.out.println("Details of Temporary employee is following :");
			System.out.println("Name :"+empName +"  Employee_id :"+empid);
		}
		public void print_leave_details(){
			System.out.println("Leave Details");
			System.out.println("Toatal leaves :"+total_leaves);
			System.out.println("paid_leave :"+paid_leave+"  sick_leave : "+sick_leave+"  casual_leave :"+ casual_leave);
		}
		public void calculate_balance_leave(){
			paid_leave_left=paid_leave-paid_leave_taken;
			System.out.println("Paid leave left :"+paid_leave_left);
			sick_leave_left=sick_leave-sick_leave_taken;
			System.out.println("Sick leave left :"+sick_leave_left);
			casual_leave_left=casual_leave-casual_leave_taken;
			System.out.println("Casual leave left :"+casual_leave_left);
			total_leave_left=total_leaves-(paid_leave_taken+sick_leave_taken+casual_leave_taken);
			System.out.println("Total leave left :"+total_leave_left);
		}
		public boolean avail_leave(int no_of_leaves,char type_of_leave){
			if(type_of_leave==pl && no_of_leaves>paid_leave_left){
				return false;
			}
			else if(type_of_leave==pl && no_of_leaves<paid_leave_left){
			return true;
		    }
			else if(type_of_leave==sl && no_of_leaves>sick_leave_left){
				return false;
			    }
			else if(type_of_leave==sl && no_of_leaves<sick_leave_left){
				return true;
			    }
			else if(type_of_leave==cl && no_of_leaves>paid_leave_left){
				return false;
			    }
			else if(type_of_leave==cl && no_of_leaves<paid_leave_left){
				return true;
			    }
			else
		     return false;
		}
		public void claculate_salary(){
			pf=.5*basic;
			total_salary=basic+hra-pf;
			System.out.println("Total Salary :"+total_salary);
		}
}
public class Assignment3 {
      public static void main(String args[]){
    	  PermanenetEmp pm=new PermanenetEmp();
    	  pm.emp_info();
    	  pm.print_leave_details();
    	  pm.calculate_balance_leave();
    	  boolean avail_leave=pm.avail_leave(6,'s');
    	  if(avail_leave==false){
    		  System.out.println(pm.empName+" cant take leave");
    	  }
    	  else{
    		  System.out.println(pm.empName+" can take leave");
    	  }
    	  pm.claculate_salary();
    	  TemporayEmp tm=new TemporayEmp();
    	  tm.emp_info();
    	  tm.print_leave_details();
    	  tm.calculate_balance_leave();
    	  boolean avail_leave_t=tm.avail_leave(3, 'p');
    	  if(avail_leave_t==false){
    		  System.out.println(tm.empName+" cant take leave");
    	  }
    	  else{
    		  System.out.println(tm.empName+" can take leave");
    	  }
    	  tm.claculate_salary();
      }
}
