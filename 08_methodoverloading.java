//Method Overloading
class Addition
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
class Overload
{
    public static void main(String args[])
    {
        System.out.println("a+b:"+Addition.add(12,18));
        System.out.println("a+b+c:"+Addition.add(12,18,8));
        
    }
}
