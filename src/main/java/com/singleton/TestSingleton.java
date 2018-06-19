package com.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		s1.setId(1);
		s2.setId(2);
		System.out.println("s1.id="+s1.getId());
		System.out.println("s2.id="+s2.getId());
		if(s1.equals(s2)){  
            System.out.println("s1,s2 是同一个对象");  
        }else{ 
            System.out.println("s1,s2 不是同一个对象");  
        }  
	}

}
