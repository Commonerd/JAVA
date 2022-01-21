package ncs.test2;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0] = new Secretary ("Hilery",1,"secretary",800);//변수가 아니라 배열에 저장한다는 것 주의. 나는 틀렸음.
		employees[1] = new Sales("Clinten",2,"sales",1200);//변수가 아니라 배열에 저장한다는 것 주의. 나는 틀렸음
		System.out.println();
		System.out.println("name\tdepartment\tsalary\t");
		System.out.println("-------------------------------");
		
		for( Employee e : employees) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("인센티브 100 지급");
		System.out.println("name\tdepartment\tsalary\ttax");
		System.out.println("------------------------------------");
		for( Employee e : employees) {
			//e.insentive(100); e에는 인센티브 메서드가 없다.
			//'보너스'에만 있다. 객체안엔 인센티브가 있으나, 지금 우리는 임플로이 타입으로 꺼내옴
			//그래서 임플로이에게서 물려받은 것만 사용가능 하니 문제가 발생. 여기가 어려운 부분
			//원래 타입으로 돌려주면 된다. 
			//임플로이 타입을 보너스 타입으로 바꿀 수 있는가? 
			//임플로이와 보너스는 관계가 없다.
			//세크리터리나 세일즈 타입으로 캐스팅해서 사용하면 된다.
			//임플로이 타입에서 세일즈 타입으로 바꾸든가, 세크리터리 타입으로 바꾸든가
			//슈퍼클래스에서 내려가는 것, 명시해야 한다. 
			//명시만 한다고 되는 게 아니라, 실제 객체의 타입까지 생각해야 한다. 
			//비서 타입으로 세일즈 타입을 다룰 수는 없다.
			//e와 세크리터리 및 세일즈 간 캐스팅 가능한지 검사를 해줘야 한다.
			if(e instanceof Secretary) {
				Secretary s = (Secretary)e;
				s.incentive(100);
			} else if(e instanceof Sales) {
				Sales s = (Sales) e;
				s.incentive(100);
			}
			
			}for(Employee e: employees) {
				System.out.println(e+"\t"+e.tax());
		} 
	}
	}


