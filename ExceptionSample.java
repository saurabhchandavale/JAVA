package p2;
public class ExceptionSample {
    public static void main(String[] args) {
       int userInput = 0;
        try{
             userInput = Integer.parseInt("8");
             String[] fruits = {"banana","orange","apple","watermillon"};
             System.out.println("User picked " + fruits[userInput - 1]);
        }catch(NumberFormatException e){
            System.out.println("Invalid Number, You have to give only numbers");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Gives number between 1 to 4");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("It will execute always");
        }
    }
}
