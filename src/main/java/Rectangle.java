import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@Setter
@Getter
public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(Rectangle target){
        super(target);
        this.width = target.getWidth();
        this.height = target.getHeight();
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return super.toString() + "Type: Rectangle; Width: " + width + ", height: " + height;
    }
}
