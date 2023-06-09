import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int Spieler =1;
        char[] SpielFeld = new char[9];
        Scanner Eingabe = new Scanner(System.in);
        int Tip;
        boolean nochmal;
        boolean hatGewonnen = false;

        for(int i =0;i <9 ; i++)
        {
            SpielFeld[i]=' ';
        }

        for(int i=0; i<9 ; i+=3)
        {
            System.out.println(SpielFeld[i] + "|" + SpielFeld[i+1]+ "|" + SpielFeld[i+2]);
            if(i<6)
            {
                System.out.println("-+-+-");
            }
        }

        while(!hatGewonnen)
        {
            nochmal = false;
            System.out.println("Spieler " + Spieler + " mache deinen Zug. ");
            Tip = Eingabe.nextInt();
            Tip--; // Spieler Eingabe wird hier mit dem Index vereint 1 -> [0] ; 2-> [1]
            if(SpielFeld[Tip] == ' ' && Spieler == 1)
            {
                SpielFeld[Tip]= 'x';
            }
            else if(SpielFeld[Tip] == ' ' && Spieler == 2)
            {
                SpielFeld[Tip]= 'o';
            }
            else
            {
                System.out.println("Hallo du Dau Spieler "+Spieler +". da steht schon was drin!");
                nochmal=true;
            }



            // Prüfung waagerecht
            for(int i =0;i <9 ; i+=3)
            {
                if (SpielFeld[i] != ' ' && SpielFeld[i] == SpielFeld[i+1] && SpielFeld[i+1] == SpielFeld[i+2])
                {
                    hatGewonnen = true;
                }
            }

            // Prüfung senkrecht
            for(int i =0; i < 3; i++)
            {
                if (SpielFeld[i] != ' ' && SpielFeld[i] == SpielFeld[i+3] && SpielFeld[i+3] == SpielFeld[i+6])
                {
                    hatGewonnen = true;
                }
            }

            // Prüfung Diagonal
            if (SpielFeld[0] != ' ' && SpielFeld[0] == SpielFeld[4] && SpielFeld[4] == SpielFeld[8])
            {
                hatGewonnen = true;
            }
            if (SpielFeld[2] != ' ' && SpielFeld[2] == SpielFeld[4] && SpielFeld[4] == SpielFeld[6])
            {
                hatGewonnen = true;
            }

            if(!nochmal)
            {
                if(Spieler==1)
                    Spieler =2;
                else
                    Spieler = 1;
            }

            for(int i=0; i<9 ; i+=3)
            {
                System.out.println(SpielFeld[i] + "|" + SpielFeld[i+1]+ "|" + SpielFeld[i+2]);
                if(i<6)
                {
                    System.out.println("-+-+-");
                }
            }

            // Prüfung waagerecht
            for(int i =0;i <9 ; i+=3)
            {
                if (SpielFeld[i] != ' ' && SpielFeld[i] == SpielFeld[i+1] && SpielFeld[i+1] == SpielFeld[i+2])
                {
                    hatGewonnen = true;
                }
            }

            // Prüfung waagerecht
            for(int i =0; i < 3; i++)
            {
                if (SpielFeld[i] != ' ' && SpielFeld[i] == SpielFeld[i+3] && SpielFeld[i+3] == SpielFeld[i+6])
                {
                    hatGewonnen = true;
                }
            }

            // Prüfung Diagonal
            if (SpielFeld[0] != ' ' && SpielFeld[0] == SpielFeld[4] && SpielFeld[4] == SpielFeld[8])
            {
                hatGewonnen = true;
            }
            if (SpielFeld[2] != ' ' && SpielFeld[2] == SpielFeld[4] && SpielFeld[4] == SpielFeld[6])
            {
                hatGewonnen = true;
            }
        }
    }
}