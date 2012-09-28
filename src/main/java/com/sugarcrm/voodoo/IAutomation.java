package com.sugarcrm.voodoo;

import com.sugarcrm.voodoo.automation.VControl;


public interface IAutomation {
	
	public enum InterfaceType { FIREFOX, IE, CHROME, SAFARI; }
	public enum Strategy { CSS, XPATH, ID, NAME; }

	public void start(String url) throws Exception;
	public void stop() throws Exception;
	public VControl getControl(Strategy strategy, String hook) throws Exception;
	public String getText(VControl control) throws Exception;
	public String getText(Strategy strategy, String hook) throws Exception;
	public void hover(VControl control) throws Exception;
	public void hover(Strategy strategy, String hook) throws Exception;
	public void click(VControl control) throws Exception;
	public void click(Strategy strategy, String hook) throws Exception;
	public void rightClick(VControl control) throws Exception;
	public void rightClick(Strategy strategy, String hook) throws Exception;
	public void input(VControl control, String input) throws Exception;
	public void input(Strategy strategy, String hook, String input) throws Exception;
	public void pause(long ms) throws Exception;
	public void interact(String message) throws Exception;
	public void acceptDialog() throws Exception;
	public void switchToPopup() throws Exception;
}
