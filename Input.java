import java.util.Scanner;

public class Input
{
    private String query;
    private String val;

    private Input(String query, String val)
    {
        this.query = query;
        this.val = val;
    }

    public static Input getInput()
    {
        String query;
        String val;
        Scanner scanner = new Scanner(System.in);

        query = scanner.nextLine().toLowerCase();
        val = scanner.nextLine().toLowerCase();
        scanner.close();

        return new Input(query, val);
    }

    public String getQuery()
    {
        return query;
    }

    public String getVal()
    {
        return val;
    }

    public String toString()
    {
        return this.query + " " + this.val;
    }
}
