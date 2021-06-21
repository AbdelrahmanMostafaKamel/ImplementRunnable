public class MyTask implements Runnable {
    private String name;
    public MyTask(String name){
        this.name=name;
    }
    public MyTask(){
        name=null;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+" "+name);
        }
        System.out.println("Done! "+name);
    }
}
