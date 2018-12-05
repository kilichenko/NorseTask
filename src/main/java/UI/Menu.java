package UI;

import Model.DataModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<MenuOperation> operations = new ArrayList<MenuOperation>();
    private DataModel dm;

    public Menu(DataModel dm){
        this.dm = dm;
    }

    public void run(){
        int choice;
        printOperations();
        do
        {
            choice = getInt();
            if (choice <= 0 || choice > operations.size())
            {
                System.out.println("Invalid number =)");
            }
        } while (choice <= 0 || choice > operations.size());
        operations.get(choice - 1).execute(dm);
    }

    public void addOperation(String name, Executable operation){
        operations.add(new MenuOperation(name, operation));
    }

    private void printOperations(){
        int i = 0;
        for (MenuOperation mo : operations){
            System.out.println(++i + ". " + mo.getName());
        }
    }

    public static int getInt(int lowerBound, int upperBound){
        int res = getInt();
        if(res < lowerBound || res > upperBound){
            System.out.println("Not a right number =)");
            return getInt(lowerBound, upperBound);
        }
        else{
            return res;
        }
    }

    public static int getInt(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int res;

        try{
            res = Integer.parseInt(str);
            return res;
        } catch (Exception e) {
            System.out.println("Invalid input!");
            return getInt();
        }
    }

    private static class MenuOperation{
        private String name;
        private Executable operation;

        private MenuOperation(String name, Executable operation) {
            this.name = name;
            this.operation = operation;
        }

        public String getName() {
            return name;
        }

        public void execute(DataModel dm){
            operation.execute(dm);
        }
    }
}
