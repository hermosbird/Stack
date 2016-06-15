import java.util.Stack;
public class Expression {
private Stack<String> stack;
private String infix;

public Expression(String infix){
	
}

public String eval(){
	String profix="";
	
	return "";
}

private boolean checkPrecedence(char curr, char other){
	return false;
}

public static void main (String [] args){
	Expression i =new Expression("4*((3-5+6/2)/1)");
	System.out.println("Program stared");
	String postfix=i.eval();
	System.out.println(postfix);
}



}
