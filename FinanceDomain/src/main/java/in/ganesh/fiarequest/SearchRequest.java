package in.ganesh.fiarequest;

import java.time.LocalDate;

import lombok.Data;


@Data
public class SearchRequest {
	
	private String PlanName;
	private String PlanStatus;
	private String gender;
	private LocalDate StartDate;
	private LocalDate EndtDate;

}
