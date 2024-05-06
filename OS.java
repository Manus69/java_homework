public enum OS
{
    UNKNOWN,
    WIN,
    LINUX;

    public static OS fromString(String str) throws Exception
    {
        str = str.toLowerCase();

        if (str.equals("linux")) return LINUX;
        if (str.equals("win") || str.equals("windows")) return WIN;
        if (str.equals("unknown")) return UNKNOWN;

        throw new Exception("Invalid OS value");
    }
}
