import infosClass.InfosInterface;
import infosClass.InfosXML;

//@Configuration
//@ComponentScan
public class MaConfig {
	//@Bean
	public InfosInterface infos() {
		return new InfosXML();
	}
}
