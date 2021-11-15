interface i {
   public void show();
}
class test implements i
{
    public void show()
    {
        System.out.println("Anjali");
    }

    public static void main(String[] args)
    {
        test t = new test();
        t.show();
    }
}/* interface is similar to abstract class but having all the method of abstract type.
    we  cannot create the object of the interface.

