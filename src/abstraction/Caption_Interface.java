package abstraction; //20231109

/*
 * 인터페이스
 * 	- 표준, 규약, 스펙, 명세의 역할을 수행하는 것
 * 	- 상수와 추상메소드를 포함한다.(java 8부터는 정적메소드, 디폴트메소드도 가능)
 *  - 구현클래스가 반드시 구현할 기능의 명세를 정의한다.
 *  - new 키워드를 통한 객체 생성 불가
 *  - 인터페이스는 다른 인터페이스를 상속받을 수 있다.
 *  - 인터페이스끼리 다중 상속이 가능하다.
 *  - 인터페이스 타입의 참조변수로 객체 참조 가능
 * 
 * 인터페이스 형식
 *  public interface 인터페이스명 {
 *  	// 인터페이스에서는 추상메소드에 abstract 키워드를 생략할 수 있다.
 *  	반환타입 메소드명(매개변수, 매개변수);
 *  	반환타입 메소드명(매개변수, 매개변수);
 *  	반환타입 메소드명(매개변수, 매개변수);
 *  	반환타입 메소드명(매개변수, 매개변수);
 *  }
 *  
 * 인터페이스를 구현한 구현클래스 정의하기
 *  - 구현클래스는 하나 이상의 인터페이스를 구현할 수 있다.
 *  - 구현클래스는 인터페이스의 모든 추상 메소드를 재정의해야 한다.
 *  - 같은 인터페이스를 구현한 구현클래스들은 사용법이 동일한 구현클래스가 된다.
 *  public class 구현클래스명 implements 인터페이스명, 인터페이스명, 인터페이스명 {
 *  
 *  }
 */

/*
 * 표준 결정 (인터페이스 정의) - 인터페이스에 맞춰서 코딩
 *  (인터페이스를 사용하는 쪽과 구현하는 쪽은 서로 모름.)
 */


/*
 * 객체를 획득하는 방법
 * 1.
 * public class Me {
 * 		// 의존하는 객체를 직접 생성해서 멤버변수에 대입한다.
 * 		Phone phone = new IPhone15();
 * }
 * 
 * 2. 의존성 주입(제3자를 통해서 제공받는 것) - 여기선 Wife가 Me의 Phone을 조립해서 제공해줌, 변화에 유연하게 대응하기 위해서
 * public class Me {
 * 		Phone phone; // Phone을 연결할 잭(멤버변수) 준비
 * 		public Me(Phone phone) {
 * 			this.phone = phone;
 * 		}
 * }
 * 
 * public class Wife {
 * 		public static void main(String[] args) {
 * 			Iphone p = new Iphone();
 * 			// Me가 사용할 전화기객체를 생성해서 Me에게 조립했다.
 * 			Me me = new Me(p);
 * 		}
 * }
 */

public class Caption_Interface {

}
