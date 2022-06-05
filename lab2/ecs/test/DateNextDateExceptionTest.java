import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;




@RunWith(Parameterized.class)
public class DateNextDateOkTest
{

    private int year; 
	private int month; 
	private int day; 
	private int year2; 
	private int month2; 
	private int day2; 

    public  DateNextDateOkTest(int year, int month, int day, int year2, int month2, int day2){
		this.year = year;
        this.month = month;
        this.day = day;
        this.year2 = year2;
        this.month2 = month2;
        this.day2 = day2;

	}

	public int getYear() return year;
	public int getMonth() return month;
	public int getDay() return day;


    @Parameters
	public static List<Integer[]> mainTest()
	{
		List<Integer[]> tests = new LinkedList<Integer[]>();
		tests.add(new Integer[] {1700,06,20,1700,06,21});
        tests.add(new Integer[] {2005,4,15,2005,4,16}); 
        tests.add(new Integer[] {1901,7,20,1901,7,21}); 
        tests.add(new Integer[] {3456,3,27,3456,3,28}); 
        tests.add(new Integer[] {1500,2,17,1500,2,18}); 
        tests.add(new Integer[] {1700,6,29,1700,6,30}); 
        tests.add(new Integer[] {1800,11,29,1800,11,30}); 
        tests.add(new Integer[] {3453,1,29,3453,1,30}); 
        tests.add(new Integer[] {444,2,29,444,3,1}); 
        tests.add(new Integer[] {2005,4,30,2005,5,1}); 
        tests.add(new Integer[] {3453,1,30,3453,1,31}); 
        tests.add(new Integer[] {3456,3,30,3456,3,31}); 
        tests.add(new Integer[] {1901,7,31,1901,8,1}); 
        tests.add(new Integer[] {3453,1,31,3453,2,1}); 
        tests.add(new Integer[] {3456,12,31,3457,1,1}); 
		return tests;
	}

    @Test
	public void testNextDateOK(){

        Date x = new Date(year,month,day);
        Date a = x.nextDate();
        Assert.assertEquals(year2, a.getYear());
        Assert.assertEquals(month2, a.getMonth());
        Assert.assertEquals(day2, a.getDay());

	
	}


}