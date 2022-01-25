class garbage
  {   
   public static void main(String args[])
   {  
	garbage obj=new garbage();  
	obj=null; 
	garbage a = new garbage();
	garbage b = new garbage();
	b = a;
	System.gc();  
   }  
   protected void finalize() 
   {
        System.out.println("Garbage collection is performed by JVM");
   }
}
