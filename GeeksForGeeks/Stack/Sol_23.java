class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    /* The method insert to push element
       into the queue */
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);
    }
	
    
    /* The method remove which return the
      element popped out of the queue*/
    int Pop()
    {
	   if(s1.isEmpty() && s2.isEmpty())
	     return -1;
	   if(s2.isEmpty()){
	       while(!s1.isEmpty()){
	           s2.push(s1.peek());
	           s1.pop();
	       }
	   }  
	    int ans=s2.pop();
	    return ans;
	       
	   }
	
}