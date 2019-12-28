package com.upp;

public class Test {
		public int add(int a,int b){
		try{
		return a+b;
		}catch(Exception e){
		System.out.println("catch 测试");
		}finally{
		System.out.println("finally 测试");
		}
		return 0;
		}
		public static void main(String[] args){
		Test test = new Test();
		System.out.println("求和结果："+ test.add(9,34));
		}
}
