package diexam.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import diexam.di.lec.Exam;

public class InlineConsole implements ExamConsole {

	private Exam exam;

	public InlineConsole() {
		// TODO Auto-generated constructor stub
	}

	public InlineConsole(Exam exam) {
		this.exam = exam;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print1() {
		System.out.printf("total : %d, avg : %f\n", exam.total(), exam.avg());

	}
	
	@Autowired
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;

	}

}
