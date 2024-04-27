import java.awt.*;

public class Pipe {
    private int posX;
    private int posY;
    private int width;
    private int height;
    private Image image;
    private int velocityX;
    boolean passed = false;
    boolean scoreCounted = false;

    public Pipe(int posX, int posY, int width, int height, Image image) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.image = image;

        this.velocityX = -5;
        this.passed = false;
    }

    // Setter
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setImage(Image image) {
        this.image = image;
    }
    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }
    public void setPassed(boolean passed) {
        this.passed = passed;
    }
    public void setScoreCounted(boolean scoreCounted) {
        this.scoreCounted = scoreCounted;
    }

    // Getter
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public Image getImage() {
        return image;
    }
    public int getVelocityX() {
        return velocityX;
    }
    public boolean getPassed() {
        return passed;
    }
    public boolean getScoreCounted() {
        return scoreCounted;
    }
}
