package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class AlterListContentMenu implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nRemoving list of Integer values to the system:\n"); 
		String listName = io.getInput("\nEnter name of list to remove: "); 
		dm.removeList(listName); 
	}

}
