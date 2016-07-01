package ExtendedUtil;
public class AdvMath{
	public static double roundMoney(double value){
		return round(value,2);
	}
	public static double round(double value,int places){
		double mult = Math.pow(10,places);
		return Math.floor(value*mult+0.5)/mult;
	}
	public static double lerp(double low,double high,double ratio){
		return low+((high-low)*ratio);
	}
}
