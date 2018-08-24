class Vehicle
{
public void start()
{
System.out.println("Start Vehicle...");
}
public void stop()
{
System.out.println("Stop Vehicle...");
}
}
class twowheeler extends Vehicle
{
public void start()
{
System.out.println("Start TwoWheeler...");
}
public void stop()
{
System.out.println("Stop TwoWheeler...");
}
}
class fourwheeler extends Vehicle
{
public void start()
{
System.out.println("Start FourWheeler...");
}
public void stop()
{
System.out.println("Stop FourWheeler...");
}
}
class Abstract
{
public static void main(String args[])
{
twowheeler t=new twowheeler();
fourwheeler f=new fourwheeler();
t.start();
t.stop();
f.start();
f.stop();
}
}