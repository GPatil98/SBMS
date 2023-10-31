package in.ganesh.fiarunner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.mail.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ganesh.fiaentity.Citizen_Plan;
import in.ganesh.fiarepo.CitizenPlanRepo;


@Component()
public class DataLoader  implements ApplicationRunner{
	
	@Autowired
	private  CitizenPlanRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//Cash plan Date
				Citizen_Plan c1=new Citizen_Plan();
				c1.setCitizenName("john");
				c1.setGender("Male");
				c1.setPlanName("Cash");
				c1.setPlanStatus("Approval");
				c1.setPlanEnd_Date(LocalDate.now());
				c1.setPlanEnd_Date(LocalDate.now().plusMonths(6));
				c1.setBenifit_Amt(50000.00);
				
				Citizen_Plan c2=new Citizen_Plan();
				c2.setCitizenName("Smith");
				c2.setGender("Male");
				c2.setPlanName("Cash");
				c2.setPlanStatus("Denied");
				c2.setDenial_Reson("Rent Income");
				
				Citizen_Plan c3=new Citizen_Plan();
				c3.setCitizenName("Cathy");
				c3.setGender("Fe-Male");
				c3.setPlanName("Cash");
				c3.setPlanStatus("Terminated");
				c3.setPlanEnd_Date(LocalDate.now().minusMonths(4));
				c3.setPlanEnd_Date(LocalDate.now().plusMonths(6));
				c3.setBenifit_Amt(50000.00);
				c3.setTerminated_Date(LocalDate.now());
				c3.setTermination_Reson("Employeed");
				
				//Food Plan Data
				Citizen_Plan c4=new Citizen_Plan();
				c4.setCitizenName("David");
				c4.setGender("Male");
				c4.setPlanName("Food");
				c4.setPlanStatus("Approval");
				c4.setPlanEnd_Date(LocalDate.now());
				c4.setPlanEnd_Date(LocalDate.now().plusMonths(6));
				c4.setBenifit_Amt(4000.00);
				
				Citizen_Plan c5=new Citizen_Plan();
				c5.setCitizenName("Robert");
				c5.setGender("Male");
				c5.setPlanName("Food");
				c5.setPlanStatus("Denied");
				c5.setDenial_Reson("Property Income");
				
				Citizen_Plan c6=new Citizen_Plan();
				c6.setCitizenName("Orlen");
				c6.setGender("Fe-Male");
				c6.setPlanName("Food");
				c6.setPlanStatus("Terminated");
				c6.setPlanEnd_Date(LocalDate.now().minusMonths(4));
				c6.setPlanEnd_Date(LocalDate.now().plusMonths(6));
				c6.setBenifit_Amt(5000.00);
				c6.setTerminated_Date(LocalDate.now());
				c6.setTermination_Reson("Employeed");
				
				//Medical Plan Data
						Citizen_Plan c7=new Citizen_Plan();
						c7.setCitizenName("Charles");
						c7.setGender("Male");
						c7.setPlanName("Medical");
						c7.setPlanStatus("Approval");
						c7.setPlanEnd_Date(LocalDate.now());
						c7.setPlanEnd_Date(LocalDate.now().plusMonths(6));
						c7.setBenifit_Amt(4000.00);
						
						Citizen_Plan c8=new Citizen_Plan();
						c8.setCitizenName("Buttler");
						c8.setGender("Male");
						c8.setPlanName("Food");
						c8.setPlanStatus("Denied");
						c8.setDenial_Reson("Property Income");
						
						Citizen_Plan c9=new Citizen_Plan();
						c9.setCitizenName("Neel");
						c9.setGender("Fe-Male");
						c9.setPlanName("Medical");
						c9.setPlanStatus("Terminated");
						c9.setPlanEnd_Date(LocalDate.now().minusMonths(4));
						c9.setPlanEnd_Date(LocalDate.now().plusMonths(6));
						c9.setBenifit_Amt(5000.00);
						c9.setTerminated_Date(LocalDate.now());
						c9.setTermination_Reson("Govt job");
						
						
						//Employment Plan Data
						Citizen_Plan c10=new Citizen_Plan();
						c10.setCitizenName("Steven");
						c10.setGender("Male");
						c10.setPlanName("Employment");
						c10.setPlanStatus("Approval");
						c10.setPlanEnd_Date(LocalDate.now());
						c10.setPlanEnd_Date(LocalDate.now().plusMonths(6));
						c10.setBenifit_Amt(4000.00);
						
						Citizen_Plan c11=new Citizen_Plan();
						c11.setCitizenName("Moris");
						c11.setGender("Male");
						c11.setPlanName("Employment");
						c11.setPlanStatus("Denied");
						c11.setDenial_Reson("Property Income");
						
						Citizen_Plan c12=new Citizen_Plan();
						c12.setCitizenName("Gibs");
						c12.setGender("Fe-Male");
						c12.setPlanName("Employment");
						c12.setPlanStatus("Terminated");
						c12.setPlanEnd_Date(LocalDate.now().minusMonths(4));
						c12.setPlanEnd_Date(LocalDate.now().plusMonths(6));
						c12.setBenifit_Amt(5000.00);
						c12.setTerminated_Date(LocalDate.now());
						c12.setTermination_Reson("Govt job");
						
						List<Citizen_Plan> l1 =Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
						
						repo.saveAll(l1);
						Session close;
						
	}
	
	

}
