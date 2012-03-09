public class HelloWorld {
  public static void main(String[] args) {
    if(args.length <= 0) {
       System.out.println("first argument is required");
       System.exit(1);
    }
    System.out.println("Hello World: "+args[0]);
  }
}
