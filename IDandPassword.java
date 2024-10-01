package Project6;

import java.util.HashMap;

public class IDandPassword {

	HashMap<String, String> info = new HashMap<String, String>();
	
	IDandPassword(){
		info.put("UserName", "Password");
		info.put("Bro", "123");
		info.put("Hello", "abc");

	}
	protected HashMap<String, String> getLogin(){
		return info;
	}
}
