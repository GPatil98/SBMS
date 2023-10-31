package in.ganesh.fiaservices;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ganesh.fiaentity.Citizen_Plan;
import in.ganesh.fiarequest.SearchRequest;

@Service
public interface ReportService {

	public List<String> getPlanName();
	
	public List<String> getPlanStatus();
	
	public List<Citizen_Plan> search (SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportEmail();
}
