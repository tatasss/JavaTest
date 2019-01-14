package infosClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"generateur.GenerateurInfo", "Principale.Main"})
public class MaFabirque {
	// "infos " -> "new projet.infosXML()"
	@Bean
	public InfosInterface infos() {
		return new InfosXML();
	}
}
