package com.singleton;

public class Singleton {
	private int id;
	private volatile static Singleton instance=null;
	
	/**
	 * 防止其他类调public的new构造方法创建类,只能用getInstance()方法创建类
	 */
	private Singleton(){}
	
	/**
	 * 获取Singleton对象唯一方法
	 * synchronized加锁保证线程同步
	 */
	public static Singleton getInstance(){
		if(instance==null){
			synchronized(Singleton.class){
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
