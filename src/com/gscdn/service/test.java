package com.gscdn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.gscdn.process.MultiObjectManagement;

public class test {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		    List<Thread> TestList = new ArrayList<>();
		    {
				Lock lo = new ReentrantLock();
		         for (int i = 0; i < 50; i++) {         
		        	Thread newThread = new Thread(()->{
		        			lo.lock();
		                    System.out.println(MultiObjectManagement.GetInstance());
		                    lo.unlock();
		 			});
		            TestList.add(newThread);
		        }
		    }
		 
	        for (Thread thread : TestList) {
	            thread.start();            
	        }
	        System.out.println("End");
		}
}
