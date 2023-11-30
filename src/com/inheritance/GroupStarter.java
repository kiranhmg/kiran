package com.inheritance;

public class GroupStarter {
    public static void main(String[] args) {
        Lens lens=new Lens(200,"ryban","black");
        System.out.println(lens);
        System.out.println("hash code: "+lens.hashCode());
        System.out.println("hash code: "+System.identityHashCode(lens));
        System.out.println("*************************************************");
        Lens lens1=new Lens(200,"ryban","black");
        System.out.println(lens1);
        System.out.println("hash code: "+lens1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(lens1));
        System.out.println("*************************************************");

        Locker locker=new Locker(150,"indix",true);
        System.out.println(locker);
        System.out.println("hash code: "+locker.hashCode());
        System.out.println("hash code: "+System.identityHashCode(locker));
        System.out.println("*************************************************");

        Locker locker1=new Locker(150,"indix",true);
        System.out.println(locker1);
        System.out.println("hash code: "+locker1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(locker1));
        System.out.println("*************************************************");

       Cotton cotton=new Cotton("white","good","nylon");
        System.out.println(cotton);
        System.out.println("hash code: "+cotton.hashCode());
        System.out.println("hash code: "+System.identityHashCode(cotton));
        System.out.println("*************************************************");

        Cotton cotton1=new Cotton("white","good","nylon");
        System.out.println(cotton1);
        System.out.println("hash code: "+cotton1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(cotton1));
        System.out.println("*************************************************");

         Mic mic=new Mic("canon",2000,"good");
        System.out.println(mic);
        System.out.println("hash code: "+mic.hashCode());
        System.out.println("hash code: "+System.identityHashCode(mic));
        System.out.println("*************************************************");
        Mic mic1=new Mic("canon",2000,"good");
        System.out.println(mic1);
        System.out.println("hash code: "+mic1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(mic1));
        System.out.println("*************************************************");

        Heart heart=new Heart(10,100,"meat");
        System.out.println(heart.toString());
        System.out.println("hash code: "+heart.hashCode());
        System.out.println("hash code: "+System.identityHashCode(heart));
        System.out.println("*************************************************");

        Heart heart1=new Heart(10,100,"meat");
        System.out.println(heart.toString());
        System.out.println("hash code: "+heart1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(heart1));
        System.out.println("*************************************************");

        Seed seed=new Seed("beans","ankoor",180);
        System.out.println(seed);
        System.out.println("hash code: "+seed.hashCode());
        System.out.println("hash code: "+System.identityHashCode(seed));
        System.out.println("*************************************************");
        Seed seed1=new Seed("beans","ankoor",180);
        System.out.println(seed1);
        System.out.println("hash code: "+seed1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(seed1));
        System.out.println("*************************************************");

        Chair chair=new Chair(600,"white","plastic");
        System.out.println(chair);
        System.out.println("hash code: "+chair.hashCode());
        System.out.println("hash code: "+System.identityHashCode(chair));
        System.out.println("*************************************************");
        Chair chair1=new Chair(600,"white","plastic");
        System.out.println(chair1);
        System.out.println("hash code: "+chair1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(chair1));
        System.out.println("*************************************************");

        Rice rice=new Rice("white",50,"bullet");
        System.out.println(rice);
        System.out.println("hash code: "+rice.hashCode());
        System.out.println("hash code: "+System.identityHashCode(rice));
        System.out.println("*************************************************");

        Rice rice1=new Rice("white",50,"bullet");
        System.out.println(rice1);
        System.out.println("hash code: "+rice1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(rice1));
        System.out.println("*************************************************");

        Bucket bucket=new Bucket(15,20,"red");
        System.out.println(bucket);
        System.out.println("hash code: "+bucket.hashCode());
        System.out.println("hash code: "+System.identityHashCode(bucket));
        System.out.println("*************************************************");
        Bucket bucket1=new Bucket(15,20,"red");
        System.out.println(bucket1);
        System.out.println("hash code: "+bucket1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(bucket1));
        System.out.println("*************************************************");

        Bowl bowl=new Bowl("metal",230,20);
        System.out.println(bowl);
        System.out.println("hash code: "+bowl.hashCode());
        System.out.println("hash code: "+System.identityHashCode(bowl));
        System.out.println("*************************************************");

        Bowl bowl1=new Bowl("metal",230,20);
        System.out.println(bowl1);
        System.out.println("hash code: "+bowl1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(bowl1));
        System.out.println("*************************************************");

      Spoon spoon=new Spoon(10,20,"steel");
        System.out.println(spoon);
        System.out.println("hash code: "+spoon.hashCode());
        System.out.println("hash code: "+System.identityHashCode(spoon));
        System.out.println("*************************************************");

        Spoon spoon1=new Spoon(10,20,"steel");
        System.out.println(spoon1);
        System.out.println("hash code: "+spoon1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(spoon1));
        System.out.println("*************************************************");

        Money money=new Money("coin",5,1999);
        System.out.println(money);
        System.out.println("hash code: "+money.hashCode());
        System.out.println("hash code: "+System.identityHashCode(money));
        System.out.println("*************************************************");
        Money money1=new Money("coin",5,1999);

        System.out.println(money1);
        System.out.println("hash code: "+money1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(money1));
        System.out.println("*************************************************");

        Geyser geyser=new Geyser("vgaurd",5000,"gas");
        System.out.println(geyser);
        System.out.println("hash code: "+geyser.hashCode());
        System.out.println("hash code: "+System.identityHashCode(geyser));
        System.out.println("*************************************************");

        Geyser geyser1=new Geyser("vgaurd",5000,"gas");
        System.out.println(geyser1);
        System.out.println("hash code: "+geyser1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(geyser1));
        System.out.println("*************************************************");

        Bandli bandli=new Bandli("steel",500,"pigen");
        System.out.println(bandli);
        System.out.println("hash code: "+bandli.hashCode());
        System.out.println("hash code: "+System.identityHashCode(bandli));
        System.out.println("*************************************************");

        Bandli bandli1=new Bandli("steel",500,"pigen");
        System.out.println(bandli1);
        System.out.println("hash code: "+bandli1.hashCode());
        System.out.println("hash code: "+System.identityHashCode(bandli1));
        System.out.println("*************************************************");




    }
}
