//The fundamental concepts in any programming language are values and references.
//In Java, Primitive variables store the actual values, whereas Non-Primitives store the reference variables
//which point to the addresses of the objects they’re referring to. Both values and references are stored in the stack memory.
//Arguments in Java are always passed-by-value. During method invocation, a copy of each argument,
//whether its a value or reference, is created in stack memory which is then passed to the method.
//In case of primitives, the value is simply copied inside stack memory which is then passed to the callee method;
//in case of non-primitives, a reference in stack memory points to the actual data which resides in the heap.
//When we pass an object, the reference in stack memory is copied and the new reference is passed to the method.

class PrimitivesTest {
 
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
       
        // Before Modification
        System.out.println("Before");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        
        modify(x, y);
        
        System.out.println("After");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
    
    public static void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
    }
}