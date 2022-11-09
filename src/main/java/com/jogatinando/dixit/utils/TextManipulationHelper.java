package com.jogatinando.dixit.utils;

public class TextManipulationHelper {
    public static String getNameInitials(String name)
    {
        String[] nameParts = name.split(" ", 2);
		char[] chars = new char[2];
		if(nameParts.length > 1){
			chars[0] = nameParts[0].charAt(0);
			chars[1] = nameParts[1].charAt(0);
		}else{
			chars[0] = name.charAt(0);
			chars[1] = name.charAt(0);
		}

        return new String(chars);
    }
}
