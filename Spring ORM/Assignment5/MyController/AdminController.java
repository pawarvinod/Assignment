package com.yash;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yash.modul.Student;
import com.yash.modul.StudentTestAttempt;
import com.yash.modul.Teacher;
import com.yash.modul.Test;
import com.yash.modul.TestQustion;
import com.yash.service.StudentService;
import com.yash.service.StudentTestAttempService;
import com.yash.service.TeacherService;
import com.yash.service.TestQustionService;
import com.yash.service.TestService;


@RestController
@RequestMapping("/root")
public class AdminController {

	@Autowired
	TestQustionService tesrqservice;
	@Autowired
	TeacherService techservice;
	@Autowired
	TestService testser;
	@Autowired
	StudentService stdeservice;
	@Autowired
	StudentTestAttempService staservice;
	@Autowired
	TestQustionService testqustionservice;
//	@RequestMapping("/testq")
//	public TestQustion testq()
//	{
//		return testqustionservice.saveListOfQustion();
//	}
//	@RequestMapping("/test")
//	public void m4(@RequestBody Test t2)
//	{
//		 Test t=testser.savelistOfTestP(t2);
//		 System.out.println(t.getTestid());
//	}
//	
//	========2.Write query to print teacher name total number of test created.===
    @RequestMapping("/question2")
    public void show_counttest2()
    {
    	System.out.println("====Write query to print teacher name total number of test created=========");
    	int count=0;
        List<Test> tea = testser.getListOfTestService();
        
        for (Test te : tea)
        {
        	count++;
            System.out.println("  Test Name : "+te.getTestname()+", Teacher name : "+te.getTeacher().getTeachername());
        }
        System.out.println("  Number of test : "+count);
    }
	
	
//    //=====print total number of questions given by each teachers======
//
//    @Autowired
//	TeacherService techservice;
//    List<Teacher> tach1;
//     public void getteacher()
//     {
//
//    	List<Teacher> tcher= techservice.getListOfTechaer();
//    	
//     }

   @RequestMapping("/que1")
   public void show_que1()
   {	System.out.println("====print total number of questions given by each teachers===");
	   List<Teacher> listOfTechaer = techservice.getListOfTechaer();
	   
	   for (Teacher t : listOfTechaer)
	   {
		   int count=0;
		   
		System.out.println("Teacher name : "+t.getTeachername());
		List<Test> test=t.getTest();
		for (Test t2 : test)
		{
			count = count + t2.getTq().size();
		}
		System.out.println("Number of qst. : "+count);
	   }
   }

//  4. Write query to print result of students for teacher by teacher name

	// System.out.println("======Write query to print result of students for teacher
	// by teacher name========");
	@RequestMapping("/que4")
	public void que4() 
	{
		List<Teacher> teachers = techservice.getListOfTechaer();// all teacher
		for (Teacher teacher : teachers)
		{
			System.out.println("Teacher Name: " + teacher.getTeachername() + "  ");
			List<Test> test = teacher.getTest();
			for (Test t3 : test) {
				List<TestQustion> tq = t3.getTq();
				for (TestQustion tq2 : tq) {
					List<StudentTestAttempt> sta = tq2.getSta();

					for (StudentTestAttempt sta1 : sta) {
						int marks = 0;
					
						System.out.print("       Student name " + sta1.getStudent().getSname());
						sta1.getTest_q().getSta();
                        String correctanswer = tq2.getCorrectanswer();
                        if (sta1.getMarkedAnswer().equals(correctanswer))
                        {
                        	marks++;
                        	
                        }
                        if(marks>0)
                        {
                        	System.out.println("  Student marks :" + marks);
                        }
                        else
                        {
                        	System.out.println("   "+sta1.getStudent().getSname()+" is fail");
                        }
						
					}
				}
			}
		}
	}

	
//	=======Count how many test is given by a student===========
//	
	@RequestMapping("question5")
	public void testCountByStudent()
	{
		System.out.println("=======Count how many test is given by a student===========");
		List<Student> st=stdeservice.getListOfStudent();
		for (Student student : st)
		{
			int count=0;
			int temp=0;
			System.out.println("Student name "+student.getSname());
		    String s1=student.getSname();
		    List<StudentTestAttempt> sta=staservice.getListOfTestAttemt();
		    for (StudentTestAttempt student2 : sta) 
		    {
		    	
		    	int qid=student2.getTest_q().getQid();
		    	int testid = student2.getTest_q().getTestid();
		    	Optional<TestQustion> que = tesrqservice.findById(qid);
		    	int testid2 = que.get().getTest().getTestid();
		    	if(testid==testid2 && temp!=testid)
		    	{
		    		count++;
		    		temp=testid2;
		    	}
			}
		    
		    System.out.println(" test count "+count);
		}
		
	}
	
//	================================================================================================
	
	// 3.Write query to print student total marks obtained for each test for given
		// student name
		@RequestMapping("/qustion3")
		public void get_marks() 
		{
			List<Student> slist = stdeservice.getListOfStudent();
			for (Student s : slist) 
			{
				int marks = 0;
				int sum=0;
				System.out.println(s.getSname());
				List<StudentTestAttempt> attemptlist = s.getAttempt();
				for (StudentTestAttempt sta : attemptlist) 
				{
					Optional<TestQustion> tq = tesrqservice.getQuestionById(sta.getTest_q().getQid());
					String ans = tq.get().getCorrectanswer();
					marks=0;
					if (sta.getMarkedAnswer().equals(ans)) 
					{
						marks++;
						sum=sum+marks;//ok
						System.out.println("    "+sta.getTest_q().getTest().getTestname()+"   "+marks);					
					}				
				}
				System.out.println("  Total  marks  " + sum);
			}
		}
	
	
	
//	======================================================================================================
	@RequestMapping("/question6")
    public void avg_wrong_que()
    {
		System.out.println("=======Calculate average wrong questions attempt by students===============");
        List<TestQustion> allQuestions = tesrqservice.getListOfTestQustion();
        int correct=0;
        int wrong=0;
        for (TestQustion test_que : allQuestions)
        {

            List<StudentTestAttempt> sta = test_que.getSta();
            for (StudentTestAttempt sta1 : sta)
            {

                String marked_answer = sta1.getMarkedAnswer();
                String correctanswer = test_que.getCorrectanswer();
                if(marked_answer.equals(correctanswer))
                {
                    correct++;
                }
                else
                    wrong++;
            }

        }
        double avg=wrong*100/(wrong+correct);
        System.out.println("Wrong average  "+avg);

        double avg1=correct*100/(wrong+correct);
        System.out.println("correct average  "+avg1);

    }
	
//	==========Calculate average correct questions attempt by students.===========
	@RequestMapping("/question4")
	public void maximumMarks()
	{
		System.out.println("==========Calculate average correct questions attempt by students======");
		 List<TestQustion> allQuestions = tesrqservice.getListOfTestQustion();
	        int correct=0;
	        int wrong=0;
	        for (TestQustion test_que : allQuestions)
	        {

	            List<StudentTestAttempt> sta = test_que.getSta();
	            for (StudentTestAttempt sta1 : sta)
	            {

	                String marked_answer = sta1.getMarkedAnswer();
	                String correctanswer = test_que.getCorrectanswer();
	                if(marked_answer.equals(correctanswer))
	                {
	                    correct++;
	                }
	                else
	                    wrong++;
	            }

	        }
	        double avg=wrong*100/(wrong+correct);
	        System.out.println("Wrong average  "+avg);

	        double avg1=correct*100/(wrong+correct);
	        System.out.println("correct average  "+avg1);
	}
	
//	
////	
////	============= Q 9 Print details of students who score lowest marks in test=================
    @RequestMapping("/question9")
    public void min_marks()
    {
    	System.out.println("============Print details of students who score lowest marks in test======");
        int max=Integer.MAX_VALUE;
        String name="";
        List<Student> allStudent = stdeservice.getListOfStudent();
        for (Student student : allStudent)
        {
            int marks=0;
            List<StudentTestAttempt> sta = student.getAttempt();
            for (StudentTestAttempt sta1 : sta)
            {  
                String correctanswer = sta1.getTest_q().getCorrectanswer();
                String marked_answer = sta1.getMarkedAnswer();
                if(correctanswer.equals(marked_answer))
                {
                    marks++;
                }
            }
                if(max>marks)
                {
                    max=marks;
                    name=student.getSname();
                }              
        }
        System.out.print(" Student Name : "+name);
        System.out.println("  Min Marks : "+max);
    }

///=========== Q 8 Print details of students who score highest marks in test==================
@RequestMapping("/question8")
public void max_marks()
{
	System.out.println("==========Print details of students who score highest marks in test========");
    int min=0;
    String name="";
    List<Student> allStudent = stdeservice.getListOfStudent();//student
    for (Student student : allStudent)
    {
        int marks=0;
        List<StudentTestAttempt> sta = student.getAttempt();//attempt
        for (StudentTestAttempt sta1 : sta)
        {  
            String correctanswer = sta1.getTest_q().getCorrectanswer();
            String marked_answer = sta1.getMarkedAnswer();
            if(correctanswer.equals(marked_answer))
            {
                marks++;
            }          
        }
        if(min<marks)
        {
            min=marks;
            name=student.getSname();
        }
    }
    System.out.print(" Student Name : "+name);
    System.out.println("  Max Marks : "+min);
}
}
