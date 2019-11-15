
/**
 * Main class test the integration between Student and Department
 * 
 * @author Hien Le (hien.t.le3@)
 * @version 10/25/2019
 */
public class Main
{
    public static void main(String[] args){
        Student newStud = new Student("Name","LastName","123456789",false,true,false);
        System.out.println(newStud.toString());
        
        Department newDep = new Department();
        for(int i=0;i<98;i++){
            newDep.addStudent(new Student("Name"+i,"LastName"+i,"3333"+i,true,false,false));
        }
        for(int i=0;i<51;i++){
            newDep.addStudent(new Student("Name"+i,"LastName"+i,"4444"+i,false,true,false));
        }
        for(int i=0;i<27;i++){
            newDep.addStudent(new Student("Name"+i,"LastName"+i,"5555"+i,false,false,true));
        }
        System.out.println(newDep.toString());
        
    }
}
