public class school {
    String name;
    int studentPop;
    String favteacher;

    public school(){
        name = "";
        studentPop = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setStudentPop(int studentPop){
        this.studentPop = studentPop;
    }

    public int getStudentPop() {
        return studentPop;
    }
    public void setfavteacher (String favteacher){
        this.favteacher = favteacher;
    }
    public String getFavteacher () {
        return favteacher;
    }
}

