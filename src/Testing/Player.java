package Testing;

import java.io.*;

public class Player implements Serializable {
    private int position;
    private int coins;
    private String name;
    private String weapon;
//we either try to use game controller as an object or we call player from game controller and feed in the same topis, second part would be easier, given it works.
    public Player(int position,int coins,String name,String weapon) throws IOException {
    //    game_Controller gc= new game_Controller();
    //     coins=gc.getCoins();
    //     position= gc.getPos();
    //     name=gc.getName();
    //     weapon=gc.getWeapon();
        this.coins=coins;
        this.position= position;
        this.name=name;
        this.weapon=weapon;
    }

    void write() throws IOException {
        game_Controller gc= new game_Controller();
        Player p = new Player(gc.getPos(), gc.getCoins(), gc.getName(), gc.getWeapon());
        String fileName=name+".ser";
        System.out.println(fileName);
        System.out.println(position);

        // Serialization
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(p);
        out.close();
        file.close();

        //check
        System.out.println("Object has been serialized\n");
    }

    int read(String n) throws IOException, ClassNotFoundException {
        Player p1 = null;
        //change location
        String n1=n+".ser";
        System.out.println(n1);
       String n2=  "C://Users//krish//Desktop//College//Advanced Pogamming//Spare_WillHero//Test_WillHero//"+n1;
        FileInputStream file = new FileInputStream(n2);
        ObjectInputStream in = new ObjectInputStream(file);
        p1 = (Player)  in.readObject();
        System.out.print("in file, deserializing");
        in.close();
        file.close();

        System.out.println("this is the name of the player "+p1.name);
        System.out.println("this is the position of the player "+p1.position);
        System.out.println("this is the no of coins of the player "+p1.coins);
        System.out.println("this is the weapon of the player "+p1.weapon);
        return p1.position;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
  
    }
}
