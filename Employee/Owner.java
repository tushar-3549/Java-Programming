package Employee;

public class Owner extends Employee {
	int hr,ta;
	Owner(){
		super();
		hr=ta=0;
	}
	Owner(int n,int sal,int h,int t){
		super(n,sal);
		
		hr=h;
		ta=t;
	}
	int getSalary() {
		return (super.getSalary()+hr+ta+super.getBunus());
	}
    
}
