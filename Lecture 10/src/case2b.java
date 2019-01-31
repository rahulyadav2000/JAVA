import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  }  
class case2b
{  
  public static void main(String args[])throws IOException{
//declareexception  
     M m=new M();  
     m.method();  
      System.out.println("normal flow...");  
  }  
} 
