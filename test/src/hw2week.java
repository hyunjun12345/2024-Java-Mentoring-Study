public class hw2week {
    public static void main(String[] args) {

        int myAge=21;
        System.out.println(myAge);


        int myGrade=1;
        String myName="조현준";
        System.out.println("이름:"+myName);
        System.out.println("학번:"+myGrade);


        float Num1=39835.2311F;
        int Num2=(int)Num1;
        System.out.println(Num2);


        int a=10,b=20;
        System.out.println("첫 번째 수:"+a);
        System.out.println("두 번째 수:"+b);
        int myTemp=a;
        a=b;
        b=myTemp;
        System.out.println("첫 번째 수:"+a);
        System.out.println("두 번째 수:"+b);


        final double radLeg=2.1;
        final double radArea=radLeg*radLeg*3.14;
        System.out.println(radArea);
        System.out.println((int)radArea);
    }
}
