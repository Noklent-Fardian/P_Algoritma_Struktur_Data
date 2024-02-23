package Jobsheet2.Dragon2;

import java.util.Scanner;

public class Dragon20 {
    void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    Scanner sc = new Scanner(System.in);
    int x, y, width, height;

    void moveLeft(int n) {
        x -= 1;
    }

    void moveRight(int n) {
        x += 1;
    }

    void moveUp(int n) {
        y -= 1;
    }

    void moveDown(int n) {
        y += 1;
    }

    void printPosition() {
        clearScreen();
        if(x<0||y<0){
            this.detectCollision(x, y);
        }
        System.out.println("X = " + x + " Y = " + y);
        System.out.println("+" + "-".repeat(width * 2 + 1) + "+");
        for (int i = 0; i < height; i++) {
            if (y == height - i - 1 ) {
                System.out.println("|"+" ".repeat(x*2)+"D"+" ".repeat((width-x-1)*2+2)+"|");
            }else{
                System.out.println("|"+" ".repeat(width*2+1)+"|");
            }
        }
        System.out.println("+" + "-".repeat(width * 2 + 1) + "+");
    }

    void detectCollision(int x, int y) {
        if (x == width || y == height || x < 0 || y < 0) {
            System.out.println("GAME OVER!");
            System.exit(0);
        }
    }
    void move(){
        while (true) {
            System.out.println("Masukkan perintah (w,a,s,d): ");
            System.out.println("w = atas, a = kiri, s = bawah, d = kanan");
            switch (sc.nextLine()) {
                case "s":
                    this.moveUp(1);
                    break;
                case "a":
                    this.moveLeft(1);
                    break;
                case "w":
                    this.moveDown(1);
                    break;
                case "d":
                    this.moveRight(1);
                    break;
                default:
                    
            }
            this.printPosition();
            this.detectCollision(x,y);
        }
    }

}
