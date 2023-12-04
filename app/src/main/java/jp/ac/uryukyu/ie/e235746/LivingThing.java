package jp.ac.uryukyu.ie.e235746;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name,int maximumHP,int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;

        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public String getName(){return this.name;}
    public int getHitPoint(){return this.hitPoint;}
    public int getattack(){return this.attack;}
    public boolean isDead(){return this.dead;}
     
    public void setname(String _name){this.name = _name;}
    public void sethitPoint(int  _hitPoint){this.hitPoint = _hitPoint;}
    public void setattack(int _attack){this.attack = _attack;}
    public void setdead(boolean _dead){this.dead = _dead;}

    
    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れてしまった。\n", name);
        }
    }
}

