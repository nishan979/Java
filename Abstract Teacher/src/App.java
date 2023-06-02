
abstract class Teacher{
    abstract void show();
}

class CSETeacher extends Teacher{
    void show(){
        System.out.println("I am in CSETeacher.");
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        CSETeacher ob = new CSETeacher();
        ob.show();
    }
}
