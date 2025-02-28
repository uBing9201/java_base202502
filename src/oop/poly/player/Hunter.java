package oop.poly.player;

public class Hunter extends Player {

    String pet;

    public Hunter(String nickName, String pet) {
        super(nickName);
        this.pet = pet;
    }

    public void magicArrow(Player p) {
        int damage = 0;
        String job = "";
        if (p instanceof Hunter) {
            damage = 15;
            job = "사냥꾼";
        } else if (p instanceof Mage) {
            damage = 20;
            job = "마법사";
        } else if (p instanceof Warrior) {
            damage = 10;
            job = "전사";
        }
        p.hp -= damage;
        System.out.printf("%s님이 %s님에게 매직 애로우를 시전했습니다!\n"
                , this.nickName, p.nickName);
        System.out.printf("%s님(%s)이 %d의 피해를 입었습니다.\n",p.nickName, job, damage);
        System.out.println(p.nickName + "님의 남은 체력: " + p.hp);
    }

}
