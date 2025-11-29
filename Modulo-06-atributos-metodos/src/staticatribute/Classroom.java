package staticatribute;

public class Classroom {
  private String studentName; //atributo de instancia
  private static String schoolName = "Escuela Técnica N° 1"; //atributo de clase


  public Classroom(String studentName) {
    this.studentName = studentName;
  }

  public void showInfo(){
    System.out.println("Alumno: " + studentName + "\nEscuela: " + schoolName);
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public static String getSchoolName() {
    return schoolName;
  }

  public static void setSchoolName(String schoolName) {
    Classroom.schoolName = schoolName;
  }
}
