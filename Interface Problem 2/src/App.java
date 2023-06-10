import java.net.Socket;

class Teacher{
     public void show(){
        System.out.println("I am in Teacher.");
     }
}

class CSETeacher extends Teacher{

}

public class App {
    public static void main(String[] args) throws Exception {
        CSETeacher ob1 = new CSETeacher();
        ob1.show();
    }
}
