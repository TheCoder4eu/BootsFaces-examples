package net.bootsfaces.demo;

import java.io.Serializable;

import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;

 @Named
@SessionScoped
public class DefaultValuesBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private boolean renderLabel=false;

	public boolean isRenderLabel() {
		return renderLabel;
	}

	public void setRenderLabel(boolean renderLabel) {
		this.renderLabel = renderLabel;
	}
	
	public void toggleRenderLabel() {
		renderLabel=!renderLabel;
	}
}
