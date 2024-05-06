import java.util.HashSet;

public class Program
{
    private static String _os = "os";
    private static String _clr = "color";
    private static String _mem = "memory";
    private static String _drive = "drive";
    private static String _usage_msg = "Enter a field name followed by a value. An empty line stops the input.";
    private static String _empty_msg = "Nothing was found.";

    private static void display(HashSet<Laptop> selection)
    {
        if (selection.size() == 0) 
        {
            System.out.println(_empty_msg);
            return ;
        }

        System.out.println();

        for (Laptop lpt : selection)
        {
            System.out.println(lpt);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Input           input;
        Laptop          laptop;
        HashSet<Laptop> selection;

        DB db = DB.mockDB();
    
        try
        {
            input = Input.getInput(new String[]{_os, _clr, _mem, _drive});
            laptop = LaptopBuilder.buildLaptopFromStrMap(input.getMap(), _os, _clr, _mem, _drive);
            selection = db.find(laptop);
            display(selection);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(_usage_msg);
        }
    }   
}
