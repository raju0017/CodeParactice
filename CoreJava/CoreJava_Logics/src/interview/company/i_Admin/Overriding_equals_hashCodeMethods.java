package interview.company.i_Admin;

public class Overriding_equals_hashCodeMethods {
	
	class User {
		private String name;
		private int age;
		private String passport;

		public User() {
			// TODO Auto-generated constructor stub
		}

		public User(String name, int age, String passport) {
			super();
			this.name = name;
			this.age = age;
			this.passport = passport;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getPassport() {
			return passport;
		}

		public void setPassport(String passport) {
			this.passport = passport;
		}

		@Override
		public boolean equals(Object o) {

			if (o == this)
				return true;
			if (!(o instanceof User)) {
				return false;
			}

			User user = (User) o;

			return user.name.equals(name) && user.age == age && user.passport.equals(passport);
		}

		// Idea from effective Java : Item 9
		@Override
		public int hashCode() {
			int result = 17;
			result = 31 * result + name.hashCode();
			result = 31 * result + age;
			result = 31 * result + passport.hashCode();
			return result;
		}

	}

	public static void main(String[] args) {

		Overriding_equals_hashCodeMethods x = new Overriding_equals_hashCodeMethods();
		User user1 = x.new User("mkyong", 35, "111222333");
	    User user2 = x.new User("mkyong", 35, "111222333");

	    System.out.println(user1.equals(user2));
	}
}
