package Prototype;


interface villainPrototype{
    Villain cloning();
}

abstract class Villain implements villainPrototype{
    abstract void attackprotagonist();
} 

class VillainType1 extends Villain{
    private int hp,mp;
    VillainType1(int hp,int mp){
        this.hp=hp;
        this.mp=mp;
    }
    
    @Override
    public Villain cloning() {
        return new VillainType1(this.hp, this.mp);
    }

    @Override
    void attackprotagonist() {
        System.out.println("Attacking Protagonist");
    }

    public String toString(){
        String str = " Hp:" + this.hp + " Mp: " + this.mp;
        return str;
    }
}

public class Prototype {
    public static void main(String[] args) {
        Villain v = new VillainType1(150, 40);
        System.out.println(v);

        Villain clone= v.cloning();

        System.out.println(clone); 
    }
    
}