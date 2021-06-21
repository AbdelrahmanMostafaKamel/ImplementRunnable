public class TestClass {
    public static void main(String[] args){
        MyTask task=new MyTask("runnable object1");
        Thread th=new Thread(task);
        th.start();
    }
}
