public class homework1 {
    public static void main(String[] args) {

        int var1=5;
        int var2=2;
        double var3=var1/var2;
        //var1과 var2가 int형이므로 정수 산술이 된다.
        // 그래서 int형 데이터 var1, var2중 하나를 double형 데이터로 바꿔서
        // var3에 새로운 double형 변수를 담아주어야 한다
        int var4=(int)(var3*var2);
        System.out.println(var4);

    }

}