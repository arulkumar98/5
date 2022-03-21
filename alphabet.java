class patternAlpha {
   public static void main(String[] args)
   {
      int row=5;
      // edit below here
      char ch='E'; 
      
      for(int i=0; i<row; i++)
      {
         for(int j=i; j<row; j++)
            System.out.print(ch+ " ");
         
         System.out.print("\n");
         ch++;
      }
   }
}