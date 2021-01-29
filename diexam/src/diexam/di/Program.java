package diexam.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import diexam.di.ui.ExamConsole;

public class Program {
	public static void main(String[] args) {
		
		/* ���������� �����ϴ� ������� ����
		Exam exam = new NewlecExam();
		//ExamConsole console = new InlineConsole(exam);
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		*/
		//ExamConsole console = ?;
		//setting xml�� �̿��� ���ü��� ����� �� ������ �� ��������.
		//���� �ؾ� �� ���� ���ü��� �ҷ����� ���̴�.
		
			
		ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDiConfig.class); 
		//		new ClassPathXmlApplicationContext("diexam/di/setting.xml");
		//ExamConsole console = (ExamConsole) context.getBean("console");
		//�Ǵ�
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		//ExamConsole console = context.getBean(ExamConsole.class);
		ExamConsole console = (ExamConsole) context.getBean("console");
		console.print1();
		
		//List<Exam> exams = (List<Exam>) context.getBean("exams"); //new ArrayList<>();
		//exams.add(new NewlecExam(1,1,1,1));
		
		//for(Exam e : exams)
		//	System.out.println(e);
	}}