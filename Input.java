import java.util.Arrays;
import java.util.HashMap;

public class Input
{
    private static String _invalid_str = "Invalid field name.";
    private static String _valid_msg = "Valid names are: ";
    private HashMap<String, String> _input;

    private Input()
    {
        _input = new HashMap<String, String>();
    }

    public static Input getInput(String[] valid_names)
    {
        String field;
        String val;
        Input input = new Input();

        while (true)
        {
            field = System.console().readLine().toLowerCase();
            if (field.length() == 0) break;
            if (! Arrays.stream(valid_names).anyMatch(field::equals))
            {
                System.out.println(_invalid_str);
                System.out.print(_valid_msg);
                System.out.println(String.join(", ", valid_names));
                continue;
            }

            val = System.console().readLine().toLowerCase();
            input._input.put(field, val);
        }

        return input;
    }

    public String get(String field)
    {
        return _input.get(field);
    }

    public HashMap<String, String> getMap()
    {
        return _input;
    }

    public void dbg()
    {
        for (HashMap.Entry<String, String> entry : _input.entrySet())
        {
            System.out.printf("%s : %s\n", entry.getKey(), entry.getValue());
        }
    }
}
