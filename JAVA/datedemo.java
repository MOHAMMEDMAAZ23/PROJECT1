import java.util.Calendar;

public class datedemo
{
public static void main(String[]args)
{
Calendar now= Calendar.getInstance();
String[]MONTH={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
System.out.println("Current Month is:"+MONTH[now.get(Calendar.MONTH)]);
}
}