package springmvc01;

/**
 * Created by chenyuchao on 2016/6/30.
 */
public class Employee {
    private String name;
    public String displayName()
    {
        System.out.println("displayName()");
        return "displayName";
    }

}
