public class homework3 {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2 = 0;


        System.out.println("시작!"); //print와 println의 차이를 알게됨 print는 줄바꿈이 안되는데
                                    // println은 줄바꿈이 되어 시작! 후에 주사위 값이 나옴

        while ( dice1 + dice2 != 5) {

            dice1 = (int) (Math.random()*5 + 1); //Math.random()은 0~1사이의 난수를 생성한다.
            dice2 = (int) (Math.random()*5 + 1); //그래서 *5와 +1을 해주어 범위를 1~6 사이의 난수로 바꾼후에
            System.out.println("("+dice1+","+dice2+")"); //int를 붙여 강제 형변환을 하여 정수형태의 주사위 값을 추출한다.

        }
        System.out.println("끝!");

    }
}
