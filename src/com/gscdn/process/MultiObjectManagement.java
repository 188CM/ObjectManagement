package com.gscdn.process;

import java.util.HashMap;

public class MultiObjectManagement {
	private static int INSTANCE_LIMIT_COUNT = 20;

	// Instance pool.
    private static HashMap<Integer, MultiObjectManagement> POOL = new HashMap<>(); 
    private static int Count = 0;
    private String toStringMessage;
	
    private MultiObjectManagement(){
       
    	int number = POOL.size();
        toStringMessage = String.format("%d¹ø", number);
        POOL.put(number, this);
    }

    public static MultiObjectManagement GetInstance() {
        final MultiObjectManagement result;
        if (POOL.size() < INSTANCE_LIMIT_COUNT) {
            result = new MultiObjectManagement();
        } else {
            result = POOL.get(Count);
            Count = (Count + 1) % INSTANCE_LIMIT_COUNT;
        }
 
        return result;
    }
 

    @Override
    public String toString(){
        return toStringMessage;
    }

	
}
