package tw.twbd.classes;


import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Chest extends SuperObject {
  public OBJ_Chest() {
    try {
      this.image = ImageIO.read(getClass().getResourceAsStream("/objects/chest.png"));
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
}