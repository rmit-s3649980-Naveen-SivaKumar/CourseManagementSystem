package course;

public class CourseOfferedTO {
private String courseId;
private String courseName;
private int semester;
private int totalStudents;
public String getCourseId() {
	return courseId;
}
public void setCourseId(String courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getSemester() {
	return semester;
}
public void setSemester(int semester) {
	this.semester = semester;
}
public int getTotalStudents() {
	return totalStudents;
}
public void setTotalStudents(int totalStudents) {
	this.totalStudents = totalStudents;
}
public String getLecturerName() {
	return lecturerName;
}
public void setLecturerName(String lecturerName) {
	this.lecturerName = lecturerName;
}
public String getLecturerId() {
	return lecturerId;
}
public void setLecturerId(String lecturerId) {
	this.lecturerId = lecturerId;
}
private String lecturerName;
private String lecturerId;
}
