package lesson7.online;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private final int WIN_WIDTH = 500;
    private final int WIN_HEIGHT = 560;
    private final int WIN_POS_X = 450;
    private final int WIN_POS_Y = 100;

    private Settings settings;
    private GameMap gameMap;

    MainWindow() {

       /* Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int screenW = dimension.width;
        int screenH = dimension.height;*/

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POS_X, WIN_POS_Y);
 //       setLocation(screenW / 2 - WIN_WIDTH / 2, screenH / 2 - WIN_HEIGHT / 2);
        setTitle("Welcome, player!");
        setResizable(true);

        settings = new Settings(this);
        gameMap = new GameMap();

        JButton btnStart = new JButton("Start");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Exit");
                System.exit(0);
            }
        });

        JPanel panelForButtons = new JPanel();
        panelForButtons.setLayout(new GridLayout(1,2));
        panelForButtons.add(btnStart);
        panelForButtons.add(btnExit);

        add(panelForButtons, BorderLayout.SOUTH);
        add(gameMap);

//        add(btnStart, BorderLayout.SOUTH);
//        add(btnExit, BorderLayout.SOUTH);

/*        setLayout(new GridLayout(20, 15));
        for (int i = 0; i < 160; i++) {
            add(new JButton("Button # " + i));
        } */

        /*setLayout(new FlowLayout());
        for (int i = 0; i < 20; i++) {
            add(new JButton("Button # " + i));
        }*/

        setVisible(true);
    }

    void getUserSettingsAndStartGame(int gameMode, int gameMapSizeX, int gameMapSizeY, int winLength) {
        gameMap.startGame(gameMode, gameMapSizeX, gameMapSizeY, winLength);
    }
}
