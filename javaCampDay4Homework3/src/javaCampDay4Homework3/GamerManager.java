package javaCampDay4Homework3;

import Entities.Gamer;

public class GamerManager implements GamerService{

	GamerValidationManager gamerValidationManager = new GamerValidationManager();
	
	public GamerManager(GamerValidationManager gamerValidationManager) {
		super();
		this.gamerValidationManager = gamerValidationManager;
	}

	
	@Override
	public void add(Gamer gamer) {
		
		if(gamerValidationManager.gamerValidate(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " named gamer was added!" );
			}
			else {
				System.out.println("Please, Control the informations");
			}
			
		}
		
	

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "was deleted");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "was updated");
		
	}

}
