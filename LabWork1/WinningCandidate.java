
public class WinningCandidate {

	public static void main(String[] args) 
	{
		double candidate1=1136;
		double candidate2=7636;
		double candidate3=11628;
		double total_candidate_vote=candidate1+candidate2+candidate3;
		double percentage;
		percentage=(candidate3/total_candidate_vote)*100;
		System.out.println("The winning candidate get"+percentage);
	}

}
