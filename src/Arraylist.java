import java.util.ArrayList;

public class Arraylist {


    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        al.add(new  CricPlayer(18,"Virat"));
        al.add(new  CricPlayer(45,"Rohit"));
        al.add(new  CricPlayer(07,"Mahi"));

        System.out.println(al);
    }


}

class CricPlayer{
    int jerNol;
    String name;

    CricPlayer(int jerNol, String name ){
        this.jerNol=jerNol;
        this.name = name;

    }

    public  String toString(){
//        return  name;
        return jerNol + " : " + name;
    }
}