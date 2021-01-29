package diexam.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import diexam.di.lec.Exam;

@Component("console")
public class GridExamConsole implements ExamConsole {

	@Autowired
	//@Qualifier("exam1")
	private Exam exam;

	public GridExamConsole(Exam exam) {
		this.exam = exam;
		// TODO Auto-generated constructor stub
	}

	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print1() {
		// TODO Auto-generated method stub
		if (exam != null) {
			System.out.println("Grid Print");
			System.out.printf("total : %d\n", exam.total());
			System.out.println("---------------------");
			System.out.printf("avg : %f\n", exam.avg());
			System.out.println("---------------------");
			
		} else {
			System.out.println("Grid Print");
			System.out.printf("total : %d\n", 0);
			System.out.println("---------------------");
			System.out.printf("avg : %f\n", 0.0);
			System.out.println("---------------------");
			System.out.println("null");
		}

	}


	@Override
	public void setExam(Exam exam) {
		this.exam = exam;

	}

}
