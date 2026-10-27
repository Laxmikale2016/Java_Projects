package Assingmennt2;

public class Indoor {
	String gameName;

    public Indoor() {
        gameName = "Chess";
    }

    public Indoor(String gameName) {
        this.gameName = gameName;
    }

    public void display() {
        System.out.println("Indoor Game: " + gameName);
        System.out.println("Players: 2");
    }
}

