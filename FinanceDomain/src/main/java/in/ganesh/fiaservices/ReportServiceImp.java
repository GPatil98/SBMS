package in.ganesh.fiaservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ganesh.fiaentity.Citizen_Plan;
import in.ganesh.fiarepo.CitizenPlanRepo;
import in.ganesh.fiarequest.SearchRequest;
@Service("ReportService")
public class ReportServiceImp implements ReportService {
	
	
	@Autowired
	private CitizenPlanRepo cprepo;

	@Override
	public List<String> getPlanName() {
	
		
		return null;
	}

	@Override
	public List<String> getPlanStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Citizen_Plan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportEmail() {
		// TODO Auto-generated method stub
		return false;
	}

}
