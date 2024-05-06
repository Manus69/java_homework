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

    public static void main(String[] args)
    {
        Input input;
        DB db = DB.mockDB();
    
        while (true)
        {
            input = Input.getInput();
            
            if (input.getQuery() == _quit) break;

        }
    }   
}
