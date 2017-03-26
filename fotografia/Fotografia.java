package fotografia;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Fotografia extends JFrame implements ItemListener{

    JComboBox<String> c1;
    JLabel l1;
    ImageIcon[] img = {
    new ImageIcon(getClass().getResource("JB.gif")),   
  /*
        new ImageIcon(getClass().getResource("fotos/trump.gif")),   
    new ImageIcon(getClass().getResource("fotos/giphy.gif")),   
    new ImageIcon(getClass().getResource("fotos/kabum.gif")),   
    new ImageIcon(getClass().getResource("fotos/dedo.gif")),   
    new ImageIcon(getClass().getResource("fotos/cachorroPiscando.gif")),   
    new ImageIcon(getClass().getResource("fotos/armada.gif")),   
    new ImageIcon(getClass().getResource("fotos/SuperMan.gif")),   
    new ImageIcon(getClass().getResource("fotos/MagicaAriana.gif")),   
    new ImageIcon(getClass().getResource("fotos/MachoAlpha.gif")),   
 */  
    new ImageIcon(getClass().getResource("trump.gif")),   
    new ImageIcon(getClass().getResource("giphy.gif")),   
    new ImageIcon(getClass().getResource("kabum.gif")),   
    new ImageIcon(getClass().getResource("dedo.gif")),   
    new ImageIcon(getClass().getResource("cachorroPiscando.gif")),   
    new ImageIcon(getClass().getResource("armada.gif")),   
    new ImageIcon(getClass().getResource("SuperMan.gif")),   
    new ImageIcon(getClass().getResource("MagicaAriana.gif")),   
    new ImageIcon(getClass().getResource("MachoAlpha.gif")),
        };
    
    
    
public Fotografia(){
super("Album de fotos");
Container c = getContentPane();
c1 = new JComboBox<String>();
c1.setFont(new Font("Serif",Font.PLAIN,26));
c1.addItem("jb");
c1.addItem("trump");
c1.addItem("giphy");
c1.addItem("kabum");
c1.addItem("dedo");
c1.addItem("cachorroPiscando");
c1.addItem("armada");
c1.addItem("SuperMan");
c1.addItem("MagicaAriana");
c1.addItem("MachoAlpha");
c1.addItemListener(this);
l1=new JLabel(img[0]);  
c.add(BorderLayout.NORTH, c1);
c.add(BorderLayout.CENTER, l1);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setSize(300,530);
setVisible(true);

}
    
public static void main(String[] args) {
        new Fotografia();
//System.out.println("slo");    
}
    

public void itemStateChanged(ItemEvent e){
if(e.getStateChange()==ItemEvent.SELECTED)
    l1.setIcon(img[c1.getSelectedIndex()]);
}

}
