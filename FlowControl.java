package p;

public class FlowControl {
    public static void main(String[] args) {
        int guess=5;
        //if - else-if
        if(1==2){
            System.out.println("Code executed inside if block");
        }else if(1<3){
            System.out.println("Code executed inside else if block");
        }else{
            System.out.println("Code executed inside else block");
        }
//switch control
        switch (guess){
            case 1: {
                System.out.println("Guess is 1");
                break;
            }
            case 2: {
                System.out.println("Guess is 2");
                break;
            }
            case 3: {
                System.out.println("Guess is 3");
                break;
            }
            default:{
                System.out.println("Guess is grater than 3 or less than 1");
                break;
            }
        }
    }
}
