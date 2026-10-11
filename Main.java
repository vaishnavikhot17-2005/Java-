class Main{
     int a=10;//Instance variable: belongs to each object //
     static int b=20;//Static variable: belongs to the class//
    public static void main(String [] args){
        int b=9;//here a is a local variable so we need to initialize it otherwise will get compile time error //
        System.out.println(b);
        Main obj=new Main();//// Create an object to access the instance variable
       int a=1000;
       System.out.println("Local Variable :"+a);// non-static variable a cannot be referenced from a static context
       System.out.println("Static Variable:"+b);
       System.out.println("Instance variable:"+obj.a);
    }}
//main is a static method()//
//Inside a non-static method of the same class, you can access it directly.//

class Demo{
    int a=10;//instance variable//
    public static void main(String[] args) {
        Demo obj = new Demo();//create a object //
        //a is an instance variable, so you need an object to access it directly from the static main() method.

        System.out.print(obj.a);
    }
}

//Declared inside the class but outside main(). It belongs to an object.
//Local variable
//Declared inside main(). It is accessible directly within its scope and shadows the instance variable.
//Here, a is a static variable, not a true global variable. It belongs to the Demo class and can be accessed directly from main() because main() is also static
//Instance variable: Inside class, outside methods, without static.
//Static variable: Inside class, outside methods, with static.
//Local variable: Inside a method or block.
//And remember: Java has no traditional global variables.