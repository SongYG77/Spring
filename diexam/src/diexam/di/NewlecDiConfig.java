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
	}//�̰��� ���� ��ü�� �����̳ʿ� ����� ���̴�.

}