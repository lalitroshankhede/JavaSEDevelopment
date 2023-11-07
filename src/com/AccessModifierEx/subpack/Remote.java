package com.AccessModifierEx.subpack;

import com.AccessModifierEx.TV;

public class Remote extends TV {

	@Override
	 protected void getRemote()
	 {
		 System.out.println("Smart TV Remote");
	 }

	public static void main(String[] args) {

		Remote obj=new Remote();
		obj.getRemote();
	}
}
