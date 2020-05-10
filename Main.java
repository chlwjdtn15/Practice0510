// 문제 : 아래가 실행되도록 해주세요.
// 스스로 어떻게든 풀었다...
class Main {
	public static void main(String[] args) {
		전사 a전사 = new 홍길동();
		a전사.a무기 = new 활();

		a전사.공격();
		// 출력 => 홍길동이(가) 활(으)로 공격합니다.

		a전사 = new 홍길순();

		a전사.공격();
		// 출력 => 홍길순이(가) 칼(으)로 공격합니다.

		a전사.a무기 = new 창();
		a전사.공격();
		// 출력 => 홍길순이(가) 창(으)로 공격합니다.

	}
}

class 전사 {
	무기 a무기;
	String 이름;

	void 공격() {
		if (a무기 == null) {
			System.out.printf("%s이(가) 칼(으)로 공격합니다.\n", 이름);
		} else {
			this.a무기.작동(this.이름);
		}

	}
}

class 홍길동 extends 전사 {
	홍길동() {
		이름 = "홍길동";
	}
}

class 홍길순 extends 전사 {
	홍길순() {
		이름 = "홍길순";
	}
}

class 무기 {
	String 무기명;
	String 이름;

	void 작동(String 이름) {

	}

}

class 활 extends 무기 {
	활() {
		무기명 = "활";
	}

	void 작동(String 이름) {
		System.out.printf("%s이(가) %s(으)로 공격합니다.\n", 이름, 무기명);
	}
}

class 창 extends 무기 {
	창() {
		무기명 = "창";
	}

	void 작동(String 이름) {
		System.out.printf("%s이(가) %s(으)로 공격합니다.\n", 이름, 무기명);
	}
}