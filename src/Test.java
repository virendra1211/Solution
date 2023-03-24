import java.util.ArrayList;

class Test
{   int count = 0;
    void A() throws Exception
    {
        try
        {
            count++;          
            try
            {
                count++;
                try
                {
                    count++;
                    throw new Exception();
 
                }
                catch(Exception ex)
                {
                    count++;
                    throw new Exception();
                }
            }
            catch(Exception ex)
            {
                count++;
            }
        }
        catch(Exception ex)
        {
            count++;
        }
    }
    void display()
    {
        System.out.println(count);
    }
    public static void main(String[] args) throws Exception
    {
    	   short x = 10;
           x =  x * 5;
           System.out.print(x);
        ArrayList obj = new ArrayList();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add(1, "D");
        System.out.println(obj);
    }
}