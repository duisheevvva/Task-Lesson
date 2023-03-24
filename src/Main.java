import db.DataBase;
import model.Gender;
import model.Group;
import model.Student;
import service.impl.GroupServiceImpl;

public class Main {
    public static void main(String[] args) {
        /*
1) Жаны проект тузунуз.
2) 3 жаны пакет тузунуз - model, service, db.
3) model пакеттин ичине Group, Student деген класс тузунуз,Group свойствалары - id, name, description, year.
 Student fullName, age, Gender, Genderди enum кылып башка пакетке тузуп койсонуз болот.
4) db пакет тузунуз, пакеттин ичине Database деген класс тузунуз,
ичинде 2 свойствасы болот - groups, students. Бул класс биздин база
данных болот.
5) service пакеттин ичине GroupService деген жана StudentService тузунуз,  жана
 impl деген пакет тузуп коюнуз.
6) GroupService

    String addNewGroup(Group group);

    // with stream
    String getGroupById(int id);

    //with stream
    List<Group> getAllGroups();

    //with stream
    String updateGroupName(int id, String groupName);

    //with stream (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
    List<Group>filterByYear(int year, String ascDesc);

    //with stream  (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
    List<Group>sortGroupByYear(String ascDesc);

    //with stream
    void deleteGroupById(int id);


7) StudentService
    String addStudent(Student student);

    Student getStudentById(int id);

    List<Student> getAllStudents();

    String updateStudentFullName(int id, String fullName);

    //with stream (1 ди басканда female, 2 ни басканда male кылып фильтрлесин)
    List<Student> filterByGender();

    void deleteStudentById(int id);


8) impl пакеттин ичине GroupServiceImpl, StudentServiceImpl деген класстарды
тузунуз, GroupServiceImpl бул класс GroupService  интерфейсин ишке ашырат,
StudentServiceImpl бул класс GroupService  интерфейсин ишке ашырат жана бул
 класстарда свойства катары биздин база данныхыбыз болот(Database).
 */
        

        Group group1 = new Group(1,"java-9","Best",2023);
        Group group2 = new Group(2,"java-9","Best",2023);

        GroupServiceImpl groupService = new GroupServiceImpl();
        System.out.println(groupService.addNewGroup(group1));
        System.out.println(groupService.getAllGroups());
        System.out.println(groupService.getGroupById(1));
        System.out.println(groupService.updateGroupName(1,"Java-10"));
        System.out.println(groupService.filterByYear(2023,"asc"));


    }
}