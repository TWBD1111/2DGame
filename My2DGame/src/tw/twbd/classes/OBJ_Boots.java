package tw.twbd.classes;


import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Boots extends SuperObject {
  public OBJ_Boots() {
    try {
      this.image = ImageIO.read(getClass().getResourceAsStream("/objects/boots.png"));
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
}
