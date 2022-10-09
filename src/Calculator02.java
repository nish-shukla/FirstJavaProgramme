public class Calculator02 {
        static int answer;
        public static void addition(int a, int b){
        answer = a + b;
        System.out.println("Addition of " + a +  " & " + b + " is " + answer);
    }
    public void substration(int a, int b){
            answer = a-b;
        System.out.println("Substraction of " + a +  " & " + b +  " is " + answer);
    }
    public static void main (String args[]){
        Calculator02 calculator02 =new Calculator02();
        addition(50,30);
        addition(30,90);
        calculator02.substration(30,50);
        calculator02.substration(100,50);
    }

}
