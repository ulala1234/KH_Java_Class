package day0302;
// 주석(Comment)
// 우리가 자바 소스파일(.java 파일)을 작성할 때에는
// 그 파일이 실행가능한 프로그램의 상태가 아직은 아니다.
// 우리가 소스파일을 저장하고 -> 컴파일 이라는 단계를 거쳐야 ->
// 자바 실행 환경(Java Runtime Environment)라는 가상 컴퓨터에서 ->
// 실행 가능한 프로그램이 만들어진다.

// 우리가 실행 버튼을 누르면 이클립스가 자동으로 컴파일을 해주기 때문에
// 별도로 컴파일을 해줄 필요는 없다.

// 주석이란, 해당 소스파일을 컴파일 할 때
// 실행 가능한 코드가 아니라 단순한 설명으로 인식 되어서
// 변환이 되지 않는 글자들을 우리가 주석이라고 한다.
// (주석 처리를 하면 화면에 뜨지 않는다.)

// 주석에는 우리가 주로 해당 코드에 대한 설명을 적게 된다.

// 주석에는 크게 한줄 주석과 여러줄 주석이 있는데
// 한줄 주석은 //가 나온 이후부터 그 줄이 끝나기 전까지를 모두 주석으로 처리한다.

// 여러줄 주석은 /*로 시작하고 */가 나오기 전까지의 모든 줄들을 주석으로 처리한다.

public class Ex02Comment {
    public static void main(String[] args) {
        System.out.println("1");
        /* 
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        */
        System.out.println("5");
    }
}
