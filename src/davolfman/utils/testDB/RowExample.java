package davolfman.utils.testDB;

import java.io.Serializable;
import java.util.UUID;
import java.util.ArrayList;

public class RowExample implements Serializable {

	/**
	 * Version 1 serialization
	 */
	private static final long serialVersionUID = 1L;

	UUID myUUID;
	ArrayList<String> payload;
	
	public String getIDString(){
		return myUUID.toString();
	}
	
	public UUID getID(){
		return myUUID;
	}
	
	public void add(String newstr){
		payload.add(newstr);
		//payload.remove(index);
		//payload.remove(findstr)
	}
	
	public int size(){
		return 	payload.size();
	}
	
	public String get(int index){
		return payload.get(index);
	}
	
	public void clear(){
		payload.clear();	
	}
	
	public boolean contains(String findstr){
		return payload.contains(findstr);		
	}
	
	public String remove(int index){
		return payload.remove(index);
	}
	
	public boolean remove(String s){
		return payload.remove(s);
	}
}
