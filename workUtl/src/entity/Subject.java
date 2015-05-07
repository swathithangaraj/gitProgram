package entity;

/**
 * ѧ��ʵ����
 * @author ronaldoGT
 *
 */
public class Subject {

	private String id;
	//���
	private String gradeType;
	//�γ�
	private String courseType;
	//�½�
	private String chapterType;
	
	public Subject(){}
	
	public Subject(String id,
				   String gradeType,
				   String courseType,
				   String chapterType){
		this.id = id;
		this.gradeType = gradeType;
		this.courseType = courseType;
		this.chapterType = chapterType;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGradeType() {
		return gradeType;
	}
	public void setGradeType(String gradeType) {
		this.gradeType = gradeType;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getChapterType() {
		return chapterType;
	}
	public void setChapterType(String chapterType) {
		this.chapterType = chapterType;
	}
	
	public String toString(){
		return "id="+id+",,�꼶 = "+gradeType+",,�γ� = "+courseType+",,�½� = "+chapterType;
	}
}
