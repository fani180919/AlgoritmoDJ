import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.BorderLayout.*;


//import javax.swing.BorderFactory;

public class Gui extends JFrame{
    JPanel panelLog;
    
    JPanel panelSetup;
    
    JPanel panelEntrada;
    
    JPanel panelOptions;

    JButton addFilas;
    JButton runAlgo;

    JTextArea log;  

    JTextField rowValues;

    ADijkstra adijkstra;

    public Gui(){
        setTitle("Dijkstra's algorithm");
        setSize(500,400);
        setLocation(new Point(200,100));
        setLayout( new BorderLayout(3,3));
        
        //setLayout(new GridLayout(3,1));
        //setLayout(new BoxLayout(this.panelLog,BoxLayout.Y_AXIS));
        
        setResizable(true);


        adijkstra = new ADijkstra();

        initComponent();
        initEvent();

        initADijkstra();
    }

    private void initComponent(){
        this.panelLog = new JPanel();
        this.panelLog.setLayout(new BoxLayout(this.panelLog,BoxLayout.Y_AXIS));

        this.panelSetup = new JPanel();
        this.panelSetup.setLayout(new BoxLayout(this.panelSetup,BoxLayout.Y_AXIS));


        this.panelEntrada = new JPanel();
        this.panelEntrada.setLayout(new GridLayout(1, 2));

        this.panelOptions = new JPanel();

        this.log = new JTextArea("[ OK ] Start..................");  
        this.log.setForeground(Color.GREEN);
        this.log.setBackground(Color.black);

        
        this.addFilas = new JButton("Agregar valores"); 
        this.panelEntrada.add(addFilas);

        this.rowValues = new JTextField(300);
        this.panelEntrada.add(this.rowValues);

        this.runAlgo = new JButton("Ejecutar AlgoritmoDJ"); 
        this.panelOptions.add(runAlgo);


        this.panelLog.add(this.log);
        this.panelLog.setBorder( BorderFactory.createLineBorder(Color.black) );


        this.panelSetup.add(this.panelEntrada);
        this.panelSetup.add(this.panelOptions);
        
        this.add(this.panelLog,CENTER);
        this.add(this.panelSetup,SOUTH);

        //this.add(this.panelEntrada,CENTER);

        //this.add(this.panelOptions,SOUTH);
    }
    private void initADijkstra(){
        this.log.setText( this.adijkstra.getMessageInit() );
    }
    private void initEvent(){
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("[OK] Exit !!!");
                System.exit(1);
            }
        });

        addFilas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adijkstra.addVertex( rowValues.getText() );
                log.setText( adijkstra.getMessageInit() );
                log.append( adijkstra.getVertex() );
            }
          });


    }

}
