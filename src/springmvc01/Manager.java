package springmvc01;

/**
 * Created by chenyuchao on 2016/6/30.
 */
public class Manager  extends Employee{
    private double bound;
    public String findName()
    {
        displayName();
	System.out.println();
        return "findName()";
    }

}
