package com.example.spacewar.SpaceWar;

public class Vehicle
{
    public static final int WIDTH = 100;
    public static final int HEIGHT = 76;
    public int x = 0;
    public int y = 0;
    public int lives = 1;
    public int bullets = 1;
    public boolean shield = false;


    public Vehicle()
    {
        x = 0;
        y = 480-76-10;
    }
}
