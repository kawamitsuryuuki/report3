package jp.ac.uryukyu.ie.e235746;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
     * 倒れたはずの敵は攻撃できないことを検証。
     * 検証手順
     *  (1) ヒーローと敵を準備。ヒーローの攻撃力は敵を一撃で倒せるほど強い状態とする。
     *  (2) ヒーローが殴り、敵も殴る。敵は一撃で倒されていることを期待。
     *  (3) 敵が死んだ状態ならば攻撃できないはず。
     * 　　つまり攻撃実行してもヒーローのHPは減っていないことを期待。これを検証する。
     */
    @Test
    void attackWithWeponSkillTest() {
        int attack = 100;
        Warrior demoWarrior = new Warrior("デモ戦士", defaultHeroHp, attack);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        int Warriorattack = (int)(attack * 1.5);
        int Beforehp;
        for(int i=0; i<3; i++){
            int Beforehp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill();
            assertEquals(Beforehp - Warriorattack, smile.getHitpoint());
        }
        
    }
}