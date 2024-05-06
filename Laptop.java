public class Laptop
{
    OS  os;
    CLR clr;
    int mem;
    int drive;

    public Laptop(OS os, CLR clr, int mem, int drive)
    {
        this.os = os;
        this.clr = clr;
        this.mem = mem;
        this.drive = drive;
    }

    public boolean equals(Laptop lpt)
    {
        return this.os == lpt.os && this.clr == lpt.clr && this.mem == lpt.mem && this.drive == lpt.drive;
    }

    public int hashCode()
    {
        return os.hashCode() + clr.hashCode() + mem + drive;
    }

    public String toString()
    {
        return "OS: " + this.os.name() + "\n" + 
                "Color: " + this.clr.name() + "\n" + 
                "Memory: " + String.valueOf(mem) + "\n" + 
                "Drive: " + String.valueOf(drive);
    }
}