package techpanda.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TechPandaTask1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://live.techpanda.org/");
		//driver.manage().window().maximize();
		int a=10; int b=30;
		System.out.println(a+b);
		int c=20; int d=80;
		System.out.println(d+d);
		String expectTitle="Home page";
		String actlTitle=driver.getTitle();
		if(expectTitle.equals(actlTitle)) {
			System.out.println("test case1 pass");
		}
		else {
			System.out.println("test case1 fail");
		}
		driver.findElement(By.xpath("(//a[@class='level0 '])[1]")).click();
		String expTitle="Mobile";
		String actTitle=driver.getTitle();
		if(expTitle.equals(actTitle)) {
			System.out.println("test case2 pass");
		}
		else {
			System.out.println("test case2 fail");
		}
		WebElement sortby= driver.findElement(By.xpath("(//select[@onchange='setLocation(this.value)'])[1]"));
		Select dropdown=new Select(sortby);
		dropdown.selectByVisibleText("Name");
		List<String> expElement = new ArrayList<String>();
		expElement.add("IPHONE");
		expElement.add("SAMSUNG GALAXY");
		expElement.add("SONY XPERIA");
		
		
		List<WebElement> li=new LinkedList(driver.findElements(By.xpath("//h2[@class='product-name']/a")));    
        LinkedList<String> pn=new LinkedList<String>();    
        for(int i=0;i<li.size();i++)    
        {    
             //just displaying the product names    
            //System.out.println(li.get(i).getText());    
            pn.add(li.get(i).getText());    
        }    
        boolean result = comp_order(pn);    

//you need to add one more method    

//alphabetical order checki*/
        comp_order(LinkedList<String> pn)    
        {           
        	
        	
            String prev=""; // empty string    
            for (final String cur: pn)    
            {    
                if (cur.compareTo(prev) < 0)    
                {      
                    return false;     
                }    
                prev=cur;    
            }    
            return true;    
            }
//hello world
		
		
		
				
		
		
		
		
	}

}
