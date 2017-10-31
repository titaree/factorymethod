
public class GetPlanFactory {
	//Use getPlan method to get object of type Plan
	public plan getPlan(String planType){
		if(planType==null){
			return null;
		}
		if(planType.equalsIgnoreCase("DOM")){
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("COM")){
			return new CommercialPlan();
		}
			else if(planType.equalsIgnoreCase("INS")){
				return new InstitutionalPlan();
			}
return null;
	}
	}//end of GetPlanFactory calss
