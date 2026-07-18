package hellospringapp01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student st = (Student)context.getBean("st");
		
//		Student s1 = new Student();
//		s1.setSid(100);
//		s1.setSname("harish");
//		s1.setAge(22);
//
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		System.out.println(st.getAge());
	}

}
