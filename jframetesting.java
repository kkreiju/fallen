package guitesting;

import javax.swing.*;
import java.io.*;
import javax.sound.sampled.*;

public class jframetesting {
    public static void main(String[] args) {
        JFrame window = new JFrame("Fallen");
        // music
        try {
            File music = new File("guitesting\\fallen.wav");
            AudioInputStream audiostream = AudioSystem.getAudioInputStream(music);
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);
            clip.start();
        } catch (Exception e) {
            System.out.println(e);
        }

        // size
        final int width = 600; // horizontal
        final int height = 200; // vertical

        //remove console texts
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print('\u000C');
        System.out.println("Fallen Lyrics");

        // Settings
        window.setSize(width, height);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        // text
        JLabel textlyrics = new JLabel("Fallen - Lola Amour", 0);

        window.add(textlyrics);
        try {
            Thread.sleep(17800);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("title exit");
        }
        window.remove(textlyrics);
        window.repaint();

        try {
            Thread.sleep(900);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("show lyrics");
        }
        window.add(textlyrics);
        window.repaint();

        try {
            textlyrics.setText("What if I told you that I've fallen?");
            Thread.sleep(4700);
            textlyrics.setText("And I like the way you say my name?");
            Thread.sleep(4700);
            textlyrics.setText("My heart skips a beat when I hear you calling");
            Thread.sleep(4700);
            textlyrics.setText("And I like that it won't go away");
            Thread.sleep(5850);
            textlyrics.setText("But never mind");
            Thread.sleep(3550);
            textlyrics.setText("Don't wanna give you any trouble");
            Thread.sleep(1950);
            textlyrics.setText("Never mind");
            Thread.sleep(5000);
            textlyrics.setText("I'm okay with being by your side");
            Thread.sleep(3100);
            textlyrics.setText("For as long as I can hide");
            Thread.sleep(2900);
            textlyrics.setText("What if I told you that I've fallen?");
            Thread.sleep(3100);
            window.remove(textlyrics);
            window.repaint();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            System.out.println("Program end.");
            System.exit(0);
        }
    }
}