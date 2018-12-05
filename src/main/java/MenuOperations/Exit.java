package MenuOperations;

import Model.DataModel;
import UI.Executable;

public class Exit implements Executable {
    @Override
    public void execute(DataModel dms) {
        System.exit(0);
    }
}
