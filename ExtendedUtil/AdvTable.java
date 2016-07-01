package ExtendedUtil;

import java.util.ArrayList;

public class AdvTable{
	private ArrayList<Object> value = new ArrayList<Object>();
	private ArrayList<String> key = new ArrayList<String>();
	
	public Object add(String key,Object value){
		this.value.add(value);
		this.key.add(key);
		return value;
	}
	
	public Object remove(String key){
		int index = this.key.indexOf(key);
		this.key.remove(index);
		return value.remove(index);
	}
	
	public Object get(String key){
		return value.get(this.key.indexOf(key));
	}
	
}
