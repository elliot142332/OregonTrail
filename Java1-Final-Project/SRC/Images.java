import javax.swing.*;//imports the needed tools for Swing
import java.awt.*;
public class Images{
  private static JFrame frame;//sets JFrame frame as variable
  //methods that put inmages and title into the Image method
  public static void startScreen(){
    Image("/home/elliotberney/Projects/Java1-Final-Project/images/Oregon_Trail_Start_Screen.jpeg","Start Screen");
  }
  public static void hunt(){
    Image("/home/elliotberney/Projects/Java1-Final-Project/images/chap15-IBM-hunting.png","Hunting");
  }
  public static void traveling(){
    Image("/home/elliotberney/Projects/Java1-Final-Project/images/Travel.jpeg","Traveling");
  }
  public static void finishScreen(){
    Image("/home/elliotberney/Projects/Java1-Final-Project/images/you-made-it.png","You made it!");
  }


  //Method for settings on the images
  public static void Image(String path, String title){
    if(frame != null){//closes the previous frame
      frame.dispose();
    }
    frame = new JFrame(title);//creates window with the title
    frame.setSize(500,400);//sets size
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//sets the close behavior
    frame.setAlwaysOnTop(true);//forces window to stay on the top of others
    frame.setFocusableWindowState(false);//shows window without taking the focus

    ImageIcon icon = new ImageIcon(path);//loads image from the files
    Image img = icon.getImage();//gets image icon
    Image scaledImg = img.getScaledInstance(500,400, Image.SCALE_SMOOTH);//resizes image and makes less pixelated
    icon = new ImageIcon(scaledImg);//puts image back into ImageIcon
    JLabel label = new JLabel(icon);//display image in window
    frame.add(label);//adds the label

    Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();//gets screen resolution
    int x = ScreenSize.width - frame.getWidth() - 50;//sets the frame to the top left of screen
    int y = 100;
    frame.setLocation(x,y);

    frame.setVisible(true);//makes window appear on the screen
  }

}
