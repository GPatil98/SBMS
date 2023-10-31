package in.ganesh.fiarepo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import in.ganesh.fiaentity.Citizen_Plan;


public interface CitizenPlanRepo extends JpaRepository<Citizen_Plan, Serializable>
{
	@Query("select distinct (planName) from citizenPlan")
	public List<String> getPlanName	();
	
	
	@Query("select distinct (planStatus) from citizenPlan")
	public List<String> getPlanStatus();

}
