

public class FileExist  {
	private String file;
	public FileExist(String file){
		super();
		this.file=file;
	}
		public boolean isFileExists(FileExist object){
			if (object.file==file)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
	  
	   
	  }

