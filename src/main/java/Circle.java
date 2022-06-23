import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@Setter
@Getter
public class Circle extends Shape{
    private int radius;

    public Circle(Circle target){
        super(target);
        this.radius = target.getRadius();
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return super.toString() + "Type: Circle; Radius: " + radius;
    }
}
