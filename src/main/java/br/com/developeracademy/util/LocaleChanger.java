package br.com.developeracademy.util;

import java.io.Serializable;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "lc")
@SessionScoped
public class LocaleChanger implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String actionPortugues() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(new Locale("pt", "BR"));
		return null;
	}
	
	public String actionIngles() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(Locale.ENGLISH);
		return null;
	}
	
	public String actionFrance() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(Locale.FRANCE);
		return null;
	}

}
