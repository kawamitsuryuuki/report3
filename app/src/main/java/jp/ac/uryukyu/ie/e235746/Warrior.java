package jp.ac.uryukyu.ie.e235746;

public class Warrior extends Hero {


 /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */

     public Warrior (String _name, int _maximumHP, int _attack) {
        super(_name,_maximumHP,_attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", _name, _maximumHP, _attack);
    }



public void attackWithWeponSkill(LivingThing){
    int damage = (int)(1.5 * getAttack());
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた!!\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
}
}
