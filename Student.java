package MiniProject;



public class Student{
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	public Student()
	{
		
	}

	public Student(int id,String name,int grade)
	{
		this.id=id;
		this.name=name;
		this.grade=grade;
	    this.feesPaid=0;
		this.feesTotal=30000;
	}
	//not going to alter student's name and id that why not required to set the value of name id
	public void setGrade(int grade)//used to update the student grade
	{
		this.grade=grade;
	}
	public void payFees(int fees)
	{
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	public int getId() {
		return id;
	}

   public String getName() {
		return name;
	}

   public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
	public int getGrade() {
		return grade;
	}
	public int getRemainingFees(){
        return feesTotal-feesPaid;
    }
}
	

	