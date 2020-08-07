package java_tutorials;

public class ToStringConcept {
	
        String name;
		String course;
		String time;

		public ToStringConcept() {

		}

		public ToStringConcept(String name, String course, String time) {
			this.name = name;
			this.course = course;
			this.time = time;
		}

		@Override
		public String toString() {
			return "Training [name=" + name + ", course=" + course + ", time=" + time + "]";
		}

		public static void main(String ar[]) {
			ToStringConcept tr = new ToStringConcept("jeyhun", "python", "6am");
			System.out.println(tr.toString());
			System.out.println(tr.name);
		}

	}
/**
 * in java all the classes by default child class of the object class 
 */



