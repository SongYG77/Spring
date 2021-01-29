package diexam.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import diexam.di.lec.Exam;
import diexam.di.lec.NewlecExam;

@ComponentScan("diexam.di.ui")
@Configuration
public class NewlecDiConfig {
	@Bean
	public Exam exam() {
		return new NewlecExam();
	}//이것이 만든 객체를 컨테이너에 담아줄 것이다.

}
