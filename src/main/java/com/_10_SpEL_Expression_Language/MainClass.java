package com._10_SpEL_Expression_Language;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/_10_SpEL_Expression_Language/spEl_Bean.xml");
		Demo dobj = context.getBean("demo",Demo.class);
		
		System.out.println(dobj);
//		dobj.getY();
		
		/*
		SpelExpressionParser sep = new SpelExpressionParser();
		Expression exp =  (Expression) sep.parseExpression("22+44");
		System.out.println(exp.getValue());
		*/
		
		System.out.println("------------------------------------");
		SpelExpressionParser expressionParser = new SpelExpressionParser();
		Expression expression = expressionParser.parseExpression("2*6");
		System.out.println(expression.getValue());
		
	}

}
