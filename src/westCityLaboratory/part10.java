package westCityLaboratory;
class parent{
    parent(){
        System.out.println("paerent");
    }
}
class sub extends parent{
    sub(){
     System.out.println("sub");
    }
}
class temp extends sub {
    temp(){
        System.out.println("temp");
    }
}
public class part10 {
    public static void main(String[] args) {
        temp te = new temp();
    }
}

