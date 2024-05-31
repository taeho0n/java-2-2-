# 김태훈 202130406
# 2024.05.31
-13주차 내용  
>JComponent 
* 모두 상속받는 슈퍼클래스이며 추상 클래스이다.
* 상속받는 공통 메소드의 상수 수현

>메뉴 구성
* 메뉴아이템 -JMenuItem을 이용하여 생성
* 메뉴 - 여러 개의 메뉴 아이템을 가짐. JMenu를 이용하여 생성
* 메뉴바 - 메뉴들을 붙이는 바이며, 프레임에 부착. JMenuBar를 이용하여 생성
* 분리선 - 메뉴아이템 사이의 분리선을서 separator라고 부르며, JMenu의 addSeparator()메로드를 호출아여 삽입


>메뉴 만들기
```java
JMenuBar mb = new JMenuBar(); //메뉴바 mb 생성
```


>메뉴를 만들어 메뉴바에 붙인다.
* 메뉴 이름은 JMenu생성자에 전달한다.
* 메뉴바에 메뉴를 붙일 때 add()메소드를 사용한다.
```java
JMenu scrennMenu = new JMenu("Screen"); //Screen 메뉴 생성
mb.add(screenMenu); //Screen 메뉴 삽입
```


>메뉴아이템을 생성하여 메뉴에 붙인다.
```java
screenMenu.add(new JMenuItem("Load"));
screenMenu.add(new JMenuItem("Hide"));
screenMenu.add(new JMenuItem("ReShow"));
screenMenu.addSeparator(); //ReShow 메뉴아이템 다음에 분리선 삽입
screenMenu.add(new JMenuItem("Exit"));
```


>메뉴바를 프레임에 붙인다.
* setJMenuBar()메소드를 사용하여 메뉴바를 프레임에 붙인다.
```java
frame.setJMenuBar(mb);
```


1. 스윙 컴포넌트의 공통 기능,JComponent의 메소드
```java
public class JComponentEx {
    public JComponentEx(){
        super("JComponent의 공통 메소드 예제");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        JButton b1 = new JButton("Magenta/yellow Button");
        JButton b2 = new JButton("Disable Button");
        JButton b3 = new JButton("getx(), gety()");

        b1.setBackground(Color.YELLOW);
        b1.Foreground(Color.MAGENTA);
        b1.setFont(new Font("Arial",Font.ITALIC,20));
        b2.setEnabled(false);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JButton b=(JButton)e.getSource();
                setTitle(b.getx()+","+b.gety());
            }
        });
        
        c.add(b1); c.add(b2); c.add(b3);

        setSize(260,200); setVisible(true);

    }

    public static void main(String[] args) {
        new JComponentEx();
    }
    
}
```


2. JLable을 이용한 문자열과 이미지 출력을 하는 예제 코드
```java

public class LableEx  extends JFrame{
    public LabelEx() {
        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= getContentPane();
        c.setLayout(new FlowLayout());

        JLabel textLabel= new JLabel("제임스 고슬링입니다!.");

        ImageIcon img = new ImageIcon("images/Desert.jpg");
        JLabel imLabel=new JLabel(img);

        ImageIcon icon= new ImageIcon("images/icon.gif");
        JLabel label =new JLabel("커피한잔 하실래예,전화 주이소", icon, SwingConstants.CENTER);

        c.add(textLabel);
        c.add(imageLabel);
        c.add(label);

        setSize(300,500);
        setVisible(true);

    }
    
    public static void main(String[] args) {
        new LableEx();
    }
}

```


























# 2024.05.17
-11주차 내용

 >컨테이너마다 하나의 배치관리자가 있음.   
 >컨테이너 크기가 변하면 내부 컴포넌트들의 위치와 크기를 모두 재조절하여 재배치

* BorderLayout
-> 동,서,남,북,중 5개의 영역으로 나누고 지정한 영역에 컴포넌트 배치.

* GridLayout

-> 컨테이너의 공간을 응용프로그램에서 설정한 동일한 크기의 2차원 그리드로 나누고,    들어오는 순서대로 좌에서 우 ,다시 위엣허 아래 순서대로 배치.

* CardLayout

-> 컨테이너 공간에 카드를 쌓아 놓은 듯이 컴포넌트들을 포개어 배치.


setLayout()메소드를 호출하여 컨테이너에 새로운 배치관리자를 설정 할 수 있다. 

'''
 Container c= frame.getContentPane(); //프레임의 컨텐트팬
 c.setLayout(new FlowLayout()); //컨텐트팬에 FlowLayout 배치관리자 설정

'''

















# 2024.05.12
-학교축제(수업X)

# 2024.05.03 
-9주차 내용

컬렉션 : 엘리먼트라고 불리우는 가변 객체들의 저장소(크기가 정해져있지 않음, 넣을수록 늘어남), 객체들의 컨테이너라고 불린다(배열과 비슷하지만 크기의 차이)
set:집합, linked list:배열과 다르게 비어있는 공간에 채워넣음

컬렉션은 제네릭 기법으로 구현
* 제너릭이란? -모든 종류의 타입을 다룰 수 있도록, 클래스나 메소드를 일반화된 타입  매개 변수를 이용하여 선언하는 기법

* 벡터(vector)의 특성

 1.배열을 가변 크기로 다룰 수 있게 하는 컨테이너 
 2.요소 객체들을 삽입, 삭제, 검색하는 컨테이너
 3.삽입 가능한 값(객체,null, 기본타입의 값은 Wrapper 객체로 만들어 저장)
 4.삽입 위치 (맨 뒤, 앞 ,중간 다 가능)
 5.크기 미지정시 default 값으로 10 지정(10 초과시 자동증가)

hasnext 다음에서 반복에서 리턴할 값이 있으면 true (값이 없을 때 까지 반복)

HashMap<K,V> k=key(사용할 데이터 타입), v=value(데이터 타입의 타입 매개 변수) 쌍으로 구성되는 요소를 다룬다.
get은 key를 가져오는 것이 아닌 key값(value,key와 메모리 저장위치가 다름)을 가져옴. 


* 스윙 기초 

 GUI(스윙과 AWT, AWT는 잘 사용하지않음) <-> CLI 
 AWT와 달리 순수 자바 언어로 작성되었다.
 경량 컴퍼넌트라고 불린다.
 AWT보다 화려하고 다양한 많은 GUI 컴포넌트를 제공한다.
 AWT와 구분하기위해 컴포넌트 이름이 모두 J로 시작한다.

* 컨테이너

 컴포넌트를 포함할 수 있는 특별한 GUI 컴포넌트이다.
 컨테이너가 되기 위해서는 java.swing.JContainer를 상속받아야한다.
 컨테이너 또한 컴포넌트이다.

* 컴포넌트
 
 java.swing.JComponent를 상속받기 때문에 Component 클래스는 모든 컴포넌트들의 공통적인 요소들을 구현하고 있다.
 컨테이너와 달리 다른 컴포넌트를 포함할 수 없다.
 임의의 컨테이너에 포함되어야 화면에 출력될 수 있는 GUI객체이다.

* 스윙 프레임

 모든 스윙 컴포넌트들을 담는 최상위 컨테이너이다.
 프레임이 출력될 때 프레임 내에 부착된 모든 컴포넌트들이 화면에 출력된다.
 컴포넌트들은 프레임 없이 독립적으로 화면에 출력될 수 없다.
 스윙 응용프로그램에서 main()의 기능은 최소화 하는 것이 좋다.(가능한)

프레임만 있는 것이 아니라 프레임이 생성이 되면 컨텐트팬이 생성되고 그 위에 컨텐트들을 놓는 형태






# 2024.04.19
-7주차 내용

오버라이딩의 목적 : 다형성 
호출을 해도 슈퍼클래스에 있는것을 하는게 아니라 뛰어 넘어서 서브클래스 실행 -> 동적바인딩
서브클래스가 아닌 슈퍼클래스를 실행 ->정적바인딩 (super키워드 사용, 서브클래스에선 사용불가)

오버로딩 => 같은 클래스에서 동일한 이름의 메소드 중복작성, 정적바인딩 사용  
오버라이딩 => 서브클래스에서 슈퍼 클래스에 있는 메소드와 동일한 이름의 메소드 재작성, 동적바인딩 사용

추상클래스(거의 안쓰이기때문에 알아두기만) 
abstract 키워드 사용
원형만 있음 -> 매개변수까지만 있고 처리를 안하는 형태(객체를 만들 수 없음)
객체도 만들지 못하는데 왜 사용하는가?
->super클래스로 사용하기 위함. 추상클래스를 상속 받으면 상속을 받은 클래스도 추상클래스가 된다. 오버라이드를 해서 완벽한 함수로 만듦
여러 개의(수십, 수백)서브클래스를 사용할 때, 위에서 미리 정하지않고 상속받아서 사용하면 될 때 

인터페이스란 추상화에서 확장된 개념 
여러군데에서 사용될 가능성(변하지않음)이 있으면 추상화로 만들어놓음

클래스는 전부 오브젝트에서 상속받은 것 (당연한거라 extends는 사용하지않음) -> 오브젝트의 모든 메소드 사용가능 
패키지는 무엇인가
세 명에서 공동 개발을 할 때 겹치는 클래스가 있을 때 컴파일 시 오류가 발생하지 않게 하기위해 만든것
파일이름은 전체경로 , 파일명이 같아도 경로가 다르면 다른파일로 인식

모듈 : 패키지를 모아둔 것.
패키지 사용방법 
import 패키지이름.클래스이름; 보편적으로 사용
import 패키지.*; 많은 클래스를 불러야하는 경우 사용

JAVA PROJECTS -> src -> + -> package 선택

오브젝트는 모든 클래스의 슈퍼클래스이다.

데이터 타입 : int float char(문자 하나)... -> Wrapper클래스를 가지고있다. Wrapper을 가지고 객체를 생성할 때  Integer i = Integer.valueOf(10); (new를 사용하지않음.)
클래스 : String(문자열)

박싱과 언박싱
기본타입을 Wrapper객체로 변환시키는 것을 박싱이라고 한다.
Wrapper객체를 기본 데이터 타입으로 빼내는 것을 언박싱이라고 한다.

ㅣ
ㅣ
ㅣ      중간은 6장까지  
ㅣ   코드 오류수정 or 완성하기 
ㅣ   객체와 관련된 내용 ,class만드는 법(생성자), 객체 , 상속 , Package 만드는 법and사용법(import) ,Project 생성 -> Git 초기화 / commit하는 법
ㅣ   브라우저는 chrome만 사용가능 나머지 X ,인터넷 검색, 책은 허용
ㅣ
 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ








# 2024.04.12

-6주차 내용
패키지 : 폴더의 느낌(경로)
public : 모든 클래스에서 접근 가능
private : 같은 클래스 내에서만 접근 가능
protected : 같은 패키지,(다른 패키지에서 상속받은 자식 클래스)에서 접근 가능 보통은 다른패키지에서 접근 X
디폴트 : 같은 패키지에서 접근 가능

static 전역멤버 : 어떤 메소드가 되었던 사용가능함 ex) static int m;
non-static 지역멤버 : 객체 내에서만 사용가능 밖에선 불가능. ex)int m;
객체를 생성한다는 것: 메모리상의 레퍼런스를 잡아두는 것.
static은 객체를 만들지 않아도 사용가능(이미 메모리상의 레퍼런스를 잡아놓은 상태)
static은 프로그램이 종료되기 전까지 사라지지않음.
static은 하나만 존재하기때문에 class이름으로 접근하는게 맞는 방법.
non - static 은 객체이름으로만 접근가능. 여러 개가 있을 수 있기 때문에 class이름으로 접근 X
static 메소드는 오직 static 멤버만 접근 가능하다. -> non - static은 객체가 생성되기 전에는 사용할 수 없기때문.
static 메소드에서는 this를 사용할 수 없다. -> static 메소드는 객체가 없어도 존재하기 때문에 this를 사용할 수 없다.

final 키워드가 붙으면 상속을 할 수 없다. -> 상속 해주면 안되거나 싫은 경우 사용.
final 메소드가 있으면 더이상 오버라이딩(같은 이름으로 여러개의 메소드를 만드는 것)이 불가능하다.
한 번 선언하고 나면 바꿀 수 없음. -> 설정과 동시에 초기화를 반드시 해줘야함.

서브 클래스 extends 슈퍼 클래스: 상속 선언
서브 클래스에는 슈퍼 클래스의 내용이 포함되어있다.

서브 클래스가 먼저 호출은 되지만 실행은 안됨 -> 슈퍼 클래스 생성자가 먼저 실행
초기화 할 게 없다고 판단되면 생성자를 안만들어도 됨. -> 컴파일러가 알아서 만들어줌

업캐스팅 = 기본 클래스의 포인터 
서브 클래스의 객체가 슈퍼 클래스 타입으로 변환되는 것.

다운캐스팅 - 슈퍼 클래스의 레퍼런스를 서브 클래스의 레퍼런스에 대입하는 것. -> 업캐스팅 된 것을 되돌리는 것. 반드시 타입 변환을 명시적으로 지정해줘야 한다.



# 2024.04.05
-5주차 내용

배열이란 많은 변수를 다루기 힘들 때 한 군데 모아 관리하기 위해 사용
2차원 배열:1차원 배열이 여러개 있는 것 
3차원 이상의 배열은 배열을 사용하는것 보다 데이터베이스를 쓰기 때문에 잘사용X
래퍼런스=주소(포인터)
배열을 선언하는 순간 메모리의 특정 위치에 주소(포인터)가 생김 
->배열을 리턴(temp)하면 주소만 리턴 (배열자체 X)

객체란 틀을 만들어놓고 찍어낸 결과물 ex)붕어빵 틀이 class 붕어빵이 객체
특성 = 멤버변수(필드), 행동 = 멤버함수(메소드)

객체지향 언어의 특징
1.캡슐화
-> 외부에서의 접근 차단
2.상속
-> 부모로부터 상속받는 형태 (자바에서 부모는 슈퍼 클래스, 자식은 서브 클래스)
3.다형성
-> 같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것.(오버로딩 (같은 클래스 내에서 동일한 메소드를 만들고 싶은만큼 만들 수 있음 대신 매개변수의 갯수가 틀리거나 타입이 달라야함.),오버라이딩(상속을 받은 메소드를 서브클래스에서 슈퍼 클래스와 이름은 같지만 내용이 다른 메소드로 사용하는 것.))

틀을 만들어놓고 사용하기 때문에 생산이 빠름
최근엔 함수지향 언어를 사용하기도 함.

절차 지향 -> 위에서부터 순서대로

클래스(틀) = 멤버 변수 + 멤버 함수
객체(인스턴스, 실질적인 메모리 차지) = 클래스를 통해 만들어낸 것.

생성자(new) -> 초기화 목적의 메소드(아무것도 없으면 자동으로 호출), 이름은 클래스 이름으로

this 레퍼런스 -> 객체 자신에 대한 레퍼런스(주소)
this()->클래스 내에서 다른 생성자를 호출할 때 사용

객체배열 = 배열에 대한 레버펀스 변수선언 -> 레퍼런스 배열 생성 -> 각 원소 객체 생성 -> 배열의 원소 객체 사용

자바의 모든 메소드는 클래스 안에 있어야함(캡슐화)

객체의 치환 = 객체를 직접 복사하는 것이 아닌 레퍼런스의 값이 치환되어 가르키는 값이 달라짐, 치환되기 전 원래 가르키고 있던 값은 가비지로 남게 됨.

자바에서 객체는 생성할 때 new를 사용하여 하지만 소멸은 마음대로 할 수 없음.






# 2024.03.29
-4주차 내용
리터럴 = 값
메모리의 주소값을 말할 때는 주로 16진수 사용
float 타입은 잘 사용 X
'' = 문자, "" = 문자열(String)

상수 = 변하지 않는 데이터
final로 선언 / 상수는 전부 대문자로 표기

var => 컴파일 할 때 알아서 타입변환
초기화가 반드시 필요함. ex)var foo; => X ,var foo =10;
지역변수에만 사용가능 / 자바에서는 되도록 사용안하는걸 권장

타입/형 변환
-자동
ex) long m =25; , double d= 3.14*10 (10.0으로 인식)
-강제
ex) int n =300;
byte b = n; (컴파일 오류) -> byte b = byte n; 으로 수정
강제로 변환시 데이터 손실이 발생 할 수 있음. (byte의 범위는 0~255 , 300을 저장하려면 300%256 =44 가 저장되기 때문에 손실 발생)

조건식이 많아질 경우 if문 보단 case문을 쓰는걸 권장.

switch문은 break를 만날 때 까지 실행
if문은 조건이 안맞으면 실행 X

&& -> OR
|| -> AND

반복 횟수가 정해져있을 때 for ex)9x9단
반복 횟수를 잘 모를 때 while  ex)0이 입력될 때 까지 값을 입력받기

for(초기값; 조건식; 반복작업)

while(조건식){
    작업문
}

# 2024.03.22
-3주차 내용<br>

Working Dir. C or D 드라이브에 여러 개를 만들다보면 어떤게 시스템 디렉토리 인지 헷갈림. -> 원하는 드라이브에 Working Dir 생성 ex)hoon202130406(gitgub랑 통신) -> 프로젝트를 할 때만 사용 -> 다른 프로젝트를 진행 할 경우 
새로운 디렉토리 생성 (기존 디렉토리에 프로젝트를 추가해서 진행하지 말것)

CPU + OS = 시스템 / 컴파일 = 고급언어를 저급언어로 변환하는 과정

자바는 컴파일을 하면 .class파일로 저장(반만 컴파일 된 상태)

자바만 .class로 컴파일되는 이유 - 다른 언어는 모든 운영체제에서 동일하게 사용할 수 없기 때문에 바로 실행 할 수 있는 .exe파일로 컴파일되지만 java는 중간과정인 jvm을 거쳐서 모든 운영체제에 사용 가능하기때문에 .class로 컴파일

class파일은 내가 쓴 코드만 컴파일

각 OS에 맞게 컴파일을 해야함 but JVM을 여러가지 버전으로 만들어서 배포 -> JVM만 깔면 컴파일을 한 번만 해도 다른 OS에 적용가능 

JDK -자바의 개발 및 실행환경 JRE포함.
JRE - 자바 실행환경

javac -> .java 를 .class로 
서버에다가 파일을 만들어서 실행시켜야 하는 경우 -> 원격으로 서버에 접속해야함 그럴 때 사용(평소엔 vscode에서 자동 실행)

java 로 class파일 실행 (.class없이 파일 이름만)

jar - 압축파일

JAVA의 특징
-플랫폼 독립성
바이트 코드로 플랫폼 독립성
-객체지향
캡슐화 (변수(멤버변수)나 함수(메소드)를 캡슐 안에 보관을 해서 가져다가 사용가능),상속

-클래스로 캡슐화 

-소스(.java)와 클래스(.class)파일 
class파일에는 하나의 (main)class만 존재 (소스파일의 이름과 같은 이름의 public으로 선언된 클래스) 외에 다른 class는 여러개 존재 가능

-어떤 class든 시작은 main method부터 실행(위치 상관 X)

-멀티스레드
별도의 호출 필요 X

-가비지 컬렉션
메모리 할당 기능은 있지만 반환기능은 없다.배열을 선언하면 메모리 어딘가에 배열의 크기만큼의 공간 할당 -> 나중에 사용하지 않을경우 메모리 반환을 해야함(하지 않으면 메모리가 점점 가득 참) -> 사용자가 직접 반환하지 않아도 알아서 반환

-실시간 응용프로그램에 부적합
가비지 컬렉션이 언제 실행될 지 모르기때문(실행되는 동안에는 프로그램이 정지되어야하기 때문)

-프로젝트 생성 방법-
ctrl + shift + p -> java create project -> no build tools -> workspace_202130406 폴더 선택 

-프로젝트 생성 후-
새로 생성한 프로젝트에서  README를 제외한 내용을 카피 해서 깃허브와 연동 된 파일(JAVA2-2)로 옮기기 -> 오류발생 -> add path 후 정상 실행

-레퍼지토리 초기화-
프로젝트 생성 후 -> 소스제어 -> 레퍼지토리 초기화 -> 이후 커밋

-커밋-
초기화 후에 터미널 창 -> git init으로 설치 -> git config user.email"" ,git config user.name""으로 등록 -> 이후 메시지 작성 후  커밋


ctrl f5 - 시작 (디버그 실행x)
shift f5 - 디버그 종료
f5 -디버그 시작

<!-- 해당라인 주석 ctrl + /  -->                
재입력하면 주석해제

class이름만 파스칼표기법 사용(시작만 대문자)

데이터타입은 소문자로 시작 

# 2024.03.15
-2주차 내용<br>

통째로 가져오거나 남의 것을 가져올때 -> 클론 

협업을 하는 경우(내가 주인이 아닐 경우)-> 포크 

탐색기에서는 .파일 생성이 안됨 -> vs코드 들어와서 생성

Github에 올리면 안되는게 생길 경우 .gitignore에 새로 생성 (job/ ,job.md 등) 

커밋 할 때 메시지 무조건 작성(변경 내용(원칙은 영문, 스페이스 포함 25자)) 

README의 용도 -> 대부분 사용법으로 사용 (새로운 기능이 계속 생길 경우 버전 작성(추가된 기능,수정 된 오류)) 

History or 버전을 관리 할 경우 -> 최근 내용이 가장 위로 오도록 관리 

지금 내용은 커밋하지 않고 전 내용만 푸쉬하고 싶은 경우 -> 왼쪽 하단 화살표 이용 

버전 수정은 Git Graph 에서 태그 추가로 수정 

Github의 내용이 항상 main이 되도록 해야함 (매 번 할 필요는 없지만 push를 계속 해주기)

https://www.toptal.com/developers/gitignore

https://git-scm.com/