
package p2;

import p1.ClassC;

public class ClassD extends ClassC {

      
    

    public static void main(String[] args) {
        ClassC obj = new ClassC();
   System.out.println(obj.publicVar);     
       // System.out.println(obj.protectedVar);  
         System.out.println(obj.defaultVar); 
        // System.out.println(obj.privateVar);
       
    }
}