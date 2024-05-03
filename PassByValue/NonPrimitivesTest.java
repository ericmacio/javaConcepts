//A Java object, in contrast to Primitives, is stored in two stages.
//The reference variables are stored in stack memory and the object that they’re referring to, are stored in a Heap memory.
//Whenever an object is passed as an argument, an exact copy of the reference variable is created which points
//to the same location of the object in heap memory as the original reference variable.
//As a result of this, whenever we make any change in the same object in the method, that change is reflected in the original object.
//However, if we allocate a new object to the passed reference variable, then it won’t be reflected in the original object.

//Parameter passing in Java is always Pass-by-Value. However, the context changes depending upon whether we’re dealing with Primitives or Objects:
//For Primitive types, parameters are pass-by-value
//For Object types, the object reference is pass-by-value

class NonPrimitivesTest {
 
     public static void main(String[] args) {
        Foo a = new Foo(1);
        Foo b = new Foo(1);

        // Before Modification
        System.out.println("Before");
        System.out.println("a.num: " + a.num);
        System.out.println("b.num: " + b.num);
        
        modify(a, b);
        
        // After Modification
        System.out.println("After");
        System.out.println("a.num: " + a.num);
        System.out.println("b.num: " + b.num);
    }
 
    public static void modify(Foo a1, Foo b1) {
        a1.num++; 
        b1 = new Foo(1);
        b1.num++;
    }
}
 
class Foo {
    public int num;
   
    public Foo(int num) {
        this.num = num;
    }
}