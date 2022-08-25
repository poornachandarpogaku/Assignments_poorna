package assignments;

 public class StackEx {

	 public static void main(String[] args)  {
		Stack st = new Stack();
		st.push("hello poorna");
		st.pop();
		st.show();}}

 class Stack {
	  String stack[] = new String[20];
	  int top=0;
	public void push(String input) {
       String words[] = input.split("");
       for(int i=0;i<words.length;i++) {
	   int j =i;
       stack[j] = words[i]; 
       top++;}}
	
	public String pop() {
		top--;
		String data;
		data = stack[top];
		stack[top]=null;
		return data;}
	
	public void show() {
	   for(int k=stack.length-1;k>=0;k--)
	   {
	   System.out.println("stack address "+k+" = "+stack[k] +" ");}}
 }
