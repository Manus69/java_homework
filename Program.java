import java.util.HashSet;

public class Program
{
    private static String _os = "os";
    private static String _clr = "color";
    private static String _mem = "memory";
    private static String _drive = "drive";
    private static String _err_msg = "Invalid input";
    private static String _quit = "quit";
    private static String _usage_msg = "Enter query followed by a value or '" + _quit + "' to exit.";

    private static void display(HashSet<Laptop> selection)
    {
        System.out.println();
        
        for (Laptop lpt : selection)
        {
            System.out.println(lpt);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Input input;
        DB db = DB.mockDB();
        HashSet<Laptop> selection;
    
        while (true)
        {
            try
            {
                input = Input.getInput(_quit);
                
                if (input.getQuery().equals(_quit)) break;
                else if (input.getQuery().equals(_os)) selection = db.findOS(OS.fromString(input.getVal()));
                else if (input.getQuery().equals(_clr)) selection = db.findCLR(CLR.fromString(input.getVal()));
                else if (input.getQuery().equals(_mem)) selection = db.findMem(Integer.parseInt(input.getVal()));
                else if (input.getQuery().equals(_drive)) selection = db.findDrive(Integer.parseInt(input.getVal()));
                else
                {
                    System.out.println(_err_msg);
                    System.out.println(_usage_msg);
                    continue;
                }

                display(selection);
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }   
}
