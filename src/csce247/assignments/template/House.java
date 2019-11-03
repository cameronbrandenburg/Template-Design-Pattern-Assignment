package csce247.assignments.template;

/**
 * Base class that is the template for all types of houses
 * @author Cameron Brandenburg
 */
public abstract class House {

	/**
	 * Preps the foundation to the house
	 */
	public void prepFoundation() {
		System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");
	}
	
	/**
	 * Abstract method to create different types of house frames - implemented in subclasses
	 */
	public abstract void createFrame();
	
	/**
	 * Installs the drywall to the house
	 */
	public void installDrywall() {
		System.out.println("Drywall: Creating the interrior walls.");
	}
	
	/**
	 * Adds windows to the house
	 */
	public void addWindows() {
		System.out.println("Windows: Putting in the glass for the windows.");
	}
	
	/**
	 * Adds electrical to the house
	 */
	public void addElectrical() {
		System.out.println("Electrical: Running all the wires and hooking up the power.");
	}
	
	/**
	 * Adds plumbing to the house
	 */
	public void addPlumbing() {
		System.out.println("Plumbing: Letting water run through the house.");
	}
	
	/**
	 * Builds the house by calling all necessary methods to construct it
	 */
	public void buildHouse() {
		prepFoundation();
		createFrame();
		installDrywall();
		addWindows();
		addElectrical();
		addPlumbing();
	}
}
