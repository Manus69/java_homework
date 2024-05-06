public enum CLR
{
    UNKNOWN,
    WHITE,
    BLACK;

    public static CLR fromString(String str) throws Exception
    {
        str = str.toLowerCase();

        if (str.equals("white")) return WHITE;
        if (str.equals("black")) return BLACK;
        if (str.equals("unknown")) return UNKNOWN;

        throw new Exception("Unexpected color value");
    }
}
