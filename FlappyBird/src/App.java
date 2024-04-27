import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        // Buat frame untuk form awal
        JFrame startFrame = new JFrame("Flappy Bird - Start");
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setSize(400, 200);
        startFrame.setLocationRelativeTo(null);
        startFrame.setResizable(false);

        // Buat panel untuk form awal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        startFrame.add(panel);

        // Muat dan tambahkan gambar judul
        ImageIcon titleIcon = new ImageIcon(App.class.getResource("/assets/flappyLogo.png"));
        JLabel titleLabel = new JLabel(titleIcon);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(titleLabel);

        // Buat tombol mulai
        JButton startButton = new JButton("Start Game");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tutup form awal
                startFrame.dispose();

                // Buat frame permainan
                JFrame gameFrame = new JFrame("Flappy Bird");
                gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gameFrame.setSize(360, 640);
                gameFrame.setLocationRelativeTo(null);
                gameFrame.setResizable(false);

                // Buat panel permainan
                FlappyBird flappyBird = new FlappyBird();
                gameFrame.add(flappyBird);
                gameFrame.pack();
                flappyBird.requestFocus();
                gameFrame.setVisible(true);
            }
        });

        // Tambahkan beberapa spasi antara gambar judul dan tombol mulai
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Tambahkan tombol mulai ke panel
        panel.add(startButton);

        // Tampilkan form awal
        startFrame.setVisible(true);
    }
}
