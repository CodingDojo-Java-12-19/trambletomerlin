public class ProductClassTest {
    public static void main(String[] args){
        ProductClass hW = new ProductClass();
        String greeting = hW.greet();
        String greetingWithName = hW.greet("Eduardo");
        if (greeting.equals("Hello World") || greetingWithName.equals("Hello Eduardo")){
            System.out.println("Test successful");
        } else{
            System.out.println("Test Fail");
        }
    }
}