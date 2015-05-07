package entity;

/**
 * 学科实体类
 * @author ronaldoGT
 *
 */
public class Subject {

	private String id;
	//年纪
	private String gradeType;
	//课程
	private String courseType;
	//章节
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
		return "id="+id+",,年级 = "+gradeType+",,课程 = "+courseType+",,章节 = "+chapterType;
	}
}
