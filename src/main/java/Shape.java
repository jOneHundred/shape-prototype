import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
public abstract class Shape {
    private int x;
    private int y;

    public Shape(Shape target){
        if(target != null){
            this.x = target.getX();
            this.y = target.getY();
        }
    }

    public abstract Shape clone();

    @Override
    public String toString() {
        return "Position: x:" + x + ", y;" + y + "; ";
    }
}
