import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
	 while(num>10){
		 digitList.add(0,num%10);
		 num = num/10;
	 }
		digitList.add(0,num);
	}

	public boolean isStrictlyIncreasing()
	{
	for(int i = 0; i < digitList.size()-1; i++){
		if(!(digitList.get(i)<digitList.get(i+1))){
			return false;}}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
