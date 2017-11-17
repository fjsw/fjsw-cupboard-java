package com.shuwang.cupboard.model;

public class BusinessException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public BusinessException(Object Obj) {
        super(Obj.toString());
    }
}
