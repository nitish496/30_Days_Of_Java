public class Main {
    public static void main(String[] args) {
        //p-1:
        int number = 100;
        Integer wrapperNumber = 100;

        System.out.println("primirtive value:"+number);
        System.out.println("Wrapper value:"+wrapperNumber);

            //p-2:
        //primitive values:
        int age = 18;
        String name="Nitish";
        double num = 35000.5;
        char grade = 'A';
       //Wrapper objects:
       Integer wrapperAge=18;
       Double  wrapperSalary = 35000.5;
       Character wrapperGrade = 'A';

       System.out.println("Primitive types:");
       System.out.println("age:"+age);
       System.out.println("num:"+num);
       System.out.println("grade:"+grade);
        System.out.println("Wrapper objects:");
        System.out.println("age:"+wrapperAge);
        System.out.println("num:"+wrapperNumber);
       System.out.println("grade:"+wrapperGrade);


    }
}