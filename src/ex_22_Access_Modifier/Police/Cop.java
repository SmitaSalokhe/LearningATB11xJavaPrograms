package ex_22_Access_Modifier.Police;

public class Cop
{
    String iCard;
    public int gun;

    public Cop(int bullet){
    this.gun = bullet;
    }

    protected void iShoot(){
        System.out.println("You can shoot");

    }
}
