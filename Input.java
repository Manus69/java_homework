public class Input
{
    private String query;
    private String val;

    private Input(String query, String val)
    {
        this.query = query;
        this.val = val;
    }

    public static Input getInput(String quit)
    {
        String query;
        String val;

        query = System.console().readLine().toLowerCase();
        if (query.equals(quit)) return new Input(query, "");

        val = System.console().readLine().toLowerCase();

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
