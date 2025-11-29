package staticatribute;

public class MainClassroom {
  static void main() {
    Classroom registry = new Classroom("Jonathan");
    Classroom registry2 = new Classroom("Juan");
    registry.showInfo();
    registry2.showInfo();

    Classroom.setSchoolName("Escuela Técnica n° 56");
    registry.showInfo();
    registry2.showInfo();
  }
}
