package p;

public class JavaOperators {

    public void operatorsTest() {

        int count = 10;
        int extraCount = 2;
        System.out.println("Total count for sum :" + count + extraCount);   // Ans 102
        System.out.println("Total count for sum :" + (count + extraCount)); // Ans 12

        int totalCount = count;
        if (extraCount == 2) {
            totalCount = count + extraCount;
            System.out.println("Total count is : " + ++totalCount); // Ans 13
        } else {
            System.out.println("Total count is : " + ++totalCount);
        }

        //conditional operator
        totalCount = extraCount==2 ? count + extraCount : totalCount;
        System.out.println(totalCount);  // Ans 12


        //String comparision
        String s1 = new String("Java");
        String s2 = new String("Java");
        if(s1.equals(s2)){
            System.out.println("Both Strings are same"); // Both strings are same
        }else{
            System.out.println("Both Strings are different");
        }

        // logical operators
        int a = 5;
        int b = 2;
        int total = a;
        if (!(b == 2)) {  // Here, It will change true condition to false and print else statement
            total = a + b;
            System.out.println("Total count is : " + total);
        } else {
            System.out.println("Total count is : " + total); // Ans 5
        }

    }

        public static void main (String[]args){
            JavaOperators obj = new JavaOperators();
            obj.operatorsTest();
        }
    }
