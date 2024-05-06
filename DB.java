import java.util.HashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DB
{
    private HashSet<Laptop> _set;

    private DB()
    {
        _set = new HashSet<>();
    }

    public static DB mockDB()
    {
        DB db = new DB();

        db._set.add(new LaptopBuilder().os(OS.LINUX).mem(16).buildLaptop());
        db._set.add(new LaptopBuilder().clr(CLR.BLACK).os(OS.WIN).buildLaptop());
        db._set.add(new LaptopBuilder().mem(32).drive(1000).buildLaptop());
        db._set.add(new LaptopBuilder().mem(8).drive(500).buildLaptop());
        db._set.add(new LaptopBuilder().mem(16).drive(1000).buildLaptop());
        db._set.add(new LaptopBuilder().mem(16).drive(500).os(OS.LINUX).clr(CLR.BLACK).buildLaptop());
        db._set.add(new LaptopBuilder().mem(32).drive(1000).os(OS.LINUX).clr(CLR.BLACK).buildLaptop());
        db._set.add(new LaptopBuilder().mem(4).drive(250).clr(CLR.WHITE).buildLaptop());
        db._set.add(new LaptopBuilder().os(OS.WIN).mem(64).drive(2000).buildLaptop());

        return db;
    }

    public HashSet<Laptop> find_os(OS os)
    {
        return _set.stream().filter(x -> x.os == os).collect(Collectors.toCollection(HashSet::new));
    }

    public void display()
    {
        for (Laptop lpt : _set)
        {
            System.out.println(lpt);
            System.out.println("");
        }
    }
}
