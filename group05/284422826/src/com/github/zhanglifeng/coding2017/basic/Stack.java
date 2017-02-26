package com.github.zhanglifeng.coding2017.basic;

public class Stack {
	private ArrayList elementData = new ArrayList();
	
	public void push(Object o){
		elementData.add(0);
	}
	
	public Object pop(){
		return elementData.remove(elementData.size() - 1);
	}
	
	public Object peek(){
		return elementData.get(elementData.size() - 1);
	}
	public boolean isEmpty(){
		return elementData.size() == 0;
	}
	public int size(){
		return elementData.size();
	}
}
