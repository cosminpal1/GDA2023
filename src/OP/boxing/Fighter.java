package OP.boxing;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name,int health, int damage) {
        this.name = name;
        if (health > 0) {
            this.health = health;
        } else {
            this.health = 100;
        }

        damagePerAttack = damage;
    }

    public void attack(Fighter f1){
        f1.health=f1.health-damagePerAttack;
    }

    public int getHealth(){return health;}
    @Override
    public String toString(){
        return name;
    }
}
