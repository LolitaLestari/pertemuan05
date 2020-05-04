public class Main {
    public static void main(String[]args){
        sheep kambing1 = new sheep();
        sheep kambing2 = new sheep();


        kambing1.nama    = "udud";
        kambing1.score   = 500;
        kambing1.length  = 4;
        kambing1.speed   = 2;
        kambing1.color   = "blue";

        kambing1.sound();

        System.out.println(kambing1.score);
        kambing1.Rumput(kambing2);
        System.out.println(kambing1.score);
        System.out.println(kambing1.speed);

        System.out.println(kambing2.color);
        kambing2.cat(kambing2);
    }
}
