package basics.prgrams;


public class SingletonTest {

	public static void main(String[] args) {
		
		for(int i=0;i<=1;i++) {
			EmployeeDao edao=EmployeeDao.getEmpDao();
			System.out.println(edao);
			String ename = edao.getEmpName("A11");
			System.out.println(ename);
		}
	}
}
