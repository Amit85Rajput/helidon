package com.arithmetic.addition;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MultiplicationBLogic {
     public int execute(int a ,int b) {
    	 System.out.println("AdditionBlogic.execute(" + a+ ","+ b+")");
    	 return a*b;
     }
}
