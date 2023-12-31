package abstraction; //20231109

/*
 * 상속의 목적
 *   1. 자식 클래스를 빠르게 생성
 *   2. 사용법이 같은 하위 클래스 조성
 *   
 * 클래스 간의 관계
 *  A has a B : 포함관계(의존관계) 예) PC has a Printer
 *  A is a B  : 상속관계		  예) ColorPrinter is a Printer
 */

/*
 * 추상화
 *  정의 : 추상메소드(구현부가 없는 메소드)를 정의하는 것
 *  조건 : 추상클래스나 인터페이스를 이용해서 추상 메소드를 정의한다.
 *  	 구현클래스는 추상메소드 보유 불가 <-- 추상화된 메소드를 반드시 재정의해야 함 / (추상클래스나 인터페이스는 추상메소드 보유)
 *  목적 : 같은 부모클래스(추상클래스 혹은 인터페이스)를 상속받은 구현 클래스는 동일한 사용법의 메소드를 가지게 한다.  
 */

/*
 * 메소드 재정의
 * 	정의 : 상속관계에 있는 클래스에서 자식 클래스가 부모로부터 물려받은 기능을 자신에게 맞게 재정의하는 것
 *  조건 : 반환타입, 메소드이름, 매개변수가 전부 동일하고, 구현내용만 다르게 정의한다.
 *  	 접근제한자는 달라도 상관없지만, 부모의 접근제한과 동일하거나 더 느슨한 접근제한만 가능.
 *  목적 : 부모로부터 물려받은 기능을 자신에 맞게 재정의하는 것
 *  	 재정의된 메소드는 부모타입의 참조변수로 실행할 수 있다.
 */

/*
 * 추상 메소드와 추상 클래스
 *  1. 추상 메소드
 * 			정의 : 구현부가 없는 메소드
 * 			조건 : 메소드의 선언부에 abstract 키워드가 추가된다.
 * 			목적 : 자식 클래스에 이 추상메소드를 재정의하게 한다.
 * 
 *  2. 추상 클래스
 *  		정의 : 추상 메소드를 보유할 수 있는 클래스
 *  		조건 : 클래스의 선언부에 abstract 키워드가 추가된다.
 *  		목적 : 추상메소드를 보유하는 것
 *  			 추상클래스를 상속받은 하위 클래스가 추상메소드를 재정의하도록 한다.
 *  			 하위클래스의 구현부담 감소 - 인터페이스에 대한 중간 구현
 *  		특징 : 멤버변수, 멤버메소드, 정적(static)변수, 정적 메소드, 생성자, 추상메소드를 모두 보유할 수 있다.
 *  			 new 연산자를 이용한 객체 생성 불가.
 */

public class Caption_Abstract {

}
