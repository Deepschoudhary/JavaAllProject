public class Explict_throw_an_exception {
    public static void main(String[] args) {
        int balance=5000;
        int withdrawlAmount= 6000;

      try{
          if(balance < withdrawlAmount)
              throw new  ArithmeticException("insufficient balance");

          balance=balance-withdrawlAmount;
          System.out.println("Transaction Successfully completed");
      }catch (ArithmeticException e){
          System.out.println("Exception:"+e.getMessage());
      }
        System.out.println();
    }
}
// The Exception reference must be of type Throwable class or one of its subclasses
// A detail message can be passed to the constructor when the exception object is created.
//Question=1  why should we throw an exception object?
//Answer= Because we want to set a different message
//because java cannot recognize exceptional situation of business logic