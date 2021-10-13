import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame{
    JPanel panelImage;
    JPanel panelOptions;

    JButton runAlgo;

    public Gui(){
        setTitle("Dijkstra's algorithm");
        setSize(400,700);
        setLocation(new Point(200,100));
        setLayout(new GridLayout(2,2));
        setResizable(false);

        initComponent();
        initEvent();

    }

    private void initComponent(){
        this.panelImage = new JPanel();
        this.panelOptions = new JPanel();

        this.runAlgo = new JButton("Ejecutar AlgoritmoDJ"); 
        this.panelOptions.add(runAlgo);


        this.panelImage.add(new JLabel(new ImageIcon("./nodos.PNG")));

        this.add(this.panelImage);
        this.add(this.panelOptions);

    }

    private void initEvent(){
        this.addWindowListener(new WindowAdapter(){
            public void windowsClosing(WindowEvent e){
                System.out.println("[OK] Exit !!!");
                System.exit(1);
            }
        });
    }
}
