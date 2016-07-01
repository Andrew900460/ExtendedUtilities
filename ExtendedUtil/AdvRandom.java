package ExtendedUtil;
import java.lang.Math;
import java.util.Random;
public class AdvRandom extends Random{
	public static AdvRandom r = new AdvRandom();
	public static int spin(int[] chance){
		int arrayValue = 0;
		for(int x : chance)
			arrayValue += x;
		int rand = (int) Math.abs(r.nextInt(arrayValue));
		int subTotal = 0;
		for(int x = 0;x<=chance.length-1;x++){
			if(rand<chance[x]+subTotal){
				subTotal = x;
				x = chance.length-1;
			}
			else{
				subTotal += chance[x];
			}
		}
		return subTotal;
	}

	public static int RangeInt(int low,int high){
		return (int)RangeDouble(low,high);
	}

	public static double RangeDouble(double low,double high){
		return AdvMath.lerp(low,high,Math.random());
	}

	public static double Double(int high){
		return RangeDouble(0,high);
	}

	/*
	 * public int percent(int[] percents) { byte arrayValue = 0; for (int x :
	 * percents) arrayValue+=x; if (arrayValue!=100) {return 0;}
	 * 
	 * 
	 * 
	 * return 0; }
	 */
}