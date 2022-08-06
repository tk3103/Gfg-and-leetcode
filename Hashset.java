import java.util.*;

class Hashset{
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(56);
        hs.add(6);
        hs.add(7);
        hs.add(60);
        hs.add(68);
        hs.add(69);

        hs.remove(6);
        System.out.println(hs.contains(78));
        if(hs.contains(56)){
            System.out.println("found");
        }

        System.out.println("Size is "+hs.size());
        System.out.println(hs);


    }
    

}
