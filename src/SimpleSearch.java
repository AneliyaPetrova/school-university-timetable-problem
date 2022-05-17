
public class SimpleSearch extends Search {

	private Solution solution;
	private int countNonimprovements;
	private int maxNonimprovements = 100000;
	private Integer cost;
	private int countStep;
	
	public SimpleSearch(Solution initialSolution, boolean outputInfo) {
		super(outputInfo);
		this.solution = initialSolution;
		this.cost = initialSolution.getCost();
		output("Initial cost: " + this.cost);
	}
	
	public void iterate() {
		this.countStep++;
		Action randomAction = new RandomAction(this.solution);
    	Integer newCost = randomAction.execute();
    	
	}
	

	
	public Solution getBestSolution() {
		return this.solution;
	}
	
}
