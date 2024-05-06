public class Program
{
    public static void main(String[] args)
    {
        DB db = DB.mockDB();
    
        // db.display();
        HashSet<Laptop> x = db.find_os(OS.LINUX);
        
        for (Laptop lpt : x)
        {
            System.out.println(lpt);
        }
    }   
}
