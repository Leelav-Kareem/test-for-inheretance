class ParentRecodedTest
{
	private int style;
	private String color;
	public int getStyle()
	{
		return style;
	}
	public void setStyle(int styleHatw)
	{
		style=styleHatw;
	}
	public String getColor()
	{
		return color;
	}
	public void  setColor(String colorHatw)
	{
		color=colorHatw;
	}
	public void setColor()
	{
		color=null;
	}
	public final String clothesCompanyName="tita";
	public int priceMultiplieNumbers(int priceHatw,int numberHatw)
	{
		//Use a more descriptive variable name
		int price=priceHatw;
		int number =numberHatw;
		return (price*number);
	}

}
