package designpatternProject;

public class StrategyAndAdapterPattern {
	   public static void main(String[] args) {
		   System.out.println("Strategy Pattern");
	      Context context = new Context(new Rectangle());		
	      context.executeStrategy();

	      context = new Context(new Circle());	
	      context.executeStrategy();
	      
	      System.out.println("Adapter Pattern");
	      context = new Context(new myOvalStrategy());	
	      context.executeStrategy();
	      
	      
	   }
	}