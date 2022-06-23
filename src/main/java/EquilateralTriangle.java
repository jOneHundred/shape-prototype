import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor
@Setter
@Getter
public class EquilateralTriangle extends Shape{

    private int side;

    public EquilateralTriangle(EquilateralTriangle target){
        super(target);
        this.side = target.getSide();
    }
    @Override
    public Shape clone() {
        return new EquilateralTriangle(this);
    }

    @Override
    public String toString() {
        return super.toString() + "Type: Equilateral triangle; Side: " + side;
    }
}
