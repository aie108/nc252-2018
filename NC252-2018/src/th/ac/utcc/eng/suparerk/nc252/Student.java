package th.ac.utcc.eng.suparerk.nc252;

public class Student {
	private Subject [] subject;
	private String     fullName;
	private String     id;
	private int        count = 0;
	
	public Student() {
		subject = new Subject[10];
	}
	
	public Student(int num) {
		subject = new Subject[num];
	}
	
	public void addSubject(Subject s) {
		if(count < subject.length) {
			subject[count] = s;
			count++;
		}
	}
	public Subject[] getSubject() {
		return subject;
	}
	public void setSubject(Subject[] subject) {
		this.subject = subject;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
