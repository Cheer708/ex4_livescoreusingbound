/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescoreusingbound;

import java.util.Scanner;

/**
 *
 * @author AV01
 */
public class Livescoreusingbound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LiveScoreBean liveScoreBean = new LiveScoreBean();

        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");

        liveScoreBean.addPropertyChangeListener(subscriber1);
        liveScoreBean.addPropertyChangeListener(subscriber2);

        while (true) {
            System.out.print("Enter Score: ");
            String input = in.nextLine();
            if (input.isEmpty()) {
                break;
            }
            liveScoreBean.setScoreLine(input);
        }
        in.close();
    }
}
