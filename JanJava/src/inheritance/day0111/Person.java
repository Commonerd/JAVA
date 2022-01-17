package inheritance.day0111;

public class Person extends Object {

		Name names;
		int age;
		Address addr;
		
		Person(){}

		 Person(Name names, int age, Address addr) {
			
			this.names = names;
			this.age = age;
			this.addr = addr;
		}

		@Override //오브젝트 클래스로부터 물려받은 toString()오버라이딩
		public String toString() {//인스턴스 메서드
			return "Person [names=" + names+ ", age=" + age + ", addr=" + addr + "]";
		}//원래 타입이 다름(names - 네임타입 > 그래서 toString > 
}
//		 
// 		protected Object clone() throws CloneNotSupportedException
//		return null;
//		}

