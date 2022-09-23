public class homework2 {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);

        //출력결과는 31이다
        //++, --는 증감연산기호로 ++는 1만큼 증가, --는 1만큼 감소시킨다는것을 알 수 있다.
        //주의사항으로는 연산자의 위치에 따라 증가하는 순서가 다르다
        //ex)i++는 값이 참조된 후에 증가, ++i는 값이 참조되기 전에 증가로 결과가 다르다

    }

}
