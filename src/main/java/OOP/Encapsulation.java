package OOP;

public class Encapsulation {
    /*
        Dont keep your global variable public
        Only used Getter and Setter to set the value
     */
    public static void main(String[] args) {
        
    
Student studentOne = new Student();
studentOne.setId(101);
studentOne.setName("Mark Miller");
studentOne.setDeptname("IT");
studentOne.setWorking(true);
        System.out.println(studentOne.getDeptname());
        System.out.println(studentOne.getId());
        System.out.println(studentOne.getName());
     //   System.out.println(studentOne.getWorking());

    }
}
    class Student {
       private int id;
       private String name;
       private String deptname;
       private boolean isWorking; //DRY

        public Student() {

        }


        public int getId () {
                return id;
            }

            public void setId ( int id){
                this.id = id;
            }

            public String getName () {
                return name;
            }

            public void setName (String name){
                this.name = name;
            }

            public String getDeptname () {
                return deptname;
            }

            public void setDeptname (String deptname){
                this.deptname = deptname;
            }

            public boolean isWorking () {
                return isWorking;
            }

            public void setWorking ( boolean working){
                isWorking = working;
            }

            public Student(int id, String name, String deptname, boolean isWorking) {
                this.id = id;
                this.name = name;
                this.deptname = deptname;
                this.isWorking = isWorking;
             }
    }
    