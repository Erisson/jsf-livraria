package br.com.erisson.livraria.bean;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TemaBean {
	private String tema = "aristo";

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public List<String> getTemas() {
		return Arrays.asList("aristo", "afterdark", "afternoon", "afterwork",
				"black-tie", "blitzer", "bluesky", "bootstrap", "casablanca",
				"cruze", "cupertino", "dark-hive", "dot-luv", "eggplant",
				"excite-bike", "flick", "glass-x", "home", "hot-sneaks",
				"humanity", "le-frog", "midnight", "mint-choc", "overcast",
				"pepper-grinder", "redmond", "rocket", "sam", "smoothness",
				"south-street", "start", "sunny", "swanky-purse", "trontastic",
				"ui-darkness", "ui-lightness", "vader");

	}
}
