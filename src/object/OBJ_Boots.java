package object;
import entity.Entity;
import main.GamePanel;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Boots extends Entity
{
    public OBJ_Boots(GamePanel gp)
    {
        super(gp);
        name = "Boots";
        down1 = setup("/objects/boots");
    }
}
