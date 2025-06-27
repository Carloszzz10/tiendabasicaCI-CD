import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class EnvChecker {

  @PostConstruct
  public void check() {
    System.out.println(">>>> SPRING_DATASOURCE_URL      = " + System.getenv("SPRING_DATASOURCE_URL"));
    System.out.println(">>>> SPRING_DATASOURCE_USERNAME = " + System.getenv("SPRING_DATASOURCE_USERNAME"));
    System.out.println(">>>> SPRING_DATASOURCE_PASSWORD = " + (System.getenv("SPRING_DATASOURCE_PASSWORD") != null ? "***SET***" : null));
  }
}
