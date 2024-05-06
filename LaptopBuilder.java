import java.util.HashMap;

public class LaptopBuilder
{
    private OS _os = OS.UNKNOWN;
    private CLR _clr = CLR.UNKNOWN;
    private int _mem = 0;
    private int _drive = 0;
    
    public LaptopBuilder () {};

    public Laptop buildLaptop()
    {
        return new Laptop(_os, _clr, _mem, _drive);
    }

    public LaptopBuilder os(OS os)
    {
        this._os = os;

        return this;
    }

    public LaptopBuilder clr(CLR clr)
    {
        this._clr = clr;

        return this;
    }

    public LaptopBuilder mem(int mem)
    {
        this._mem = mem;

        return this;
    }

    public LaptopBuilder drive(int drive)
    {
        this._drive = drive;

        return this;
    }

    public static Laptop buildLaptopFromStrMap(HashMap<String, String> map, String os_key, String clr_key, String mem_key, String drive_key) throws Exception
    {
        LaptopBuilder builder = new LaptopBuilder();
        String current;

        current = map.get(os_key);
        if (current != null) builder.os(OS.fromString(current));

        current = map.get(clr_key);
        if (current != null) builder.clr(CLR.fromString(current));

        current = map.get(mem_key);
        if (current != null) builder.mem(Integer.parseInt(current));

        current = map.get(drive_key);
        if (current != null) builder.drive(Integer.parseInt(current));

        return builder.buildLaptop();
    }
}
