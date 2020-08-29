package com.example.recyclerview;

import java.util.ArrayList;

public class DataDummy {

    static String[] titles = {
            "Counter-Strike: Global Offensive",
            "Dota 2",
            "Destiny 2",
            "Warframe",
            "Shadowverse CCG",
            "Wasteland 3",
            "BLEACH Brave Souls",
            "Life is Strange 2",
            "Control Ultimate Edition",
            "Nexomon: Extinction"
    };

    static String[] tags = {
            "FPS, Shooter, Multiplayer, Competitive",
            "Free to Play, MOBA, Multiplayer, Strategy",
            "Free to Play, Looter Shooter, FPS, Multiplayer",
            "Free to Play, Looter Shooter, Action, Co-op",
            "Card Battle, Free to Play, Trading Card Game, Deckbuilding",
            "RPG, Strategy, Turn-Based Combat, Violent",
            "Free to Play, Action, RPG, Anime",
            "Story Rich, Choices Matter, Adventure, Episodic",
            "Action, Adventure, Female Protagonist, Supernatural",
            "Casual, RPG, Top-Down, Funny"
    };

    static String[] images = {
            "https://steamcdn-a.akamaihd.net/steam/apps/730/header.jpg?t=1592263625",
            "https://steamcdn-a.akamaihd.net/steam/apps/570/header.jpg?t=1591047995",
            "https://steamcdn-a.akamaihd.net/steam/apps/1085660/header.jpg?t=1597766539",
            "https://steamcdn-a.akamaihd.net/steam/apps/230410/header.jpg?t=1596663832",
            "https://steamcdn-a.akamaihd.net/steam/apps/453480/header.jpg?t=1593416410",
            "https://steamcdn-a.akamaihd.net/steam/apps/719040/capsule_616x353.jpg?t=1598636278",
            "https://steamcdn-a.akamaihd.net/steam/apps/1201240/capsule_616x353.jpg?t=1597718432",
            "https://steamcdn-a.akamaihd.net/steam/apps/532210/capsule_616x353.jpg?t=1592488544",
            "https://steamcdn-a.akamaihd.net/steam/apps/870780/capsule_616x353.jpg?t=1598552374",
            "https://steamcdn-a.akamaihd.net/steam/apps/1196630/capsule_616x353.jpg?t=1598621088"
    };

    public static ArrayList<Game> getAllDataDummy(){
        ArrayList<Game> list = new ArrayList<>();
        for (int i = 0; i<titles.length; i++) {
            Game game = new Game(
                    titles[i],
                    tags[i],
                    images[i]
            );
            list.add(game);
        }
        return list;
    }
}
