import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setX(1);
        circle.setY(2);
        circle.setRadius(3);
        log.info(circle.toString());

        Circle circleCopy = (Circle) circle.clone();
        log.info(circleCopy.toString());
    }
}
