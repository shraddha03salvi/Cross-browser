package KeywordDriven_Framework;

public class Excution {

	public static void main(String[] args) {
		String path ="";
		ExcelUtility.setExcel(path,1);
		
		for(int i=0;i<=4;i++) 
		{
			String keyword = ExcelUtility.getData(i,4);
			
			if(keyword.equals("OpenBrowser")) 
			{
				ActionKeywords.OpenBrowser();
				
			}
			else if(keyword.equals("navigate")) 
			{
				ActionKeywords.navigate();
				
			}
			else if(keyword.equals("Sendkeys_Textfield")) 
			{
				ActionKeywords.Sendkeys_Textfield();
				
			}
			
			else if(keyword.equals("Click")) 
			{
				ActionKeywords.Click();
				
			}
		}
	}

}
