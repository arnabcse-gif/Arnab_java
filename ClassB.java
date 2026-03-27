

public class ClassB {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        
        System.out.println(obj.publicVar);    
        System.out.println(obj.protectedVar); 
        System.out.println(obj.defaultVar);   
        System.out.println(obj.privateVar); 
    }
}