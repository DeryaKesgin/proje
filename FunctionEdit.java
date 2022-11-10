package undoredo;

public class Function_Edit {
  GUİ gui;


    public Function_Edit(GUİ gui) {
	   this.gui=gui;
}
    
    public void undo() {
    	 
    	gui.um.undo();
    }
    
    public void redo() {
    	
    	gui.um.redo();
    }



}
