package composite;

import java.util.ArrayList;
import java.util.List;

public interface File {
	void kill();
}

class TextFile implements File{

	@Override
	public void kill() {
		System.out.println("文本文件正在查杀");	
	}
}
class ImageFile implements File{

	@Override
	public void kill() {
		System.out.println("图像文件正在查杀");	
	}
}
class VideoFile implements File{

	@Override
	public void kill() {
		System.out.println("视频文件正在查杀");	
	}
}
class Folder implements File{

	private List<File> list = new ArrayList<File>();
	
	@Override
	public void kill() {
		System.out.println("文件夹正在查杀");
		for(File file : list) {
			file.kill();
		}
		
	}
	
	public void add(File f) {
		list.add(f);
	}
	public void remove(File f) {
		list.remove(f);
	}
	
	
}