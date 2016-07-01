package ExtendedUtil;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

public class ImageStore {
	
	private ArrayList<Image> images = new ArrayList<Image>();
	private ArrayList<String> NameTags = new ArrayList<String>();
	
	public ImageStore(){}
	
	public void addImage(String image_directory,String string_name){
		try{
			images.add(Toolkit.getDefaultToolkit().getImage(image_directory));
		}catch(Exception e){
			System.out.println("IMAGE FAILED TO LOAD: \'"+image_directory+"\'");
		}
		NameTags.add(string_name);
	}
	
	public Image LoadImage(String n){
		return images.get(NameTags.indexOf(n));
	}
	
	public static Image getImage(String directory){
		return Toolkit.getDefaultToolkit().getImage(directory);
	}
}
