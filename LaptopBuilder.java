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
}
