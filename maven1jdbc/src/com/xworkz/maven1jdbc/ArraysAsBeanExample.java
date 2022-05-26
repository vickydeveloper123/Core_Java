package com.xworkz.maven1jdbc;

    import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import javax.annotation.PostConstruct;
	import java.util.Arrays;

	/*
		From Spring 4 official documentation Annotation Type Configuration
		It clearly states that a class having @Configuration annotation tells 
		Spring container that there is one or more beans that needs to be dealt 
		with on runtime. */
	@Configuration
	public class ArraysAsBeanExample {

	    @Bean
	    public String[] fruits() {
	        return new String[]{"apple", "banana", "orange"};
	    }

	    @Bean
	    public TestBean testBean(){
	        return new TestBean();
	    }
	    
	    
		/*
		 * You can use @Autowired annotation on setter methods to get rid of the
		 * <property> element in XML configuration file.
		 */
	    private static class TestBean {
	        @Autowired
	        private String[] fruits;

	        
			/*
			 * The @PostConstruct method can be used to validate properties of bean or
			 * initializing any task just after dependency injection is completed
			 */
	       
	        @PostConstruct
	        public void postConstruct() {
	            System.out.println(Arrays.toString(fruits));
	        }
	    }
	    
	    
	    public static void main(String[] args) {
	        new AnnotationConfigApplicationContext(
	                ArraysAsBeanExample.class);
	    }

}
