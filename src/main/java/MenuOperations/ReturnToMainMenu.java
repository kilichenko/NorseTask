package MenuOperations;

import Model.DataModel;
import UI.Executable;
import UI.Menu;

public class ReturnToMainMenu implements Executable {
    @Override
    public void execute(DataModel dm) {
        Menu menu = new Menu(dm);
        menu.addOperation("Print data", new PrintData());
        menu.addOperation("Exit", new Exit());
        menu.run();
    }
}
